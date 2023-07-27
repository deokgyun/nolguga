package com.an.nolguga.dto;

import com.an.nolguga.domain.FreeBoard.FreeBoard;
import lombok.Getter;

@Getter
public class FreeBoardResponseDto {
    private Long id;
    private String title;
    private String content;
    private String nickname;

    public FreeBoardResponseDto(FreeBoard entity){
        this.id = entity.getBoardNum();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.nickname = entity.getNickname();
    }

}
