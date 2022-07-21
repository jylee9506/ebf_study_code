package com.example.ebf_servlet.dto;

import java.time.LocalDateTime;
import java.util.Objects;

public class BoardDTO {

    private Integer bno;

    private String title;

    private String content;

    private String writer;

    private Integer vcount;

    private Integer replycount;

    private LocalDateTime regDate;

    private LocalDateTime updateDate;

    public BoardDTO() {
        this.bno = bno;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.vcount = vcount;
        this.replycount = replycount;
        this.regDate = regDate;
        this.updateDate = updateDate;
    }

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

    public Integer getVcount() {
        return vcount;
    }

    public Integer getReplycount() {
        return replycount;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setBno(Integer bno) {
        this.bno = bno;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setVcount(Integer vcount) {
        this.vcount = vcount;
    }

    public void setReplycount(Integer replycount) {
        this.replycount = replycount;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "bno=" + bno +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", vcount=" + vcount +
                ", replycount=" + replycount +
                ", regDate=" + regDate +
                ", updateDate=" + updateDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardDTO boardDTO = (BoardDTO) o;
        return Objects.equals(bno, boardDTO.bno) && Objects.equals(title, boardDTO.title) && Objects.equals(content, boardDTO.content) && Objects.equals(writer, boardDTO.writer) && Objects.equals(vcount, boardDTO.vcount) && Objects.equals(replycount, boardDTO.replycount) && Objects.equals(regDate, boardDTO.regDate) && Objects.equals(updateDate, boardDTO.updateDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bno, title, content, writer, vcount, replycount, regDate, updateDate);
    }
}
