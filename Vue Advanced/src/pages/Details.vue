<template>
  <div>
      Details: <br>
      <br/>
      todo's name: 
    {{$route.params.todo}}
    <br>
    <button @click="quit">go back</button>
  </div>
</template>
<script>
export default {
    props: ["todo"],
  data() {
    return {
     
    };
  },
  methods:{
      quit(){
          this.$router.push({name:'main'})
      }
  }
};
</script>
