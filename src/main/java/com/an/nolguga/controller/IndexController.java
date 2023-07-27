package com.an.nolguga.controller;

import com.an.nolguga.dto.FreeBoardResponseDto;
import com.an.nolguga.service.posts.FreeBoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final FreeBoardService postsService;

    @GetMapping("/")
    public String postsSave(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        return "board";
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }

    @GetMapping("/posts/{id}")
    public String postUpdate(@PathVariable Long id, Model model) {
        FreeBoardResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }

    @GetMapping("/posts")
    public String boardList(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        return "board";
    }

}
