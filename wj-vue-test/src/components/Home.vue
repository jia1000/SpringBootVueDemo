<template>
    <div>
      <!-- 把导航栏，放入Home组件中-->
      <nav-menu></nav-menu>
      <router-view/>
    </div>
</template>

<script>
import NavMenu from './common/NavMenu'
export default {
  name: 'Home',
  components: {NavMenu}
}
</script>

<style scoped>

</style>
