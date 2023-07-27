package com.an.nolguga.domain.FreeBoard;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest{

    @Autowired
    FreeBoardRepository postsRepository;

    @After
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기() throws Exception{
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        postsRepository.save(FreeBoard.builder()
                .title(title)
                .content(content)
                .nickname("test")
                .build()
        );

        //when
        List<FreeBoard> postsList = postsRepository.findAll();

        //then
        FreeBoard posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }

    @Test
    public void BaseTimeEntity_등록(){
        //given
        LocalDateTime now = LocalDateTime.now();
        postsRepository.save(FreeBoard.builder()
                .title("title")
                .content("content")
                .nickname("nickname(")
                .build());

        // when
        List<FreeBoard> postsList = postsRepository.findAll();

        //then
        FreeBoard posts = postsList.get(0);

        System.out.println(">>>>>>>>>>> createDate = " + posts.getCreatedDate() + ", modifiedDate = " + posts.getModifiedDate());

//        assertThat(posts.getCreatedDate()).isAfter(now);
        assertThat(posts.getModifiedDate()).isAfter(now);

    }

}
