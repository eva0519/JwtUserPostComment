package com.sparta.JwtUserPostComment.repository;


import com.sparta.JwtUserPostComment.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
}
