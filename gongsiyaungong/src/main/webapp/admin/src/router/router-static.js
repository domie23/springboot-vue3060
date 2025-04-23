import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import daibangongzuo from '@/views/modules/daibangongzuo/list'
    import dictionary from '@/views/modules/dictionary/list'
    import gongzuohuibao from '@/views/modules/gongzuohuibao/list'
    import gongzuojihua from '@/views/modules/gongzuojihua/list'
    import huiyi from '@/views/modules/huiyi/list'
    import news from '@/views/modules/news/list'
    import yonghu from '@/views/modules/yonghu/list'
    import dictionaryBumen from '@/views/modules/dictionaryBumen/list'
    import dictionaryDaibangongzuo from '@/views/modules/dictionaryDaibangongzuo/list'
    import dictionaryDaibangongzuoYesno from '@/views/modules/dictionaryDaibangongzuoYesno/list'
    import dictionaryGongzuohuibao from '@/views/modules/dictionaryGongzuohuibao/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryBumen',
        name: '部门',
        component: dictionaryBumen
    }
    ,{
        path: '/dictionaryDaibangongzuo',
        name: '流程类型',
        component: dictionaryDaibangongzuo
    }
    ,{
        path: '/dictionaryDaibangongzuoYesno',
        name: '审批结果',
        component: dictionaryDaibangongzuoYesno
    }
    ,{
        path: '/dictionaryGongzuohuibao',
        name: '工作类型',
        component: dictionaryGongzuohuibao
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }


    ,{
        path: '/daibangongzuo',
        name: '待办工作',
        component: daibangongzuo
      }
    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/gongzuohuibao',
        name: '工作汇报',
        component: gongzuohuibao
      }
    ,{
        path: '/gongzuojihua',
        name: '工作计划',
        component: gongzuojihua
      }
    ,{
        path: '/huiyi',
        name: '会议信息',
        component: huiyi
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/yonghu',
        name: '员工',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
