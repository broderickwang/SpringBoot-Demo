package com.hannain.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 王成达 on 2017/12/26.
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String index(){
        return "hello world";
    }
}
