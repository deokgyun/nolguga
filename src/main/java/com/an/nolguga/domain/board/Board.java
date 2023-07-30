package com.an.nolguga.domain.board;

import com.an.nolguga.domain.BaseTimeEntity;
import com.an.nolguga.domain.comment.Comment;
import com.an.nolguga.domain.member.Member;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "board")
public class Board extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "title")
    private String title;

    @Column(name = "content", length = 1000)
    private String content;

    @Column(name = "liked")
    private Long liked;

    @Column(name = "category")
    private Integer category;

    @OneToMany(mappedBy = "board")
    private List<BoardFile> boardFiles;

    @OneToMany(mappedBy = "board")
    private List<Comment> comments;



    @Builder
    public Board(Long id, Member member, String title, String content, Long liked, Integer category, List<BoardFile> boardFiles, List<Comment> comments) {
        this.id = id;
        this.member = member;
        this.title = title;
        this.content = content;
        this.liked = liked;
        this.category = category;
        this.boardFiles = boardFiles;
        this.comments = comments;
    }
}
