package com.kbo.baseball_stadium_seat_finder_api.interfaces.dto.request;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ReqLoginDto {
    @NotBlank
    @Email(message = "잘못된 이메일 형식입니다.")
    private String email;
    @NotBlank
    @Size(min = 8, message = "비밀번호는 최소 8자 이상이어야 합니다.")
    private String password;
}