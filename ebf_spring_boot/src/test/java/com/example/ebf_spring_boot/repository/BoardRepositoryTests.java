package com.example.ebf_spring_boot.repository;

import com.example.ebf_spring_boot.entity.Board;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
@Log4j2
public class BoardRepositoryTests {

    @Autowired
    private BoardRepository repository;

    @Test
    public void InsertTest(){
        log.info("________________________________________________");
        log.info(repository);
        log.info("________________________________________________");

    }


}
