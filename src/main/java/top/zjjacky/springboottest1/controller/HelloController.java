package top.zjjacky.springboottest1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    //接口localhost:8080/hello1
    @RequestMapping("/hello1")
    //将字符串返回给浏览器
    @ResponseBody
    public String hello1() {
        //调用业务对象，调用前端参数
        return "hello,world";
    }
}
