package com.yanovski.restapi.services.impl;

import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class FileDownloadService {

    public File getFile(String filename){
        return new File("C:\\Users\\Kozak\\Desktop\\01_Java\\04_Spring\\JWT-REST-API\\upload-dir\\" + filename + ".txt");
    }
}
