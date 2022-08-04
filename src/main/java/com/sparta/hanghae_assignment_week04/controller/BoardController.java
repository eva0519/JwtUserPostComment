package com.sparta.hanghae_assignment_week04.controller;

import com.sparta.hanghae_assignment_week04.dto.BoardRequestDto;
import com.sparta.hanghae_assignment_week04.dto.ResponseDto;
import com.sparta.hanghae_assignment_week04.security.UserDetailsImpl;
import com.sparta.hanghae_assignment_week04.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.annotation.CurrentSecurityContext;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api")
public class BoardController {
    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/auth/boards")
    public ResponseDto<?> addBoard(
            @RequestBody BoardRequestDto requestDto,
            @AuthenticationPrincipal UserDetailsImpl userDetails
            ){
        return boardService.addBoard( requestDto , userDetails.getUser() );
    }

    @GetMapping("/boards")
    public ResponseDto<?> getBoards(){
        return boardService.getBoards();
    }

    @PutMapping("/auth/boards/{id}")
    public ResponseDto<?> updateBoard(@PathVariable Long id,
                                      @RequestBody BoardRequestDto requestDto,
                                      @AuthenticationPrincipal UserDetailsImpl userDetails ){
        return boardService.updateBoard( id , requestDto ,userDetails.getUser() );
    }

    @DeleteMapping("/auth/boards/{id}")
    public ResponseDto<?> deleteBoard(@PathVariable Long id,
                                      @AuthenticationPrincipal UserDetailsImpl userDetails){
        return boardService.deleteBoard( id , userDetails.getUser() );
    }
}
