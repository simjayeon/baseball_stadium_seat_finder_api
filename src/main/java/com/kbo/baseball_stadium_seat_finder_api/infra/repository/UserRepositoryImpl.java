package com.kbo.baseball_stadium_seat_finder_api.infra.repository;

import com.kbo.baseball_stadium_seat_finder_api.domain.entity.UsersEntity;
import com.kbo.baseball_stadium_seat_finder_api.domain.repository.IUserRepository;
import com.kbo.baseball_stadium_seat_finder_api.infra.jpa.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements IUserRepository {

    private final UserJpaRepository userJpaRepository;

    @Override
    public Optional<UsersEntity> findByEmail(String email) {
        return userJpaRepository.findByEmail(email);
    }

    @Override
    public void save(UsersEntity usersEntity) {
        userJpaRepository.save(usersEntity);
    }
}
