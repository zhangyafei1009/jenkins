package com.jenkins.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Date: 2023/04/26 22:32:32
 * @Author: forever
 */

@RestController
@RequestMapping(value = "/jenkins")
public class JenkinsController {

    @GetMapping(value = "/test")
    public String test() {
        return "Hello Jenkins";
    }
}
