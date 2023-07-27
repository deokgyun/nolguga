package com.an.nolguga.dto;

import com.an.nolguga.domain.FreeBoard.FreeBoard;
import lombok.Getter;

@Getter
public class FreeBoardrelationDto {

    private String title;
    private String createdDate;

    public FreeBoardrelationDto(FreeBoard entity) {
        this.title = entity.getTitle();
        this.createdDate = entity.getCreatedDate();
    }
}
