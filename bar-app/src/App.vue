<template>
  <router-view />
</template>

<script lang="ts">
import { defineComponent } from 'vue';
import router from './router'; 

export default defineComponent({
  name: 'App',
  setup() {
    return { router };
  },
});
</script>