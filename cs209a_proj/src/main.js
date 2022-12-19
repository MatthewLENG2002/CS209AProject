
import { createApp } from 'vue'
import App from './App.vue'
import store from "@/store";
import ArcoVue from '@arco-design/web-vue'
import ArcoVueIcon from "@arco-design/web-vue/es/icon";
import '@arco-design/web-vue/dist/arco.css'
import ECharts from 'vue-echarts'
import ApexCharts from 'apexcharts'
import 'echarts';
import VueApexCharts from "vue3-apexcharts";



const app = createApp(App);
app.use(VueApexCharts);
app.use(store)
app.component('ECharts', ECharts)
app.component('ApexCharts', ApexCharts)
app.use(App)
app.use(ArcoVue)
app.use(ArcoVueIcon)


app.mount('#app')


