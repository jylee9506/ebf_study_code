package com.example.ebf_spring_boot.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_board")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@ToString
public class Board {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment 기능
    private Integer bno;

    // 컬럼의 사이즈 지정해주고 not null 지정
    @Column(length = 200, nullable = false)
    private String title;

    private String content;

    private String writer;

    private Integer vCount;

    private Integer replyCount;

    private LocalDateTime regDate;

    private LocalDateTime updateDate;
}
