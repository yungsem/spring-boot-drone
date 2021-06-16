package com.yungsem.springbootdrone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/t1")
    public String t1() {
        return "t1";
    }

    @GetMapping("/api/t2")
    public String t2() {
        return "t2";
    }


}
