package com.kbo.baseball_stadium_seat_finder_api.infra.repository;

import com.kbo.baseball_stadium_seat_finder_api.domain.entity.StadiumEntity;
import com.kbo.baseball_stadium_seat_finder_api.domain.repository.IStadiumRepository;
import com.kbo.baseball_stadium_seat_finder_api.infra.jpa.StadiumJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@RequiredArgsConstructor
public class StadiumRepositoryImpl implements IStadiumRepository {

    private final StadiumJpaRepository stadiumJpaRepository;

    @Override
    public List<StadiumEntity> findAll() {
        return stadiumJpaRepository.findAll();
    }
}
