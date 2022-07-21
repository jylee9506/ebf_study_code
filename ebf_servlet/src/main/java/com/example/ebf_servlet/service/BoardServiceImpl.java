package com.example.ebf_servlet.service;

import com.example.ebf_servlet.domain.BoardVO;
import com.example.ebf_servlet.dto.BoardDTO;
import com.example.ebf_servlet.dto.ListDTO;
import com.example.ebf_servlet.session.SqlSessionMange;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.ArrayList;
import java.util.List;

public class BoardServiceImpl implements BoardService {


    @Override
    public List<BoardDTO> getList(ListDTO listDTO) {

        SqlSessionFactory sessionFactory = new SqlSessionMange().getSqlSession();

        SqlSession session = sessionFactory.openSession();

        List<BoardDTO> list = session.selectList("com.example.ebf_servlet.mapper.BoardMapper.selectList");
        ;

        session.close();

        return list;
    }
}
