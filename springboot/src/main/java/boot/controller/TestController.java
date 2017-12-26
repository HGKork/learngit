package boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class TestController {

    //从application.yml文件中获取方式一:
    @Value("${test.msg}")
    private String msg;
    //从application.yml文件中获取方式二:
    @Autowired
    private Environment env;

    @RequestMapping(value = "/hello")
    public String hello(Map<String,Object> map){
        map.put("hello","hello");
        return "hello";
    }
    @RequestMapping(value = "/freemarker")
    public String freemarker(Map<String,Object> map){
        map.put("freemarker","Hello freemarker!");
        return "freemarker";
    }
    @RequestMapping(value = "/testMsg")
    public String testMsg(Map<String,Object> map){
        map.put("testMsg",msg);
        return "msg";
    }
    @RequestMapping(value = "/testEnvironment")
    public String testEnvironment(Map<String,Object> map){
        return "msg";
    }
}
