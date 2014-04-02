<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Person</title>
<style type="text/css">
td span{color:red;}
</style>

</head>
<body>

<form:form commandName="person" action="showPerson.htm" method="post">
    <table>
        <tr>
            <th colspan="3">Add Person</th>
        </tr>
        <tr>
            <td width="49%" align="right">Name</td>
            <td width="2%">&nbsp;</td>
            <td width="49%"><form:input path="name" /><form:errors path="name"/></td>
        </tr>
        <tr>
            <td width="49%" align="right">Age</td>
            <td width="2%">&nbsp;</td>
            <td width="49%"><form:input path="age" /><form:errors path="age"/></td>
        </tr>
        <tr>
            <td width="49%" align="right">Sex</td>
            <td width="2%">&nbsp;</td>
            <td width="49%">Male: <form:radiobutton path="sex" value="male" />

            Female: <form:radiobutton path="sex" value="female" /><form:errors path="sex"/></td>
        </tr>
        <tr>
            <td width="49%" align="right">Location</td>
            <td width="2%">&nbsp;</td>
            <td width="49%">
                <form:select path="location">
                    <form:option value="Bangalore" />
                    <form:option value="Delhi" />
                    <form:option value="Kolkata" />
                    <form:option value="Mumbai" />
                </form:select><form:errors path="location"/></td>
        </tr>
        <tr>
            <td width="49%" align="right">&nbsp;</td>
            <td width="2%">&nbsp;</td>
            <td width="49%"><input type="submit" value="Save Changes" /></td>
        </tr>
    </table>

</form:form>
</body>
</html>