package com.an.nolguga.dto;

import com.an.nolguga.domain.FreeBoard.FreeBoard;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FreeBoardSaveRequestDto {
    private String title;
    private String content;
    private String nickname;

    @Builder
    public FreeBoardSaveRequestDto(String title, String content, String nickname){
        this.title = title;
        this.content = content;
        this.nickname = nickname;
    }
    public FreeBoard toEntity() {
        return FreeBoard.builder()
                .title(title)
                .content(content)
                .nickname(nickname)
                .build();
    }
}
