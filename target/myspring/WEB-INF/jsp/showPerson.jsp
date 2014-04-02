<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
        <tr>
            <th colspan="3">Added Person</th>
        </tr>
        <tr>
            <td width="49%" align="right"><b>Name</b></td>
            <td width="2%">&nbsp;</td>
            <td width="49%"><c:out value="${person.name}"/></td>
        </tr>
        <tr>
            <td width="49%" align="right"><b>Age</b></td>
            <td width="2%">&nbsp;</td>
            <td width="49%"><c:out value="${person.age}"/></td>
        </tr>
        <tr>
            <td width="49%" align="right"><b>Sex</b></td>
            <td width="2%">&nbsp;</td>
            <td width="49%"><c:out value="${person.sex}"/></td>
        </tr>
        <tr>
            <td width="49%" align="right"><b>Location</b></td>
            <td width="2%">&nbsp;</td>
            <td width="49%"><c:out value="${person.location}"/></td>
        </tr>
        <tr>
            <td width="49%" align="right">&nbsp;</td>
            <td width="2%">&nbsp;</td>
            <td width="49%"><a href="index.htm">go back</a></td>
        </tr>
    </table>
</body>
</html>