package com.spy686.fly.flat.base.lib.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;


public interface IFlyFlatService {
    public void fetch();
    public void deleteNotActual();
}