import Vue from 'vue'
import VueRouter from "vue-router"
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import routes from './router/router'

// learn router from [vue-router](https://router.vuejs.org/zh-cn/essentials/getting-started.html)

Vue.use(ElementUI)
Vue.use(VueRouter)

const router = new VueRouter({
    routes // （缩写）相当于 routes: routes
})

const app = new Vue({
    router
}).$mount('#app')