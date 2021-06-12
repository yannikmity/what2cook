<template>

</template>
<!--hier schreiben wir das Datenmodell für unser Rezept rein-->
<script>
export default {
  props: {
    idMeal: {
      type: String,
      requierd: true
    },
    nameMeal: {
      type: String,
      requierd: true
    },
    drinkAlternate: {
      type: String,
      requierd: false
    },
    category: {
      type: String,
      requierd: true
    },
    area: {
      type: String,
      requierd: false,
    },
    instruction: {
      type: String,
      requierd: true;
    },
    linkMealPic: {
      type: String,
      requierd: false;
    },
    linkYouTube: {
      type: String,
      requierd false;
    } ,
    //wie können wir hier eine Liste an Ingr speichern? Ein Array?
    listIngre: {
      type: String[],

    }

  },
}
</script>

<style scoped>

</style>