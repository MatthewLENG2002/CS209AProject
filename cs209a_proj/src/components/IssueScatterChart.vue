<template>
  <e-charts :option="option"></e-charts>
</template>

<script>
import {mapGetters} from "vuex";
export default {
  name: "IssueScatterChart",
  computed:{
    ...mapGetters(["getIssueScatter"]),
    option(){
      return {
        xAxis: {},
        yAxis: {
          name: 'duration'
        },
        toolbox: {
          show: true,
          feature: {
            saveAsImage: {}
          }
        },
        series: [
          {
            symbolSize: 20,
            data: this.getIssueScatter,
            type: 'scatter'
          }
        ]
      }
    }
  }
}
</script>

<style scoped>

</style>