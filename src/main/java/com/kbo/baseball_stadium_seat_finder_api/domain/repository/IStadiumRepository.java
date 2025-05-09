package com.kbo.baseball_stadium_seat_finder_api.domain.repository;

import com.kbo.baseball_stadium_seat_finder_api.domain.entity.StadiumEntity;

import java.util.List;

public interface IStadiumRepository {

    List<StadiumEntity> findAll();
}
