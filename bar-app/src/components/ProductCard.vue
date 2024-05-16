<template>
    <div class="product-card" v-if="cocktailImage">
        <img class="CardImg" :src="cocktailImage" alt="">
        <h2 class="cardTitle">{{ cocktail.nom_cocktail }}</h2>
        <div class="categorieChip">
            <p class="categorie">{{ cocktail.categorie_cocktail }}</p>
        </div>
        <p class="prix">{{ cocktail.prixS_cocktail }}€</p>
        <img class="ajouterPanier" src="../assets/picto/add.svg" alt="Ajouter au panier">
    </div>
</template>

<script>
import { defineComponent, ref } from 'vue';

export default defineComponent({
    name: 'ProductCard',
    props: {
        cocktail: {
            type: Object,
            required: true
        }
    },
    async setup(props) {
        const cocktailImage = ref(null);
        try {
            const imageModule = await import(`../assets/cocktail/${props.cocktail.id_cocktail}.webp`);
            cocktailImage.value = imageModule.default;
        } catch (error) {
            console.error('Failed to load image', error);
        }
        return { cocktailImage };
    }
});
</script>


<style scoped>
.product-card {
    width: 325px;
    height: 99px;
    background-color: white;
    display: flex;
    position: relative;
    flex-direction: column;
    border-radius: 5px;
    outline: 2px solid #666666;
    box-shadow: 1px 5px 7px -6px rgba(30, 30, 30, 0.65);
    cursor: pointer;
}

.CardImg {
    margin: 10px;
    height: 79px;
    width: 70px;
    background-color: red;
}

.cardTitle {
    position: absolute;
    top: 0%;
    left: 30%;
    margin-top: 10px;
    font-size: 20px;
    font-weight: 700;
}

.prix {
    position: absolute;
    top: 0;
    right: 0;
    margin: 10px 10px 0 0;
    font-size: 18px;
    font-weight: 700;
}

.categorieChip {
    width: fit-content;
    height: auto;
    padding: 5px;
    margin: 0 0 10px 0;
    background-color: #EAEAEA;
    border-radius: 100px;
    position: absolute;
    bottom: 0;
    left: 30%;
    font-family:
        Inter,
        sans-serif;
    font-size: 14px;
}



.ajouterPanier {
    position: absolute;
    bottom: 0;
    right: 0;
    margin: 0 7px 10px 0;
}
</style>