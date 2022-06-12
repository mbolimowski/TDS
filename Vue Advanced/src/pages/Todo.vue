<template>
  <div>
    <router-link to="add">Add todo</router-link>
    <br/>
    <br/>
    <div>Todos:</div>
    
    <br/>
    <div v-for="todo in $store.state.todoList"
    :key="todo.id">
    
    <router-link :to= "{name: 'details' , params:{id: todo.id, todo: todo.name}}">
      {{todo.name}}
    </router-link>
    </div>

  <br><br>

    <div>
      <button @click="getApiData">
        Get API Data 
     
      </button>
       <div v-for="(todo) in apiTodoList"
    :key="todo.id">
  {{todo.title}} - 
  <span v-if="todo.completed">completed</span><span v-else>not completed</span>
    </div>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      apiTodoList: [],
    };
  },
  methods:{
    getApiData(){
      fetch('https://jsonplaceholder.typicode.com/todos')
  .then(response => response.json())
  .then(json => this.apiTodoList = json)
    }
  },
  mounted(){
    
  },
  beforeRouteEnter (to, from, next) {
  next(vm => {
    if(to.params.newTodoName){
      console.log(vm)
    vm.$store.commit("addTodo",to.params.newTodoName)
    }
  })
}
};
</script>

