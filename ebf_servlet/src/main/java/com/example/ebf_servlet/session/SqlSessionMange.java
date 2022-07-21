package com.example.ebf_servlet.session;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class SqlSessionMange {

    private SqlSessionFactory sessionFactory;

    public SqlSessionMange() {

        String resource = "mybatis-config.xml";

        try {

            InputStream inputStream = Resources.getResourceAsStream(resource);

            sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    } // end

    public SqlSessionFactory getSqlSession() {
        return this.sessionFactory;
    }

}
