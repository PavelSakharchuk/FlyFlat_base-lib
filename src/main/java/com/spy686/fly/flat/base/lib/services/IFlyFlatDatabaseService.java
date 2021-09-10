package com.spy686.fly.flat.base.lib.services;

import com.spy686.fly.flat.base.lib.models.RentFlat;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface IFlyFlatDatabaseService {
    public void deleteAll(List<RentFlat> rentFlats);
    public void saveAll(List<RentFlat> rentFlats);
    public List<RentFlat> getAll();
}