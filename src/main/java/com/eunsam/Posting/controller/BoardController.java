package com.eunsam.Posting.controller;

import com.eunsam.Posting.dto.BoardDto;
import com.eunsam.Posting.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class BoardController {
    private BoardService boardService;

    //리스트
    @GetMapping("/")
    public String list() {
        return "board/list.html";
    }

    //작성
    @GetMapping("/post")
    public String write() {
        return "board/write.html";
    }

    //저장
    @GetMapping("/post")
    public String write(BoardDto boardDto) {
        boardService.savePost(boardDto);

        return "redirect/";
    }

}
