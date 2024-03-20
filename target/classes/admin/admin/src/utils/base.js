const base = {
    get() {
        return {
            url : "http://localhost:8080/zhongxuexinxijishuxianshangxuexi/",
            name: "zhongxuexinxijishuxianshangxuexi",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zhongxuexinxijishuxianshangxuexi/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "信息技术课程线上测试系统"
        } 
    }
}
export default base
