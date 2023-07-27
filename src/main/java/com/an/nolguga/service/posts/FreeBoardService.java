package com.an.nolguga.service.posts;

import com.an.nolguga.domain.FreeBoard.FreeBoard;
import com.an.nolguga.domain.FreeBoard.FreeBoardRepository;
import com.an.nolguga.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class FreeBoardService {
    private final FreeBoardRepository postsRepository;
    @Transactional
    public Long save(FreeBoardSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getBoardNum();
    }

    @Transactional
    public Long update(Long id, FreeBoardUpdateRequestDto requestDto){
        FreeBoard posts = postsRepository.findById(id)
                .orElseThrow(() -> new
                        IllegalArgumentException("해당 게시글이 없습니다. id = " + id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    public FreeBoardResponseDto findById(Long id){
        FreeBoard entity = postsRepository.findById(id)
                .orElseThrow(() -> new
                        IllegalArgumentException("해당 게시글이 없습니다. id = " + id));

        return new FreeBoardResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<FreeBoardListResponseDto> findAllDesc(){
        return postsRepository.findAllDesc().stream()
                .map(FreeBoardListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public void delete(Long id){
        FreeBoard posts = postsRepository.findById(id)
                .orElseThrow(() -> new
                        IllegalArgumentException("해당 게시글이 없습니다. id = " + id));

        postsRepository.delete(posts);
    }
    public FreeBoardrelationDto findBy(Long id){
        FreeBoard entity = postsRepository.findById(id)
                .orElseThrow(() -> new
                        IllegalArgumentException("해당 게시글이 없습니다. id = " + id));

        return new FreeBoardrelationDto(entity);
    }

}
