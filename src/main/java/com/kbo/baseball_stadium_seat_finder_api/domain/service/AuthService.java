package com.kbo.baseball_stadium_seat_finder_api.domain.service;

import com.kbo.baseball_stadium_seat_finder_api.domain.entity.UsersEntity;
import com.kbo.baseball_stadium_seat_finder_api.domain.repository.IUserRepository;
import com.kbo.baseball_stadium_seat_finder_api.interfaces.dto.request.ReqLoginDto;
import com.kbo.baseball_stadium_seat_finder_api.interfaces.dto.request.ReqSignUpDto;
import com.kbo.baseball_stadium_seat_finder_api.support.util.JwtTokenUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final IUserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public String signUp(ReqSignUpDto reqDto) {
        if (userRepository.findByEmail(reqDto.getEmail()).isPresent()) {
            throw new RuntimeException("이미 가입된 정보입니다.");
        }

        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setName(reqDto.getName());
        usersEntity.setEmail(reqDto.getEmail());
        usersEntity.setPassword(passwordEncoder.encode(reqDto.getPassword())); // 비밀번호 암호화

        // DB에 저장
        userRepository.save(usersEntity);

        return "회원가입 성공";
    }

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
