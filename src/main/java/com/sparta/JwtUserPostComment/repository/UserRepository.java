package com.sparta.JwtUserPostComment.repository;

import com.sparta.JwtUserPostComment.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository  extends JpaRepository<Users, Long> {
    Optional<Users> findByUsername(String username);
    boolean existsByUsername( String username );

}
