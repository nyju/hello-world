package com.example.restfulwebservice.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // hello-word (endpoint)
    // RequestMapping(method=RequestMapping.GET, path=-"/hello-world")
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    // Bean 형태로 반환시키기 -> json 형태로 반환됨
    @GetMapping (path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping (path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name) {
       // return new HelloWorldBean("Hello World, " + name);

        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
