package com.an.nolguga.dto;

import com.an.nolguga.domain.board.Board;
import com.an.nolguga.domain.comment.Comment;
import com.an.nolguga.domain.member.Member;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class MemberRequest {
    private Long id;
    private String email;
    private String password;
    private String nickname;
    private String agreeTOS;
    private String agreePICU;
    private String agreeInfo;
    private String gender;
    private String status;
    private List<Board> boards;
    private List<Comment> comments;
    private Member.RoleType roleType;

}
