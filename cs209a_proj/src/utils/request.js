import axios from 'axios'

const instance = axios.create({
    //网络请求的公共配置
    timeout: 5000//5s
})

//拦截器
//发送之前
instance.interceptors.request.use(
    config => {

        //config包含网络请求所有信息
        return config
    },

    error => Promise.reject(error)
)

// 获取数据之前
instance.interceptors.response.use(
    response => {

        return response
    },
    error => {

        return Promise.reject(error)
    }
)

export default instance;