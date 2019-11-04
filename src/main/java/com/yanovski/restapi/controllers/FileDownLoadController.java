package com.yanovski.restapi.controllers;

import com.yanovski.restapi.services.impl.FileDownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class FileDownLoadController {
//
//   @Autowired
//   private FileDownloadService fileDownloadService;
//
//    @RequestMapping(value = "/files1/{file_name}", method = RequestMethod.GET)
//    @ResponseBody
//    public FileSystemResource getFile(@PathVariable("file_name") String fileName) {
//        return new FileSystemResource(fileDownloadService.getFile(fileName));
//    }




//    @RequestMapping(value = "/files/{file_name}", method = RequestMethod.GET)
//    public void getFile(
//            @PathVariable("file_name") String fileName,
//            HttpServletResponse response) {
//        try {
//            // get your file as InputStream
////            InputStream is = ...;
//            // copy it to response's OutputStream
////            org.apache.commons.io.IOUtils.copy(is, response.getOutputStream());
////            response.flushBuffer();
//        } catch (IOException ex) {
////            log.info("Error writing file to output stream. Filename was '{}'", fileName, ex);
//            throw new RuntimeException("IOError writing file to output stream");
//        }
//
//    }

}
