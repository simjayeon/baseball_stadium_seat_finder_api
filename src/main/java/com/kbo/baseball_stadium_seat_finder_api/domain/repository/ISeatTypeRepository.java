package com.kbo.baseball_stadium_seat_finder_api.domain.repository;

import com.kbo.baseball_stadium_seat_finder_api.domain.entity.SeatTypeEntity;

import java.util.List;

public interface ISeatTypeRepository {
    List<SeatTypeEntity> findAllByStadiumCode(String stadiumCode);
}
