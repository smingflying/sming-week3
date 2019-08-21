<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 新 Bootstrap4 核心 CSS 文件 -->
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/css/bootstrap.min.css">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>

<!-- popper.min.js 用于弹窗、提示、下拉菜单 -->
<script
	src="https://cdn.staticfile.org/popper.js/1.12.5/umd/popper.min.js"></script>

<!-- 最新的 Bootstrap4 核心 JavaScript 文件 -->
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<form action="update" method="post">
		<table>
			<tr>
				<td>姓名</td>
				<td><input type="text" name="name" value="${reg.name }">
					<input type="hidden" name="id" value="${reg.id }"></td>
			</tr>
			<tr>
				<td>性别</td>
				<td><input type="radio" name="sex" value="男"
					${reg.sex=='男'? 'checked':'' }>男 <input type="radio"
					name="sex" value="女" ${reg.sex=='女'? 'checked':'' }>女</td>
			</tr>
			<tr>
				<td>省市</td>
				<td><input type="text" name="addr" value="${reg.addr}"></td>
			</tr>
			<tr>
				<td>注册单位</td>
				<td><input type="text" name="company" value="${reg.company }"></td>
			</tr>
			<tr>
				<td>所学专业</td>
				<td><input type="text" name="sxzy" value="${reg.sxzy }"></td>
			</tr>
			<tr>
				<td>注册专业1</td>
				<td><select name="pid1">
				<option value="">--请选择--</option>
						<c:forEach items="${list }" var="p">
							<option value="${p.id }" ${p.id==reg.pid1?'selected':'' }>${p.name }</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>注册专业2</td>
				<td><select name="pid2">
				<option value="">--请选择--</option>
						<c:forEach items="${list }" var="p">
							<option value="${p.id }" ${p.id==reg.pid2?'selected':'' }>${p.name }</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>职业资格证书编号</td>
				<td><input type="text" name="zyzgzsid" value="${reg.zyzgzsid }"></td>
			</tr>
			<tr>
				<td>注册编号</td>
				<td><input type="text" name="registid" value="${reg.registid }"></td>
			</tr>
			<tr>
				<td>有效期</td>
				
				<td><input type="date" name="yxdate" value="<fmt:formatDate value="${reg.yxdate }" pattern="yyyy-MM-dd"/>"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>