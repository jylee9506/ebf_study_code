package com.example.ebf_jsp.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardDTO {

    private Integer bno;

    private String title;

    private String content;

    private String writer;

    private Integer vcount;

    private Integer replycount;

    private LocalDateTime regDate;

    private LocalDateTime updateDate;
}
