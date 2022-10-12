package com.sparta.JwtUserPostComment.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Setter
@Getter
public class SignupRequestDto {

    @Pattern(regexp= "^[a-zA-Z0-9]{4,12}$", message= "닉네임은 최소 4자 이상, 12자 이하 알파벳 대소문자(a~z, A~Z), 숫자(0~9)로 구성하기")
    @NotBlank(message= "아이디는 필수 입력 값입니다")
    private String username;

    @Pattern(regexp= "^[a-z0-9]{4,32}$", message= "비밀번호는 최소 4자 이상이며, 32자 이하 알파벳 소문자(a~z), 숫자(0~9) 로 구성하기")
    @NotBlank(message= "비밀번호는 필수 입력 값입니다")
    private String password;

    private String passwordConfirm;
}
