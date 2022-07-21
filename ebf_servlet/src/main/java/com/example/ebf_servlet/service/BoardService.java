package com.example.ebf_servlet.service;


import com.example.ebf_servlet.domain.BoardVO;
import com.example.ebf_servlet.dto.BoardDTO;
import com.example.ebf_servlet.dto.ListDTO;

import java.util.List;

public interface BoardService {

    List<BoardDTO> getList(ListDTO listDTO);
}
