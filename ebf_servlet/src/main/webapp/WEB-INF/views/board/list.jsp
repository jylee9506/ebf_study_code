<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.apache.ibatis.session.SqlSessionFactory" %>
<%@ page import="org.apache.ibatis.session.SqlSession" %>
<%@ page import="java.util.*" %>
<%@ page import="com.example.ebf_servlet.session.SqlSessionMange" %>
<%@ page import="com.example.ebf_servlet.domain.BoardVO" %>
<%@ page import="java.nio.charset.Charset" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="ko">
<%@ include file="/WEB-INF/include/basic_header.jsp" %>


<!-- Page content-->
<div class="container-fluid">
    <table class="table text-center table-hover">
        <thead>
        <tr>
            <th scope="col" class="col-1">카테고리</th>
            <th scope="col" class="col-1">첨부파일</th>
            <th scope="col" class="col-4">제목</th>
            <th scope="col" class="col-1">작성자</th>
            <th scope="col" class="col-1">조회수</th>
            <th scope="col" class="col-1">등록 일시</th>
            <th scope="col" class="col-1">수정 일시</th>
        </tr>
        </thead>
        <tbody>
        <%-- 게시글              =======================================================================--%>
        <%
            SqlSessionFactory sessionFactory = new SqlSessionMange().getSqlSession();

            SqlSession sqlSession = sessionFactory.openSession();

            List<BoardVO> list = sqlSession.selectList("com.example.ebf_servlet.mapper.BoardMapper.selectList");

            System.out.println(Charset.defaultCharset().displayName());

            request.setAttribute("list", list);

        %>
        <c:forEach var="list" items="${list}">
            <tr>
                <td>${list.bno}</td>
                <td>${list.bno}</td>
                <td>
                    <c:out value="${list.title}"/>
                </td>
                <td>${list.writer}</td>
                <td>${list.vCount}</td>
                <td>${list.regDate}</td>
                <td>${list.updateDate}</td>
            </tr>
        </c:forEach>

        <%-- 게시글 끝              =======================================================================--%>
        </tbody>
    </table>
</div>

</div>
</div>
<!-- Bootstrap core JS-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->

</body>
</html>
