const app = Vue.createApp({

    data() {
        return {
            strMeal: '',
            strCategory: '',
            strArea: '',
            zutatenListe: [], //List strIngredientX - strMeasureX
            strMealThumb: '',
            strInstructions: '',
        }
    },
    methods: {
        async getRezept() {
            const res = await fetch('https://www.themealdb.com/api/json/v1/1/random.php')
            const { meals }  = await res.json()

            this.zutatenListe = []

            for(let i =1; i <21; i ++){

                if (meals[0]['strIngredient'+i] !== '')
                this.zutatenListe.push(  {
                    ingredient: meals[0]['strIngredient'+i],
                    measure: meals[0]['strMeasure'+i]
                })
            }
            this.strMeal = meals[0].strMeal;
            this.strCategory = meals[0].strMeal;
            this.strArea = meals[0].strArea;
            this.strMealThumb = meals[0].strMealThumb;
            this.strInstructions = meals[0].strInstructions;
        },
    },
})

app.mount('#rezeptApp');