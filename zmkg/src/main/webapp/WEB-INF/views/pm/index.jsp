<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <link rel="stylesheet" type="text/css" href="${root}/css/bootstrap.min.css">
  	<script type="text/javascript"  src="${root}/js/jquery.min.js"></script>
  	<script type="text/javascript"  src="${root}/js/bootstrap.min.js"></script>
  <style type="text/css">
  	input{width: 60px;}
	tr:HOVER {
		background: red;
	}
	
	

  
  </style>
  
  </head>
  <body>
  <form  action="jisuan"  method="post">
<table class="table table-striped">
  <thead>
    <tr>
      <th>指标名</th>
      <th>灰分</th>
      <th>硫份</th>
      <th>挥发份</th>
      <th>指数</th>
    </tr>
  </thead>
  <tbody>
   	<c:forEach items="${jinmeiList }" var="jinmei"  begin="0" end="0">
	  		<input  type="hidden"  value="${jinmei.id }"  name="highId" />
	  		<tr>
  				<td width="150px;">${jinmei.name }<input  type="hidden" value="${jinmei.name }"  name="highName" /></td>
	  			<td><input   value="${jinmei.hui }"  name="highHui" /></td>
	  			<td><input   value="${jinmei.liu }"  name="highLiu" /></td>
	  			<td><input   value="${jinmei.huifa}"  name="highHuifa" /></td>
	  			<td><input   value="${jinmei.zhishu }"  name="highZhishu" /></td>
  			</tr>
	  	</c:forEach>
   		<c:forEach items="${jinmeiList }" var="jinmei"  begin="1" end="1">
	  		<input  type="hidden"  value="${jinmei.id }"  name="lowId" />
	  		<tr>
  				<td>${jinmei.name }<input  type="hidden" value="${jinmei.name }"  name="lowName" /></td>
	  			<td><input   value="${jinmei.hui }"  name="lowHui" /></td>
	  			<td><input   value="${jinmei.liu }"  name="lowLiu" /></td>
	  			<td><input   value="${jinmei.huifa}"  name="lowHuifa" /></td>
	  			<td><input   value="${jinmei.zhishu }"  name="lowZhishu" /></td>
  			</tr>	
	  	</c:forEach>   
    <tr>
      <td>最大铲数：</td>
      <td><input name="zuiDaChanShu"  value="5"/></td>
      <td>${errorMsg }</td>
      <td><a href="goAdd" ><button type="button" class="btn btn-primary">添加原煤</button></a></td>
      <td><input type="submit"  class="btn btn-success" value="计算" /></td>
    </tr>
  </tbody>
</table>
  
  <table class="table table-bordered">
  	<thead>
  		<tr>
  			<td>全选<input type="checkbox"  class="checkBtn" value="${yuanmei.id }"  name="yuanmei.id" /></td>
  			<td>编号</td>
  			<td>煤种</td>
  			<td>灰分</td>
  			<td>硫分</td>
  			<td>挥发</td>
  			<td>指数</td>
  			<td>回收</td>
  			<td>成本</td>
  			<td>操作</td>
  		</tr>
  	
  	</thead>
  	<tbody>
  			<c:forEach items="${yuanmeiList }" var="yuanmei"  varStatus="v">
  			<tr>
	  			<td><input type="checkbox"  value="${yuanmei.id }"  name="ids" /></td>
	  			<td>${v.count }</td>
	  			<td>${yuanmei.name }</td>
	  			<td>${yuanmei.hui }</td>
	  			<td>${yuanmei.liu }</td>
	  			<td>${yuanmei.huifa}</td>
	  			<td>${yuanmei.zhishu }</td>
	  			<td>${yuanmei.huishou}</td>
	  			<td>${yuanmei.chengben }</td>
	  			<td><a href="edit?id=${yuanmei.id }"><button type="button" class="btn btn-info">编辑</button></a></td>
  			</tr>
  			</c:forEach>
  	</tbody>
  	
  
  </table>
  		</form>
  </body>
</html>
