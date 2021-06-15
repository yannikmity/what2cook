<template>

</template>

<script>
export default {
  data() {
    return {
      msg: ''
    }
  },
  mounted() {
    fetch("https://www.themealdb.com/api/json/v1/1/random.php")
    const createMeal = meal => {
        const ingreAndMeasure = [];
        for (let i = 1; i <= 20; i++) {
          if (meal[`trIngredient${i}`]) {
            ingreAndMeasure.push(`${meal[`strIngredient${i}`]} - ${meal}[``trMeasure${i}']}`);

          } else {
            break;
          }
        }
    }
  }
}
</script>

<style scoped>

</style>