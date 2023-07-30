package com.an.nolguga.controller;

import com.an.nolguga.service.posts.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final MemberService memberService;

    @GetMapping("/")
    public String postsSave(Model model) {
        model.addAttribute("posts", "post");;
        return "board";
    }

}
