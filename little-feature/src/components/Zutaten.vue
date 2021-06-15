<template>
  <div :key="zutat.id" v-for="zutat in zutaten">
    <Zutat
        @toggle-needed="$emit('toggle-needed', zutat.id)"
        @delete-zutat="$emit('delete-zutat', zutat.id)"
        :zutat="zutat"
    />
  </div>

</template>

<script>
import Zutat from "@/components/Zutat";

export default {
  name: "Zutaten",
  props: {
    zutaten: Array
  },
  components: {
    Zutat,
  },
  emits: ['delete-zutat', 'toggle-needed'],
}
</script>

<style scoped>

</style>