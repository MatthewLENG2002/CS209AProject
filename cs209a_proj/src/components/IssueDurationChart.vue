<!--<template>-->
<!--  <div id="chart">-->
<!--    <apexchart type="boxPlot" height="350" :options="chartOptions" :series="series"></apexchart>-->
<!--  </div>-->
<!--</template>-->

<!--<script>-->

<!--export default {-->
<!--  name: "CommitInReleaseChart",-->
<!--  data(){-->
<!--    return{-->


<!--      series: [-->
<!--        {-->
<!--          data: [-->
<!--            {-->
<!--              x: 'Category A',-->
<!--              y: [54, 66, 69, 75, 88]-->
<!--            },-->
<!--            {-->
<!--              x: 'Category B',-->
<!--              y: [43, 65, 69, 76, 81]-->
<!--            },-->
<!--            {-->
<!--              x: 'Category C',-->
<!--              y: [31, 39, 45, 51, 59]-->
<!--            },-->
<!--            {-->
<!--              x: 'Category D',-->
<!--              y: [39, 46, 55, 65, 71]-->
<!--            },-->
<!--            {-->
<!--              x: 'Category E',-->
<!--              y: [29, 31, 35, 39, 44]-->
<!--            },-->
<!--            {-->
<!--              x: 'Category F',-->
<!--              y: [41, 49, 58, 61, 67]-->
<!--            },-->
<!--            {-->
<!--              x: 'Category G',-->
<!--              y: [54, 59, 66, 71, 88]-->
<!--            }-->
<!--          ]-->
<!--        }-->
<!--      ],-->
<!--      chartOptions: {-->
<!--        chart: {-->
<!--          type: 'boxPlot',-->
<!--          height: 350-->
<!--        },-->
<!--        title: {-->
<!--          text: 'Horizontal BoxPlot Chart',-->
<!--          align: 'left'-->
<!--        },-->
<!--        plotOptions: {-->
<!--          bar: {-->
<!--            horizontal: true,-->
<!--            barHeight: '50%'-->
<!--          },-->
<!--          boxPlot: {-->
<!--            colors: {-->
<!--              upper: '#e9ecef',-->
<!--              lower: '#f8f9fa'-->
<!--            }-->
<!--          }-->
<!--        },-->
<!--        stroke: {-->
<!--          colors: ['#6c757d']-->
<!--        }-->
<!--      },-->



<!--    }-->
<!--  }-->

<!--}-->
<!--</script>-->

<!--<style scoped>-->

<!--</style>-->
<template>
  <div id="chart">
    <apexchart type="boxPlot" height="120" :options="option.chartOptions" :series="option.series"></apexchart>
  </div>

</template>

<script>
import {mapGetters} from "vuex";
export default {
  name: "alarmCalcul",
  computed: {
    ...mapGetters(["getIssueBox"]),
    option(){
      return{
        series: [
          {
            data: [
              {
                x: 'All Issues',
                y: this.getIssueBox
              },
              // {
              //   x: 'Category B',
              //   y: [43, 65, 69, 76, 81]
              // },
              // {
              //   x: 'Category C',
              //   y: [31, 39, 45, 51, 59]
              // },
              // {
              //   x: 'Category D',
              //   y: [39, 46, 55, 65, 71]
              // },
              // {
              //   x: 'Category E',
              //   y: [29, 31, 35, 39, 44]
              // },
              // {
              //   x: 'Category F',
              //   y: [41, 49, 58, 61, 67]
              // },
              // {
              //   x: 'Category G',
              //   y: [54, 59, 66, 71, 88]
              // }
            ]
          }
        ],
        chartOptions: {
          chart: {
            type: 'boxPlot',
            height: 150
          },
          // title: {
          //   text: 'Horizontal BoxPlot Chart',
          //   align: 'left'
          // },
          plotOptions: {
            bar: {
              horizontal: true,
              barHeight: '50%'
            },
            boxPlot: {
              colors: {
                upper: '#8091d3',
                lower: '#475caf'
              }
            }
          },
          stroke: {
            colors: ['#6c757d']
          }
        }
      }
    }
  },
  methods: {},
  // data() {
  //   return {
  //     series: [
  //       {
  //         data: [
  //           {
  //             x: 'All Issues',
  //             y: [54, 66, 69, 75, 88]
  //           },
  //           // {
  //           //   x: 'Category B',
  //           //   y: [43, 65, 69, 76, 81]
  //           // },
  //           // {
  //           //   x: 'Category C',
  //           //   y: [31, 39, 45, 51, 59]
  //           // },
  //           // {
  //           //   x: 'Category D',
  //           //   y: [39, 46, 55, 65, 71]
  //           // },
  //           // {
  //           //   x: 'Category E',
  //           //   y: [29, 31, 35, 39, 44]
  //           // },
  //           // {
  //           //   x: 'Category F',
  //           //   y: [41, 49, 58, 61, 67]
  //           // },
  //           // {
  //           //   x: 'Category G',
  //           //   y: [54, 59, 66, 71, 88]
  //           // }
  //         ]
  //       }
  //     ],
  //     chartOptions: {
  //       chart: {
  //         type: 'boxPlot',
  //         height: 350
  //       },
  //       // title: {
  //       //   text: 'Horizontal BoxPlot Chart',
  //       //   align: 'left'
  //       // },
  //       plotOptions: {
  //         bar: {
  //           horizontal: true,
  //           barHeight: '50%'
  //         },
  //         boxPlot: {
  //           colors: {
  //             upper: '#8091d3',
  //             lower: '#475caf'
  //           }
  //         }
  //       },
  //       stroke: {
  //         colors: ['#6c757d']
  //       }
  //     },
  //   };
  // },
};
</script>

<style scoped>
</style>