package com.eunsam.Posting.dto;

import com.eunsam.Posting.domain.entity.BoardEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDto {

    public BoardEntity toEntity;
    private Long id;
    private String writer;
    private String title;
    private String content;
    private LocalDateTime createdData;
    private LocalDateTime modifiedData;

    public BoardEntity toEntity() {
        BoardEntity boardEntity = BoardEntity.builder()
                .id(id)
                .writer(writer)
                .title(title)
                .content(content)
                .build();
        return boardEntity;
    }

    @Builder
    public BoardDto(Long id, String writer, String title, String content, LocalDateTime createdData, LocalDateTime modifiedData) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.createdData = createdData;
        this.modifiedData = modifiedData;
    }
}
