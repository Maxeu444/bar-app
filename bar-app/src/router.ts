import type { RouteRecordRaw } from 'vue-router';
import { createRouter, createWebHistory } from 'vue-router';
import HomePage from './views/HomePage.vue';

const routes: Array<RouteRecordRaw> = [
    {
        path: '/',
        name: 'Accueil',
        component: HomePage,
    },

];

const router = createRouter({
    history: createWebHistory(),
    routes,
  });

export default router;
