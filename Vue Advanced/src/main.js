import { createApp } from 'vue'
import App from './App.vue'
import { createStore } from 'vuex'

import {router} from "./router/index"

const store = createStore({
    state () {
      return {
        todoList: [{
            id:0,
            name: "todo1",
          }]
      }
    },
    mutations: {
      addTodo (state, todo) {
        state.todoList.push({id: state.todoList.length - 1, name: todo})
      }
    }
  })

createApp(App).use(router).use(store).mount('#app')
