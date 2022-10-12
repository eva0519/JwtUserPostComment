package com.sparta.JwtUserPostComment.model;


import com.sparta.JwtUserPostComment.dto.BoardRequestDto;
import com.sparta.JwtUserPostComment.utils.Timestamped;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Setter
@Getter // get 함수를 일괄적으로 만들어줍니다.
@NoArgsConstructor // 기본 생성자를 만들어줍니다.
@Entity // DB 테이블 역할을 합니다.
public class Board extends Timestamped {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String author;

    @ManyToOne
    @JoinColumn( name = "USER_ID", nullable = false)
    private Users user;

    public Board(BoardRequestDto requestDto , Users user ){
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
        this.user = user;
        this.author = user.getUsername();
    }

    public void updateBoard(BoardRequestDto requestDto) {
            this.title = requestDto.getTitle();
            this.content = requestDto.getContent();
    }
}
