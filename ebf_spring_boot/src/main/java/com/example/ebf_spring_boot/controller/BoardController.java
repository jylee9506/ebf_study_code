package com.example.ebf_spring_boot.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {


    @GetMapping("")
    public String basicPage(){
        return "/board/list";
    }

    @GetMapping("/list")
    public void list(){

        log.info("-------------------------- list page check ---------------------------");
    }

    @GetMapping("/test")
    public void test(){

    }


}
