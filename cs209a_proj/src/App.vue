<template>

  <div :style="{ background: 'var(--color-fill-2)', padding:'30px' }">
    <a-page-header
        :style="{ background: 'var(--color-bg-2)' }"
        :show-back="false"
    >
      <template #title>
        <div style="font-size: 25px; font-family: 'Arial Black'; color: midnightblue">
        My Repo
        </div>
      </template>
      <template #subtitle>
        <div style="font-size: 15px; font-family: Arial; color: dimgrey">
          For CS209A
        </div>
      </template>
      <template #extra>
      </template>
    </a-page-header>
  </div>
  <MainPart></MainPart>
</template>

<script>
import MainPart from "@/components/MenuPart";
import {mapGetters, mapMutations} from "vuex"


export default {
  name: 'App',
  components: {
    MainPart
  },
  computed:{
    ...mapGetters(['getTime'])
  },
  methods:{
    ...mapMutations(['setTime'])
  },
  data(){
  },
  mounted() {
    console.log(this.getTime)
    this.setTime(8888)
    console.log(this.getTime)
  }
}
</script>

<style>
/*#app {*/
/*  font-family: Avenir, Helvetica, Arial, sans-serif;*/
/*  -webkit-font-smoothing: antialiased;*/
/*  -moz-osx-font-smoothing: grayscale;*/
/*  text-align: center;*/
/*  color: #2c3e50;*/
/*  !*margin-top: 60px;*!*/
/*}*/
</style>
