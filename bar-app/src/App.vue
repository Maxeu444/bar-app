<template>
  <router-view />
</template>

<script lang="ts">
import { defineComponent } from 'vue';
import router from './router'; // Assurez-vous du chemin correct vers votre fichier de configuration de routage

export default defineComponent({
  name: 'App',
  setup() {
    return { router };
  },
});
</script>./router/router