package com.kbo.baseball_stadium_seat_finder_api.infra.jpa;

import com.kbo.baseball_stadium_seat_finder_api.domain.entity.SeatTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SeatTypeJpaRepository extends JpaRepository<SeatTypeEntity, Long> {
    List<SeatTypeEntity> findAllByStadiumCode(String stadiumCode);
}
