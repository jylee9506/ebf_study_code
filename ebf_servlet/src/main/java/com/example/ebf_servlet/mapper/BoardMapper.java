package com.example.ebf_servlet.mapper;

import com.example.ebf_servlet.domain.BoardVO;

import java.util.List;

public interface BoardMapper {

    List<BoardVO> selectList(Integer bno);
}
