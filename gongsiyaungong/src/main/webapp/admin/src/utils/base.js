const base = {
    get() {
        return {
            url : "http://localhost:8080/gongsiyaungong/",
            name: "gongsiyaungong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/gongsiyaungong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "公司员工工作日志办公系统"
        } 
    }
}
export default base
