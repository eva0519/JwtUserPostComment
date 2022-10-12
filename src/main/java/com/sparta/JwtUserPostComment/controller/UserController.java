package com.sparta.JwtUserPostComment.controller;


import com.sparta.JwtUserPostComment.model.Users;
import com.sparta.JwtUserPostComment.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/me")
    public Users getMyInfo() {
        return userService.getMyInfo();
    }

    @GetMapping("/{username}")
    public Users getUserInfo(@PathVariable String username) {
        return userService.getUserInfo( username );
    }

}

