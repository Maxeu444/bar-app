import type { RouteRecordRaw } from 'vue-router';
import { createRouter, createWebHistory } from 'vue-router';
import HomePage from './views/HomePage.vue';
import CarteClient from './views/CarteClient.vue';

const routes: Array<RouteRecordRaw> = [
    {
        path: '/',
        name: 'Accueil',
        component: HomePage,
    },
    {
        path: '/carte',
        name: 'Carte',
        component: CarteClient,
    }

];

const router = createRouter({
    history: createWebHistory(),
    routes,
  });

export default router;
