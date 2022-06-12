<template>
  <div>
    <form>
      <input v-model="todo.name" /><br><br>
      <button @click="validate">Add</button>
    </form>

    <br/>
    <div v-show="!valid">Empty name</div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      todo: {
        name: null,
        checked: false,
      },
      valid: true,
    };
  },
  methods: {
    validate() {
      this.valid = true;
      if (this.todo.name != null) {
        this.$router.push({name:'main', params:{newTodoName: this.todo.name}})
      } else {
        this.valid = false;
        setTimeout(() => {
          this.valid = true;
        }, 3000);
      }
    },
  },
};
</script>
