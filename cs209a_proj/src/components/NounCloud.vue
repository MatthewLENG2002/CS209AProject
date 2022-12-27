<template>
  <div class="content-box">
    <div ref="keyWords" style="height: 250px"></div>
  </div>
</template>
<script>
import 'echarts-wordcloud'
import {mapGetters} from "vuex";
export default {
  name:"NounCloud",
  computed:{
    ...mapGetters(["getIssueNounKeyword", "getNounNum"]),
    option(){
      return{
        words: [
          {
            name: this.getIssueNounKeyword[0],
            value: this.getNounNum[0]
          },
          {
            name: this.getIssueNounKeyword[1],
            value: this.getNounNum[1]
          },
          {
            name: this.getIssueNounKeyword[2],
            value: this.getNounNum[2]
          },
          {
            name: this.getIssueNounKeyword[3],
            value: this.getNounNum[3]
          },
          {
            name: this.getIssueNounKeyword[4],
            value: this.getNounNum[4]
          },
          {
            name: this.getIssueNounKeyword[5],
            value: this.getNounNum[5]
          },
          {
            name: this.getIssueNounKeyword[6],
            value: this.getNounNum[6]
          },
          {
            name: this.getIssueNounKeyword[7],
            value: this.getNounNum[7]
          },

          {
            name: this.getIssueNounKeyword[8],
            value: this.getNounNum[8]
          },
          {
            name: this.getIssueNounKeyword[9],
            value: this.getNounNum[9]
          },
          {
            name: this.getIssueNounKeyword[10],
            value: this.getNounNum[10]
          },
          {
            name: this.getIssueNounKeyword[11],
            value: this.getNounNum[11]
          },
          {
            name: this.getIssueNounKeyword[12],
            value: this.getNounNum[12]
          },
          {
            name: this.getIssueNounKeyword[13],
            value: this.getNounNum[13]
          },
          {
            name: this.getIssueNounKeyword[14],
            value: this.getNounNum[14]
          },
          {
            name: this.getIssueNounKeyword[15],
            value: this.getNounNum[15]
          },
          {
            name: this.getIssueNounKeyword[16],
            value: this.getNounNum[16]
          },
          {
            name: this.getIssueNounKeyword[17],
            value: this.getNounNum[17]
          },
          {
            name: this.getIssueNounKeyword[18],
            value: this.getNounNum[18]
          },
          {
            name: this.getIssueNounKeyword[19],
            value: this.getNounNum[19]
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

