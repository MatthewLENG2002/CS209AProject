<template>
  <e-charts :option="option"></e-charts>
</template>

<script>
import {mapGetters} from "vuex";

export default {
  name: "OpenClosePieChart",
  computed: {
    ...mapGetters(["getOpenIssues", "getCloseIssues"]),
    option() {
      return {
        tooltip: {
          trigger: 'item'
        },
        toolbox: {
          show: true,
          feature: {
            dataView: { readOnly: false },
            saveAsImage: {}
          }
        },
        legend: {
          top: '5%',
          left: 'center'
        },
        series: [
          {
            name: 'Access From',
            type: 'pie',
            radius: ['40%', '70%'],
            avoidLabelOverlap: false,
            label: {
              show: false,
              position: 'center'
            },
            emphasis: {
              label: {
                show: true,
                fontSize: 20,
                fontWeight: 'bold'
              }
            },
            labelLine: {
              show: false
            },
            data: [
              {value: this.getOpenIssues, name: 'Open Issues'},
              {value: this.getCloseIssues, name: 'Closed Issues'}
            ]
          }
        ]

      }
    }
  }
}
</script>

<style scoped>

</style>