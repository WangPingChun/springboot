package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : WangPingChun
 * 2018-07-05
 */
@RestController
public class HelloController {
    private final GirlProperties girlProperties;

    @Autowired
    public HelloController(GirlProperties girlProperties) {
        this.girlProperties = girlProperties;
    }

    @GetMapping("/hello/{id}")
    public String say(@PathVariable("id") Integer id) {
        return "id:" + id;
    }
}
