<template>
  <e-charts :option="option"></e-charts>
</template>

<script>
import {mapGetters} from "vuex";

export default {
  name: "DeveloperCommitChart",
  computed:{
    ...mapGetters(["getDeveloperChartY", "getDeveloperChartX"]),
    option(){
      return{
        tooltip: {
          trigger: 'axis',
          axisPointer: {
            type: 'shadow'
          }
        },
        legend: {},
        grid: {
          left: '3%',
          right: '4%',
          bottom: '3%',
          containLabel: true
        },
        xAxis: {
          type: 'value',
          boundaryGap: [0, 0.01]
        },
        yAxis: {

          name: 'developers',
          type: 'category',
          data: this.getDeveloperChartY
        },
        toolbox: {
          show: true,
          feature: {
            dataView: { readOnly: false },
            magicType: { type: ['line', 'bar'] },
            restore: {},
            saveAsImage: {}
          }
        },
        series: [
          {
            name: 'commit times',
            type: 'bar',
            itemStyle: {
              // color: new graphic.LinearGradient(0, 0, 0, 1, [
              //   { offset: 0, color: '#83bff6' },
              //   { offset: 1, color: '#003366' }
              // ])
              color: '#4f64b6'
            },
            data: this.getDeveloperChartX
          },
          // {
          //   name: '2012',
          //   type: 'bar',
          //   data: [19325, 23438, 31000, 121594, 134141, 681807]
          // }
        ]
      }
    }
  },
  // data(){
  //   return{
  //     option : {
  //       // title: {
  //       //   text: 'World Population'
  //       // },
  //       tooltip: {
  //         trigger: 'axis',
  //         axisPointer: {
  //           type: 'shadow'
  //         }
  //       },
  //       legend: {},
  //       grid: {
  //         left: '3%',
  //         right: '4%',
  //         bottom: '3%',
  //         containLabel: true
  //       },
  //       xAxis: {
  //         type: 'value',
  //         boundaryGap: [0, 0.01]
  //       },
  //       yAxis: {
  //         type: 'category',
  //         data: ['Brazil', 'Indonesia', 'USA', 'India', 'China', 'World']
  //       },
  //       toolbox: {
  //         show: true,
  //         feature: {
  //           saveAsImage: {}
  //         }
  //       },
  //       series: [
  //         {
  //           name: 'commit times',
  //           type: 'bar',
  //           itemStyle: {
  //             // color: new graphic.LinearGradient(0, 0, 0, 1, [
  //             //   { offset: 0, color: '#83bff6' },
  //             //   { offset: 1, color: '#003366' }
  //             // ])
  //             color: '#4f64b6'
  //           },
  //           data: [18203, 23489, 29034, 104970, 131744, 630230]
  //         },
  //         // {
  //         //   name: '2012',
  //         //   type: 'bar',
  //         //   data: [19325, 23438, 31000, 121594, 134141, 681807]
  //         // }
  //       ]
  //     }
  //   }
  // }
}
</script>

<style scoped>

</style>