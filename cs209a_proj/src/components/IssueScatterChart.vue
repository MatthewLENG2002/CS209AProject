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
        xAxis: {
          name: 'create time\n(h) from\n1st issue'
        },
        yAxis: {
          name: 'duration(h)'
        },
        toolbox: {
          show: true,
          feature: {
            saveAsImage: {}
          }
        },
        series: [
          {
            symbolSize: 8,
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