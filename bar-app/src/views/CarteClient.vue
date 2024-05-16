<template>
  <Suspense>
    <template #default>
      <div id="container">
        <NavBar />
        <div id="content">

          <div v-for="item in items" :key="item.id_carte">
            <h1 class="CarteTitle">{{ item.nom_carte }}</h1>
            <div class="parent">
              <ProductCard v-on:click="toggleModale" v-for="cocktail in item.cocktails" :key="cocktail.id_cocktail"
                :cocktail="cocktail" />
            </div>
            <div id="cart">
              <img src="../assets/picto/cart.svg" alt="Carte" />
            </div>
            <CocktailDetail :revele="revele" :close="toggleModale"></CocktailDetail>
          </div>

        </div>
      </div>
    </template>
    <template #fallback>
      <div>Loading...</div>
    </template>
  </Suspense>
</template>

<script lang="ts">
import { defineComponent } from 'vue';
import NavBar from '@/components/NavBar.vue';
import ProductCard from '@/components/ProductCard.vue';
import axios from 'axios';
import CocktailDetail from '@/components/CocktailDetail.vue';

export default defineComponent({
  components: {
    NavBar,
    ProductCard,
    CocktailDetail
  },
  data() {
    return {
      items: [] as Array<{ id_carte: number, nom_carte: string }>,
      revele: false
    };
  },
  created() {
    this.fetchItems();
  },
  props: ['cocktail', 'cocktailImage'],
  methods: {
    fetchItems() {
      axios.get('/carte/read')
        .then(response => {
          this.items = response.data;
        })
        .catch(error => {
          console.log(error);
        });
    },
    toggleModale() {
    this.revele = !this.revele;
  }
  }
});
</script>


<style scoped>
#content {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  height: 100%;
  margin-top: 30px;
}

.parent {
  margin: 25px;
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  grid-auto-rows: minmax(100px, auto);
  grid-column-gap: 20px;
  grid-row-gap: 20px;
  grid-auto-flow: dense;
}

.CarteTitle {
  margin: 20px;
}

#cart {
  width: 75px;
  height: 75px;
  background-color: #FBB03B;
  border-radius: 100%;
  position: fixed;
  bottom: 5%;
  right: 2%;
  display: flex;
  padding: 12px;
}


@media (max-width: 768px) {
  .parent {
    grid-template-columns: 1fr;
  }
}
</style>