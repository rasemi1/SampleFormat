package com.yanovski.restapi.services.impl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import java.io.*;

@Service
public class FileProcessorService {

    private final Logger logger = LogManager.getLogger(FileProcessorService.class);

        public String store(String name) throws Exception {
            File file = new File("C:\\Users\\Kozak\\Desktop\\01_Java\\04_Spring\\JWT-REST-API\\upload-dir\\test1");
            StringBuilder sb = new StringBuilder();
            FileReader reader = new FileReader(file + ".txt");
                int ch = reader.read();
                while (ch != -1) {
                    char cha = (char) ch;
                    if(cha == '&'){
                        sb.append("and");
                    }else {
                        if(cha == ';'){
                            cha = ',';
                        }
                        if(cha == '"'){
                            cha = '\'';
                        }
                        sb.append((char) cha);
                    }
                    ch = reader.read();
                }
            return sb.toString();
        }
}
