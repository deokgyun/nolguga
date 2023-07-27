package com.an.nolguga.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FreeBoardUpdateRequestDto {
    private String title;
    private String content;

    @Builder
    public FreeBoardUpdateRequestDto(String title, String content){
        this.title = title;
        this.content = content;
    }
}

