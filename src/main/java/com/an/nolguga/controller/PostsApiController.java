package com.an.nolguga.controller;

import com.an.nolguga.domain.member.Member;
import com.an.nolguga.dto.MemberRequest;
import com.an.nolguga.service.posts.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final MemberService postsService;

    @PostMapping("/api/v1/posts")
    public ResponseEntity<MemberRequest> test(MemberRequest memberRequest) {
        log.info(memberRequest.getEmail());
        log.info(memberRequest.getNickname());
        return new ResponseEntity<>(memberRequest, HttpStatus.OK);
    }

}
