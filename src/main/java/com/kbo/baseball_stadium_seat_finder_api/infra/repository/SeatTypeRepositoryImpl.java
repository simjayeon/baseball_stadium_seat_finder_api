package com.kbo.baseball_stadium_seat_finder_api.infra.repository;

import com.kbo.baseball_stadium_seat_finder_api.domain.entity.SeatTypeEntity;
import com.kbo.baseball_stadium_seat_finder_api.domain.repository.ISeatTypeRepository;
import com.kbo.baseball_stadium_seat_finder_api.infra.jpa.SeatTypeJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@RequiredArgsConstructor
public class SeatTypeRepositoryImpl implements ISeatTypeRepository {

    private final SeatTypeJpaRepository seatTypeJpaRepository;

    @Override
    public List<SeatTypeEntity> findAllByStadiumCode(String stadiumCode) {
        return seatTypeJpaRepository.findAllByStadiumCode(stadiumCode);
    }
}
