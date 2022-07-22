package com.example.ebf_spring_boot.repository;

import com.example.ebf_spring_boot.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Integer> {


}
