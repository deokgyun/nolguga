package com.an.nolguga.domain.FreeBoard;

import com.an.nolguga.domain.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class FreeBoard extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardNum;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String nickname;

    @Builder
    public FreeBoard(String title, String content, String nickname) {
        this.title = title;
        this.content = content;
        this.nickname = nickname;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
