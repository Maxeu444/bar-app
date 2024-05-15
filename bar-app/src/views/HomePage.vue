

<template>
    <div id="container">
      <div id="content">
        <img id="logo" src="../assets/logoApp.png" alt="Logo">
        <div id="btn">
          <button>Voir la carte</button>
          <button>Suivre ma commande</button>
        </div>

        <p id="loginBarman">Connexion barman</p>
        
      </div>
    </div>
  </template>
  
  <script lang="ts">
  import { defineComponent } from 'vue';
  
  export default defineComponent({
    name: 'HomePage',

  });
  </script>
  
  <style scoped>
  #container {
    height: 100vh;
    width: 100vw;
    background-color: #439AE8;
  }

  #content {
    display: flex;
    flex-direction: column;
    align-items: center;
    height: 100%;
  }

  #logo {
    height: 100px;
    margin-top: 3%;
  }

  #btn {
    position: absolute;
    bottom: 35%;
    display: flex;
    flex-direction: column;
    gap: 20px;
  }

  #btn button{
    width: 200px;
    height: 65px;
    background-color: white;
    border: none;
    border-radius: 30px;
    color: #000000;
    font-size: 16px;
  }

  #btn button:hover {
    background-color: #F2F2F2;
    cursor: pointer;
  }

  #loginBarman {
    position: absolute;
    bottom: 2%;
    color: white;
    font-size: 16px;
    text-decoration-line: underline;
    text-underline-offset: 5px;
    cursor: pointer;
  }

  </style>
  