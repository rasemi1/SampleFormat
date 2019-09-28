package com.yanovski.restapi.services.impl;

import com.yanovski.restapi.dtos.HomeDto;
import com.yanovski.restapi.models.Home;
import com.yanovski.restapi.repositoties.HomeRepository;
import com.yanovski.restapi.services.HelloService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    private HomeRepository homeRepository;

    ModelMapper modelMapper = new ModelMapper();

    @Autowired
    public HelloServiceImpl(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
    }

    @Override
    public String hello() {
        return null;
    }

    @Override
    public HomeDto helloObj() {
        Home model = homeRepository.getHomeObject();

        HomeDto dto = modelMapper.map(model, HomeDto.class);

        return dto;
    }
}
