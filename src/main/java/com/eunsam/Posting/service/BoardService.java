package com.eunsam.Posting.service;

import com.eunsam.Posting.domain.repository.BoardRepository;
import com.eunsam.Posting.dto.BoardDto;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    private BoardRepository boardRepository;

    public Long savePost(BoardDto boardDto){
        return boardRepository.save(boardDto.toEntity()).getId();

    }
}
