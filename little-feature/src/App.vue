<template>
  <div class="container">
    <Header title="Einkaufsliste"/>
    <Zutaten
        @toggle-needed="toggleNeeded"
           @delete-zutat="deleteZutat"
           :zutaten="zutaten"/>
  </div>
</template>

<script>
import Header from './components/Header';
import Zutaten from './components/Zutaten';


export default {
  name: 'App',
  components: {
    Zutaten,
    Header,
  },

  data() {
    return {
      zutaten: []
    }
  },
  methods: {
    deleteZutat(id) {
      if (confirm('Are you sure?')) {
        this.zutaten = this.zutaten.filter((zutat) => zutat.id !== id)
      }
    },
    toggleNeeded(id) {
      console.log(id)
      this.zutaten = this.zutaten.map((zutat) =>
          zutat.id === id ? {...zutat, needed: !zutat.needed} : zutat
      )
    },
  },
  created() {
    this.zutaten = [
      {
        id: 1,
        text: 'Gurke',
        measure: '2 Stk.',
        needed: true,
      },
      {
        id: 2,
        text: 'Gurke',
        measure: '2 Stk.',
        needed: true,
      },
      {
        id: 3,
        text: 'Aubergine',
        measure: '2 Stk.',
        needed: false,
      },
    ]
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400&display=swap');
* {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}
body {
  font-family: 'Poppins', sans-serif;
}
.container {
  max-width: 500px;
  margin: 30px auto;
  overflow: auto;
  min-height: 300px;
  border: 1px solid steelblue;
  padding: 30px;
  border-radius: 5px;
}
.btn {
  display: inline-block;
  background: #000;
  color: #fff;
  border: none;
  padding: 10px 20px;
  margin: 5px;
  border-radius: 5px;
  cursor: pointer;
  text-decoration: none;
  font-size: 15px;
  font-family: inherit;
}
.btn:focus {
  outline: none;
}
.btn:active {
  transform: scale(0.98);
}
.btn-block {
  display: block;
  width: 100%;
}
</style>
