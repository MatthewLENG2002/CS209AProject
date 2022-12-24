<template>
  <e-charts :option="option"></e-charts>
</template>

<script>
import {mapGetters} from "vuex";
export default {
  name: "CommitInReleaseChart",
  computed: {
    ...mapGetters(["getReleaseX", "getReleaseY"]),
    option() {
      return {
        // title: {
        //   text: 'Distribution of Electricity',
        //   subtext: 'Fake Data'
        // },
        tooltip: {
          trigger: 'axis',
          axisPointer: {
            type: 'cross'
          }
        },
        toolbox: {
          show: true,
          feature: {
            saveAsImage: {}
          }
        },
        xAxis: {
          type: 'category',
          boundaryGap: false,
          // prettier-ignore
          data: this.getReleaseX
        },
        yAxis: {
          type: 'value',
          axisLabel: {
            formatter: '{value} commits'
          },
          axisPointer: {
            snap: true
          }
        },
        visualMap: {
          show: false,
          dimension: 0,
          pieces: [
            {
              lte: 2,
              color: '#6699CC'
            },
            {
              gt: 2,
              lte: 4,
              color: '#fafafa'
            },
            {
              gt: 4,
              lte: 8,
              color: '#6699CC'
            },
            {
              gt: 8,
              lte: 9,
              color: '#fafafa'
            },
            {
              gt: 10,
              color: '#6699CC'
            }
          ]
        },
        series: [
          {
            name: 'Commits',
            type: 'line',
            smooth: true,
            // prettier-ignore
            data: this.getReleaseY,
            markArea: {
              itemStyle: {
                color: 'rgba(128,145,211,0.61)'
              },
              data: [
                [
                  {
                    name: 'Highest Peak',
                    xAxis: 'release3'
                  },
                  {
                    xAxis: 'release5'
                  }
                ],
                [
                  {
                    name: 'Lowest Peak',
                    xAxis: 'release9'
                  },
                  {
                    xAxis: 'release10'
                  }
                ]
              ]
            }
          }
        ]
      }
    }
  },
  // data(){
  //   return{
  //     option : {
  //       title: {
  //         text: 'Distribution of Electricity',
  //         subtext: 'Fake Data'
  //       },
  //       tooltip: {
  //         trigger: 'axis',
  //         axisPointer: {
  //           type: 'cross'
  //         }
  //       },
  //       toolbox: {
  //         show: true,
  //         feature: {
  //           saveAsImage: {}
  //         }
  //       },
  //       xAxis: {
  //         type: 'category',
  //         boundaryGap: false,
  //         // prettier-ignore
  //         data: ['00:00', '01:15', '02:30', '03:45', '05:00', '06:15', '07:30', '08:45', '10:00', '11:15', '12:30', '13:45', '15:00', '16:15', '17:30', '18:45', '20:00', '21:15', '22:30', '23:45']
  //       },
  //       yAxis: {
  //         type: 'value',
  //         axisLabel: {
  //           formatter: '{value} W'
  //         },
  //         axisPointer: {
  //           snap: true
  //         }
  //       },
  //       visualMap: {
  //         show: false,
  //         dimension: 0,
  //         pieces: [
  //           {
  //             lte: 6,
  //             color: 'green'
  //           },
  //           {
  //             gt: 6,
  //             lte: 8,
  //             color: 'red'
  //           },
  //           {
  //             gt: 8,
  //             lte: 14,
  //             color: 'green'
  //           },
  //           {
  //             gt: 14,
  //             lte: 17,
  //             color: 'red'
  //           },
  //           {
  //             gt: 17,
  //             color: 'green'
  //           }
  //         ]
  //       },
  //       series: [
  //         {
  //           name: 'Electricity',
  //           type: 'line',
  //           smooth: true,
  //           // prettier-ignore
  //           data: [300, 280, 250, 260, 270, 300, 550, 500, 400, 390, 380, 390, 400, 500, 600, 750, 800, 700, 600, 400],
  //           markArea: {
  //             itemStyle: {
  //               color: 'rgba(255, 173, 177, 0.4)'
  //             },
  //             data: [
  //               [
  //                 {
  //                   name: 'Morning Peak',
  //                   xAxis: '07:30'
  //                 },
  //                 {
  //                   xAxis: '10:00'
  //                 }
  //               ],
  //               [
  //                 {
  //                   name: 'Evening Peak',
  //                   xAxis: '17:30'
  //                 },
  //                 {
  //                   xAxis: '21:15'
  //                 }
  //               ]
  //             ]
  //           }
  //         }
  //       ]
  //     }
  //   }
  // }
}
</script>

<style scoped>

</style>