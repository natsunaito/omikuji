package com.github.natsunaito.omikuji.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {

    @GetMapping("/{result}")
    public String showResult(@PathVariable String result) {
        return  result;
    }
}