package com.spy686.fly.flat.base.lib.repository;

import com.spy686.fly.flat.base.lib.models.RentFlat;
import com.spy686.fly.flat.base.lib.models.Source;
import org.springframework.data.mongodb.repository.Meta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FlyFlatRepository extends MongoRepository<RentFlat, Long> {

    @Override
    void deleteAll(Iterable<? extends RentFlat> entities);

    @Override
    <S extends RentFlat> List<S> saveAll(Iterable<S> entities);

    @Meta(cursorBatchSize = 500)
    <S extends RentFlat> List<S> findAllBySource(Source source);

}