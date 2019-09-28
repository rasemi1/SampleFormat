package com.yanovski.restapi.services;

import com.yanovski.restapi.dtos.HomeDto;

public interface HelloService {
    String hello();
    HomeDto helloObj();
}
