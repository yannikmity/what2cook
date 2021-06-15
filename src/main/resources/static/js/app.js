const app = Vue.createApp({

    data() {
        return {
            strMeal: '',
            strCategory: '',
            strArea: '',
            strMealThumb: '',
            strIngredient1: '',
            strMeasure1: '',
            strIngredient2: '',
            strMeasure2: '',
            strIngredient3: '',
            strMeasure3: '',
            strIngredient4: '',
            strMeasure4: '',
            strIngredient5: '',
            strMeasure5: '',
            strIngredient6: '',
            strMeasure6: '',
            strIngredient7: '',
            strMeasure7: '',
            strIngredient8: '',
            strMeasure8: '',
            strIngredient9: '',
            strMeasure9: '',
            strIngredient10: '',
            strMeasure10: '',
            strIngredient11: '',
            strMeasure11: '',
            strIngredient12: '',
            strMeasure12: '',
            strIngredient13: '',
            strMeasure13: '',
            strIngredient14: '',
            strMeasure14: '',
            strIngredient15: '',
            strMeasure15: '',
            strIngredient16: '',
            strMeasure16: '',
            strIngredient17: '',
            strMeasure17: '',
            strIngredient18: '',
            strMeasure18: '',
            strIngredient19: '',
            strMeasure19: '',
            strIngredient20: '',
            strMeasure20: '',

        }
    },
    methods: {
        async getRezept() {
            const res = await fetch('https://www.themealdb.com/api/json/v1/1/random.php')
            const { meals }  = await res.json()

            console.log(meals)

            this.strMeal = meals[0].strMeal
            this.strCategory = meals[0].strMeal
            this.strArea = meals[0].strArea
            this.strMealThumb = meals[0].strMealThumb
            this.strIngredient1 = meals[0].strIngredient1
            this.strMeasure1 = meals[0].strMeasure1
            this.strIngredient2 = meals[0].strIngredient2
            this.strMeasure2 = meals[0].strMeasure2
            this.strIngredient3 = meals[0].strIngredient3
            this.strMeasure3 = meals[0].strMeasure3
            this.strIngredient4 = meals[0].strIngredient4
            this.strMeasure4 = meals[0].strMeasure4
            this.strIngredient5 = meals[0].strIngredient5
            this.strMeasure5 = meals[0].strMeasure5
            this.strIngredient6 = meals[0].strIngredient6
            this.strMeasure6 = meals[0].strMeasure6
            this.strIngredient7 = meals[0].strIngredient7
            this.strMeasure7 = meals[0].strMeasure7
            this.strIngredient8 = meals[0].strIngredient8
            this.strMeasure8 = meals[0].strMeasure8
            this.strIngredient9 = meals[0].strIngredient9
            this.strMeasure9 = meals[0].strMeasure9
            this.strIngredient10 = meals[0].strIngredient10
            this.strMeasure10 = meals[0].strMeasure10
            this.strIngredient11 = meals[0].strIngredient11
            this.strMeasure11 = meals[0].strMeasure11
            this.strIngredient12 = meals[0].strIngredient12
            this.strMeasure12 = meals[0].strMeasure12
            this.strIngredient13 = meals[0].strIngredient13
            this.strMeasure13 = meals[0].strMeasure13
            this.strIngredient14 = meals[0].strIngredient14
            this.strMeasure14 = meals[0].strMeasure14
            this.strIngredient15 = meals[0].strIngredient15
            this.strMeasure15 = meals[0].strMeasure15
            this.strIngredient16 = meals[0].strIngredient16
            this.strMeasure16 = meals[0].strMeasure16
            this.strIngredient17 = meals[0].strIngredient17
            this.strMeasure17 = meals[0].strMeasure17
            this.strIngredient18 = meals[0].strIngredient18
            this.strMeasure18 = meals[0].strMeasure18
            this.strIngredient19 = meals[0].strIngredient19
            this.strMeasure19 = meals[0].strMeasure19
            this.strIngredient20 = meals[0].strIngredient20
            this.strMeasure20 = meals[0].strMeasure20
        },
    },
})

app.mount('#app')