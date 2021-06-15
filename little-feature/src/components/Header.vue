<template>
  <header>
    <h1>{{ title }}</h1>
    <Button text="Hinzufuegen" color="green"></Button>

  </header>
</template>

<script>
import Button from "@/components/Button";
export default {
  name: 'Header',
  components: {Button},
  props: {
    title: {
      type: String,
      default: 'hello world',
    },
  },
}

</script>

<style scoped>
header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-bottom: 20px;
}

</style>