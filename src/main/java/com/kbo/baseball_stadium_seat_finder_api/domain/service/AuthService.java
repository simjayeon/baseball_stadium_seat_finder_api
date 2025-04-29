package com.kbo.baseball_stadium_seat_finder_api.domain.service;

import com.kbo.baseball_stadium_seat_finder_api.domain.entity.UsersEntity;
import com.kbo.baseball_stadium_seat_finder_api.domain.repository.IUserRepository;
import com.kbo.baseball_stadium_seat_finder_api.interfaces.dto.request.ReqLoginDto;
import com.kbo.baseball_stadium_seat_finder_api.support.util.JwtTokenUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final IUserRepository userRepository;

    public String login(ReqLoginDto reqDto) {

        UsersEntity usersEntity = userRepository.findByEmail(reqDto.getEmail())
                .orElseThrow(() -> new RuntimeException("유저 정보가 없습니다."));

        // 비밀번호 비교
        if (!usersEntity.getPassword().equals(reqDto.getPassword())) {
            throw new RuntimeException("비밀번호가 일치하지 않습니다.");
        }

        // JWT 토큰 발급
        return JwtTokenUtil.generateToken(usersEntity.getEmail());
    }
}
