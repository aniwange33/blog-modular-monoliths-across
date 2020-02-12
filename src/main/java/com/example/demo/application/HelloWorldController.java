package com.example.demo.application;


import com.foreach.across.core.annotations.Exposed;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Exposed
public class HelloWorldController {
    @GetMapping("/hello/{name}")
    public  String getHelloWorld(@PathVariable("name") String name){
        return  name+  " Good morning I hope you slept well?";
    }
}
