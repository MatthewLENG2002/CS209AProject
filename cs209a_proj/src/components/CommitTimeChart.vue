<template>
  <e-charts :option="option"></e-charts>
</template>

<script>
import {mapGetters} from "vuex";
// prettier-ignore
const hours = [
  '12a', '1a', '2a', '3a', '4a', '5a', '6a',
  '7a', '8a', '9a', '10a', '11a',
  '12p', '1p', '2p', '3p', '4p', '5p',
  '6p', '7p', '8p', '9p', '10p', '11p'
];
// prettier-ignore
const days = [
  'Saturday', 'Friday', 'Thursday',
  'Wednesday', 'Tuesday', 'Monday', 'Sunday'
];
// prettier-ignore
export default {
  name: "CommitTimeChart",
  computed: {
    ...mapGetters(["getCommitTime"]),
    option() {
      return {
        // title: {
        //   text: 'Punch Card of Github'
        // },
        legend: {
          data: ['Punch Card'],
          left: 'left'
        },
        polar: {},
        tooltip: {
          formatter: function (params) {
            return (
                params.value[2] +
                ' commits in ' +
                hours[params.value[1]] +
                ' of ' +
                days[params.value[0]]
            );
          }
        },
        toolbox: {
          show: true,
          feature: {
            saveAsImage: {},
          }
        },
        angleAxis: {
          type: 'category',
          data: hours,
          boundaryGap: false,
          splitLine: {
            show: true
          },
          axisLine: {
            show: false
          }
        },
        radiusAxis: {
          type: 'category',
          data: days,
          axisLine: {
            show: false
          },
          axisLabel: {
            rotate: 45
          }
        },
        series: [
          {
            name: 'Punch Card',
            type: 'scatter',
            coordinateSystem: 'polar',
            symbolSize: function (val) {
              return val[2] * 0.26;
            },
            data: this.getCommitTime,
            animationDelay: function (idx) {
              return idx * 5;
            }
          }
        ]
      }
    }

  }
}
</script>

<style scoped>

</style>