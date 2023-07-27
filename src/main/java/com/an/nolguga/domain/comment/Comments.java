package com.an.nolguga.domain.comment;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COMMENT_NUM")
    private Long id;

    @Column(name = "MEMBER_NUM", nullable = false)
    private Long memberNum;

    @Column(name = "BOARD_NUM", nullable = false)
    private Long boardNum;

    private String com_content;
}
