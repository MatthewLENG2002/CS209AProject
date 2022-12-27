<template>
  <div class="content-box">
    <div ref="keyWords" style="height: 250px"></div>
  </div>
</template>
<script>
import 'echarts-wordcloud'
import {mapGetters} from "vuex";
export default {
  name:"VerbCloud",
  computed:{
    ...mapGetters(["getIssueVerbKeyword", "getVerbNum"]),
    option(){
      return{
        words: [
          {
            name: this.getIssueVerbKeyword[0],
            value: this.getVerbNum[0]
          },
          {
            name: this.getIssueVerbKeyword[1],
            value: this.getVerbNum[1]
          },
          {
            name: this.getIssueVerbKeyword[2],
            value: this.getVerbNum[2]
          },
          {
            name: this.getIssueVerbKeyword[3],
            value: this.getVerbNum[3]
          },
          {
            name: this.getIssueVerbKeyword[4],
            value: this.getVerbNum[4]
          },
          {
            name: this.getIssueVerbKeyword[5],
            value: this.getVerbNum[5]
          },
          {
            name: this.getIssueVerbKeyword[6],
            value: this.getVerbNum[6]
          },
          {
            name: this.getIssueVerbKeyword[7],
            value: this.getVerbNum[7]
          },

          {
            name: this.getIssueVerbKeyword[8],
            value: this.getVerbNum[8]
          },
          {
            name: this.getIssueVerbKeyword[9],
            value: this.getVerbNum[9]
          },
          {
            name: this.getIssueVerbKeyword[10],
            value: this.getVerbNum[10]
          },
          {
            name: this.getIssueVerbKeyword[11],
            value: this.getVerbNum[11]
          },
          {
            name: this.getIssueVerbKeyword[12],
            value: this.getVerbNum[12]
          },
          {
            name: this.getIssueVerbKeyword[13],
            value: this.getVerbNum[13]
          },
          {
            name: this.getIssueVerbKeyword[14],
            value: this.getVerbNum[14]
          },
          {
            name: this.getIssueVerbKeyword[15],
            value: this.getVerbNum[15]
          },
          {
            name: this.getIssueVerbKeyword[16],
            value: this.getVerbNum[16]
          },
          {
            name: this.getIssueVerbKeyword[17],
            value: this.getVerbNum[17]
          },
          {
            name: this.getIssueVerbKeyword[18],
            value: this.getVerbNum[18]
          },
          {
            name: this.getIssueVerbKeyword[19],
            value: this.getVerbNum[19]
          }
        ]
      }
    }
  },
  // data() {
  //   return {
  //
  //   }
  // },
  mounted() {
    this.$nextTick(() => {
      this.initEchart()
    })
  },
  methods: {
    initEchart() {
      //获取DOM节点并初始化
      const el = this.$refs.keyWords
      const echarts = require('echarts')
      const myChart = echarts.init(el)
      //按照colorList指定颜色的数据进行随机
      const colorList = ['#475caf', 'rgba(73,146,159,0.87)', '#ecc25d']
      let option = {
        tooltip: {
          show: true
        },
        series: [
          {
            //用来调整词之间的距离
            gridSize: 20,
            //用来调整字的大小范围
            sizeRange: [18, 40],
            //用来调整词的旋转方向，，[0,0]--代表着没有角度，也就是词为水平方向
            rotationRange: [0, 0],
            type: 'wordCloud',
            size: ['95%', '95%'],
            textRotation: [0, 90],
            textPadding: 0,
            autoSize: {
              enable: true,
              minSize: 14
            },
            textStyle: {
              normal: {
                color: function() {
                  let index = Math.floor(Math.random() * colorList.length)
                  return colorList[index]
                }
              }
            },
            data: this.option.words
          }
        ]
      }
      //设置图表的参数
      myChart.setOption(option)
    }
  }
}
</script>

