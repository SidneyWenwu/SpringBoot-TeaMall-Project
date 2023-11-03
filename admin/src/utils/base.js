const base = {
    get() {
        return {
            url : "http://localhost:8080/TeaMall/",
            name: "TeaMall",
            // 退出到首页链接
            indexUrl: 'http://localhost:63342/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "茶叶销售平台"
        }
    }
}
export default base
