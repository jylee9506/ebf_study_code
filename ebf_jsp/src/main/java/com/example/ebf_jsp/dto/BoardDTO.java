package com.example.ebf_jsp.dto;


import java.time.LocalDateTime;


public class BoardDTO {

    private Integer bno;

    private String title;

    private String content;

    private String writer;

    private Integer vCount;

    private Integer replyCount;

    private LocalDateTime regDate;

    private LocalDateTime updateDate;


    /**
     *
     * Getter, Setter
     */

    public Integer getBno() {
        return bno;
    }

    public void setBno(Integer bno) {
        this.bno = bno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Integer getvCount() {
        return vCount;
    }

    public void setvCount(Integer vCount) {
        this.vCount = vCount;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }


    /**
     *
     * To String
     */
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


}
