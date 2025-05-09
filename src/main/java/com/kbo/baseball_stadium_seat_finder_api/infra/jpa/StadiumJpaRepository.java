package com.kbo.baseball_stadium_seat_finder_api.infra.jpa;

import com.kbo.baseball_stadium_seat_finder_api.domain.entity.StadiumEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StadiumJpaRepository extends JpaRepository<StadiumEntity, Long> {
}
