package com.example.ebf_servlet.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class BoardVO {


    private Integer bno;

    private String title;

    private String content;

    private String writer;

    private Integer vCount;

    private Integer replyCount;

    private LocalDateTime regDate;

    private LocalDateTime updateDate;


    public Integer getBno() {
        return bno;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public Integer getvCount() {
        return vCount;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    @Override
    public String toString() {
        return "BoardVO{" +
                "bno=" + bno +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", vCount=" + vCount +
                ", replyCount=" + replyCount +
                ", regDate=" + regDate +
                ", updateDate=" + updateDate +
                '}';
    }


    public BoardVO(Integer bno, String title, String content, String writer, Integer vCount, Integer replyCount, LocalDateTime regDate, LocalDateTime updateDate) {
        this.bno = bno;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.vCount = vCount;
        this.replyCount = replyCount;
        this.regDate = regDate;
        this.updateDate = updateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardVO boardVO = (BoardVO) o;
        return Objects.equals(bno, boardVO.bno) && Objects.equals(title, boardVO.title) && Objects.equals(content, boardVO.content) && Objects.equals(writer, boardVO.writer) && Objects.equals(vCount, boardVO.vCount) && Objects.equals(replyCount, boardVO.replyCount) && Objects.equals(regDate, boardVO.regDate) && Objects.equals(updateDate, boardVO.updateDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bno, title, content, writer, vCount, replyCount, regDate, updateDate);
    }


}
