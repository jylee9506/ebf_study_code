package com.example.ebf_jsp.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@ToString
@Builder
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자를 생성
@NoArgsConstructor // 파라미터가 없는 기본 생성자를 생성
public class BoardVO {

    private Integer bno;

    private String title;

    private String content;

    private String writer;

    private Integer vcount;

    private Integer replycount;

    private LocalDateTime regDate;

    private LocalDateTime updateDate;

}
