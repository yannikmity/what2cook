<template>
  <div @dblclick="$emit('toggle-needed', zutat.id)"
       :class="[zutat.needed ? 'needed' : '', 'zutat']">
    <h3>
      {{zutat.text }}
      <i @click="$emit('delete-zutat')" class="fas fa-times"></i>
    </h3>
    <p>{{zutat.measure}}</p>
  </div>
</template>

<script>
export default {
  name: 'Zutat',
  props: {
    zutat: Object
  },
}
</script>

<style scoped>
.fas{
  color: red;
}

.zutat {
  background: aliceblue;
  margin: 5px;
  padding: 10px 20px;
  cursor: pointer;
}
.zutat.needed {
  border-left: 5px solid green;
}
.zutat h3 {
  display: flex;
  align-items: center;
  justify-content: space-between;
}
</style>