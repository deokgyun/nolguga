package com.an.nolguga.domain.comment;

import com.an.nolguga.domain.BaseTimeEntity;
import com.an.nolguga.domain.board.Board;
import com.an.nolguga.domain.member.Member;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "comment")
public class Comment extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "content")
    private String content;

    @Builder
    public Comment(Long id, Board board, Member member, String content) {
        this.id = id;
        this.board = board;
        this.member = member;
        this.content = content;
    }

    // getters and setters
}
