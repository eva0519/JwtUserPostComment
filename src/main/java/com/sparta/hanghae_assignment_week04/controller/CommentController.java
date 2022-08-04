package com.sparta.hanghae_assignment_week04.controller;

import com.sparta.hanghae_assignment_week04.dto.BoardRequestDto;
import com.sparta.hanghae_assignment_week04.dto.CommentRequestDto;
import com.sparta.hanghae_assignment_week04.dto.ResponseDto;
import com.sparta.hanghae_assignment_week04.security.UserDetailsImpl;
import com.sparta.hanghae_assignment_week04.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CommentController {
    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/auth/comments")
    public ResponseDto<?> addComment(
            @RequestBody CommentRequestDto requestDto,
            @AuthenticationPrincipal UserDetailsImpl userDetails

    ){
        return commentService.addComment( requestDto , userDetails.getUser() );
    }

    @GetMapping("/comments/{id}")
    public ResponseDto<?> getComments( @PathVariable Long id ){
        return commentService.getComments( id );
    }

    @PutMapping("/auth/comments/{id}")
    public ResponseDto<?> updateComment(@PathVariable Long id,
                                        @RequestBody CommentRequestDto requestDto,
                                        @AuthenticationPrincipal UserDetailsImpl userDetails){
        return commentService.updateComment( id , requestDto , userDetails.getUser() );
    }

    @DeleteMapping("/auth/comments/{id}")
    public ResponseDto<?> deleteComment(@PathVariable Long id,
                                        @AuthenticationPrincipal UserDetailsImpl userDetails) {
        return commentService.deleteComment( id , userDetails.getUser() );
    }
}

