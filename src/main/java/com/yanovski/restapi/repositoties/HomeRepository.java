package com.yanovski.restapi.repositoties;

import com.yanovski.restapi.models.Home;
import org.springframework.stereotype.Component;

@Component
public class HomeRepository {
    public Home getHomeObject() {
        Home model = new Home();
        model.setHello("TEST");

        return model;
    }
}
