package com.kbo.baseball_stadium_seat_finder_api.domain.repository;

import com.kbo.baseball_stadium_seat_finder_api.domain.entity.UsersEntity;

import java.util.Optional;

public interface IUserRepository {

    Optional<UsersEntity> findByEmail(String email);
}
