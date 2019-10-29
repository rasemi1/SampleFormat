package com.yanovski.restapi.controllers;

import com.yanovski.restapi.services.impl.FileProcessorService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilePrcessorController {

    private final Logger logger = LogManager.getLogger(FilePrcessorController.class);

    private FileProcessorService helloService;

    @Autowired
    public FilePrcessorController(FileProcessorService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/file")
    public String  homeObject() throws Exception{
        logger.info("TEST obj");
        return helloService.store("test1");
    }
}
