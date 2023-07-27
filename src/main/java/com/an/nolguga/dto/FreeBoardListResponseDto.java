package com.an.nolguga.dto;

import com.an.nolguga.domain.FreeBoard.FreeBoard;
import lombok.Getter;

@Getter
public class FreeBoardListResponseDto {
    private Long id;
    private String title;
    private String nickname;
    private String createdDate;
    private int heart;
    private int commentCount;

    public FreeBoardListResponseDto(FreeBoard entity){
        this.id = entity.getBoardNum();
        this.title = entity.getTitle();
        this.nickname = entity.getNickname();
        this.createdDate = entity.getCreatedDate();
        this.commentCount = getCommentCount();
    }
}
