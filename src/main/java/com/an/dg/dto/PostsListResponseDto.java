package com.an.dg.dto;

import com.an.dg.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;
@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private String createdDate;

    public PostsListResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.createdDate = entity.getCreatedDate();
    }
}
