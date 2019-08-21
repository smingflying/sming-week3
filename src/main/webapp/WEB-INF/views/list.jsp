<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<script type="text/javascript">
	function qx(own) {
		$("[name='checkOne']").each(function () {
			this.checked=own.checked
		})
	
	}
	function plsc() {
		var ids = $("[name='checkOne']:checked").map(function () {
			return this.value
		}).get().join(",");
		if (confirm("确定删除吗？")) {
			location ="dels?ids="+ids
		}
	}
	function fenye(pageNum) {
		$("[name='pageNum']").val(pageNum)
		$("form").submit()
	}
</script>
</head>
<body>

	<div class="container-fluid">
		<form action="/" class="form">
			<input type="hidden" name="pageNum"> 姓名<input type="text"
				name="mh1" value="${mh1 }"> 省市<input type="text" name="mh2"
				value="${mh2 }"> 专业<input type="text" name="mh3"
				value="${mh3 }"> <input type="submit" value="查询"
				class="btn btn-primary">
		</form>
		<div class="table-responsive">
			<table
				class="table table-striped table-bordered table-hover text-center">
				<tr>
					<th><input type="checkbox" name="checkAll" onclick="qx(this)"></th>
					<th>id</th>
					<th>注册人</th>
					<th>性别</th>
					<th>省市</th>
					<th>申请注册单位</th>
					<th>所学专业</th>
					<th>注册专业1</th>
					<th>注册专业2</th>
					<th>执业资格证书编号</th>
					<th>注册号</th>
					<th>有效期</th>
					<th>操作</th>

				</tr>
				<c:forEach items="${page.records }" var="r">
					<tr>
						<td><input type="checkbox" name="checkOne" value="${r.id }"></td>
						<td>${r.id }</td>
						<td>${r.name }</td>
						<td>${r.sex }</td>
						<td>${r.addr }</td>
						<td>${r.company }</td>
						<td>${r.sxzy }</td>
						<td>${r.pro1.name}</td>
						<td>${r.pro2.name }</td>
						<td>${r.zyzgzsid }</td>
						<td>${r.registid }</td>
						<td><fmt:formatDate value="${r.yxdate }" pattern="yyyy-MM-dd" /></td>
						<td><a href="/toUpdate?id=${r.id }">编辑</a></td>
					</tr>
				</c:forEach>
				<tr>
					<td colspan="15">共${page.total }条数据
						<button onclick="fenye(${page.current==1?1:page.current-1 })"
							class="btn btn-link">上一页</button>
						<button
							onclick="fenye(${page.current==page.getPages()?page.getPages():page.current+1 })"
							class="btn btn-link">下一页</button> 第${page.current }页/共${page.getPages() }页
						<button onclick="plsc()" class="btn btn-danger">批量删除</button>

					</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>