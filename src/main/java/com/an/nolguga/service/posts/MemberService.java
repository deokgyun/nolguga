package com.an.nolguga.service.posts;

import com.an.nolguga.domain.member.Member;
import com.an.nolguga.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void save(Member member){
        memberRepository.save(member);
    }

}
