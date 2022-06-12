import Todo from "../pages/Todo"
import Details from "../pages/Details"
import Add from "../pages/Add"

import { createRouter, createWebHashHistory } from "vue-router";

const routes = [
    {
        path: '/',
        name: 'main',
        component: Todo,
        props: true 
      },
      {
        path: '/add',
        name: 'add',
        component: Add
      },  {
        path: '/details/:id',
        name: 'details',
        component: Details
      }

  ]

  const router = createRouter({
    history: createWebHashHistory(),
    routes,
  });

  export {router};