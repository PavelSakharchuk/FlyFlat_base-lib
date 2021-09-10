package com.spy686.fly.flat.base.lib.controllers;

import com.spy686.fly.flat.base.lib.services.IFlyFlatService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Executors;


public interface FlyFlatRestController {

    public void fetch();
    public void deleteNotActual();
}