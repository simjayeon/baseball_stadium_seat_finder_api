package com.kbo.baseball_stadium_seat_finder_api.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class UsersEntity {
    @Id
    private Long id;

    private String name;

    private String email;

    private String password;

}
