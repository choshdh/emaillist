<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import = "com.javaex.vo.*" %>
<%@ page import = "com.javaex.dao.*" %>

<%
	request.setCharacterEncoding("utf-8");
	String lastName = request.getParameter("ln");
	String firstName = request.getParameter("fn");
	String email = request.getParameter("email");

	System.out.println(lastName);
	System.out.println(firstName);
	System.out.println(email);
	
	EmailVO vo = new EmailVO(5,lastName, firstName, email);
	
	EmaillistDAO edao = new EmaillistDAO();
	edao.insert(vo);
	
	response.sendRedirect("list.jsp");

%>