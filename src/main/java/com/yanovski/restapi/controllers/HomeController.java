package com.yanovski.restapi.controllers;

import com.yanovski.restapi.dtos.HomeDto;
import com.yanovski.restapi.services.HelloService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class HomeController {
    private final Logger logger = LogManager.getLogger(HomeController.class);

    private HelloService helloService;

    @Autowired
    public HomeController(HelloService helloService) {
        this.helloService = helloService;
    }

//    @GetMapping("/")
//    public String hello() {
//        logger.info("TEST");
//        return "something...";
//    }
//
//    @GetMapping("/")
//    public void redirect(HttpServletResponse response) throws IOException {
//        response.sendRedirect("/swagger-ui.html");
//    }

    @GetMapping("/home_obj")
    public HomeDto homeObject() {
        logger.info("TEST obj");
        return helloService.helloObj();
    }
}
