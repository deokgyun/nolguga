package com.an.nolguga.domain.member;

import com.an.nolguga.domain.BaseTimeEntity;
import com.an.nolguga.domain.board.Board;
import com.an.nolguga.domain.comment.Comment;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "member")
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "agree_TOS")
    private String agreeTOS;

    @Column(name = "agree_PICU")
    private String agreePICU;

    @Column(name = "agree_info")
    private String agreeInfo;

    @Column(name = "gender")
    private String gender;

    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "member")
    private List<Board> boards;

    @OneToMany(mappedBy = "member")
    private List<Comment> comments;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    public enum RoleType{
        ADMIN, USER
    }

    @Builder
    public Member(Long id, RoleType roleType, String email, String password, String nickname, String agreeTOS, String agreePICU, String agreeInfo, String gender, String status, List<Board> boards, List<Comment> comments) {
        this.id = id;
        this.roleType = roleType;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.agreeTOS = agreeTOS;
        this.agreePICU = agreePICU;
        this.agreeInfo = agreeInfo;
        this.gender = gender;
        this.status = status;
        this.boards = boards;
        this.comments = comments;
    }

    // getters and setters
}
