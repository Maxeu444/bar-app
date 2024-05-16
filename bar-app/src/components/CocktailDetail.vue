<template>
    <div class="bloc-modale-coDe" v-if="revele">
        <div class="overlay" v-on:click="toggleModale"></div>

        <div class="modale card">
            <div v-on:click="toggleModale" class="btn-modale">X</div>
            <h2 class="modaleTitle">Ajouter au panier</h2>

            <div class="card">
                <img class="CardImg" :src="cocktailImage" alt="">
                <h2 class="cardTitle">{{ cocktail }}</h2>
            </div>
        </div>
    </div>
</template>

<script lang="ts">

export default {
  props: {
    revele: {
      type: Boolean,
      required: true
    },
    close: {
      type: Function,
      required: true
    }
  },
  methods: {
    toggleModale() {
      this.close();
    }
  }
}
</script>

<style scoped>
.bloc-modale-coDe {
  position: fixed;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  display: flex;
  justify-content: center;
  align-items: center;
}

.overlay {
  background: rgba(0, 0, 0, 0.5);
  position: fixed;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
}

.modale {
  background: #f1f1f1;
  color: #333;
  padding: 50px;
  position: fixed;
  top: 30%;
}

.btn-modale {
  position: absolute;
  top: 10px;
  right: 20px;
  cursor: pointer;
  font-size: 20px;
}

.card{
    width: 280px;
    border-radius: 20px;
    background-color: #F8F8F8;
    display: flex;
    justify-content: center;
}

.modaleTitle{
    text-align: center;
    font-size: 20px;
    font-weight: 500;
    margin: 10px;
}
</style>