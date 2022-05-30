<template>
    <div>
        <div>USD: {{usd}}</div>
        <div>EUR: {{eur}}</div>
    </div>
</template>
<script>
import axios from 'axios';
export default {
    name: 'Currency',
	data(){
		return{
			eur:0,
            usd: 0,
		}
	},
    methods: {
        async getData() {
			await axios
			.get("https://api.nbp.pl/api/exchangerates/tables/A")
			.then(response => {
                response.data[0].rates.forEach(e => {
                    if(e.code == "USD"){
                        this.usd = e.mid
                    }
                    else if(e.code=="EUR"){
                        this.eur = e.mid
                    }});
        });
        }
    },
  mounted(){
    this.getData();
  }
}
</script>