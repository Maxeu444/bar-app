<template>
    <div id="nav">
        <a id="back" href="/"><img  src="../assets/picto/chevronLeft.svg" alt="Retour Homepage"></a>
        <img id="logo" src="../assets/logoApp.svg" alt="Logo">
    </div>
</template>


<script>
export default {
    name: 'NavBar',
}
</script>

<style scoped>
#nav {
    height: 75px;
    width: 100vw;
    background-color: white;
    display: flex;
    justify-content: center;
    align-items: center;
    box-shadow: 1px 4px 7px rgba(0, 0, 0, 0.070);
}

#logo{ 
    height: 55px !important;
}

#back {
    position: absolute;
    left: 25px;
}

</style>