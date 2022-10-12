package com.sparta.JwtUserPostComment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class JwtUserPostCommentApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtUserPostCommentApplication.class, args);
    }

}
