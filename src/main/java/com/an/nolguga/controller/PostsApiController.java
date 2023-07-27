package com.an.nolguga.controller;

import com.an.nolguga.dto.FreeBoardResponseDto;
import com.an.nolguga.dto.FreeBoardSaveRequestDto;
import com.an.nolguga.dto.FreeBoardUpdateRequestDto;
import com.an.nolguga.service.posts.FreeBoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final FreeBoardService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody FreeBoardSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody FreeBoardUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public FreeBoardResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }

    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id){
        postsService.delete(id);
        return id;
    }
}
