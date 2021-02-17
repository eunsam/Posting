package com.eunsam.Posting.service;

import com.eunsam.Posting.domain.repository.BoardRepository;
import com.eunsam.Posting.dto.BoardDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class BoardService {

    private BoardRepository boardRepository;

    @Transactional
    public Long savePost(BoardDto boardDto){
        return boardRepository.save(boardDto.toEntity).getId();

    }
}
