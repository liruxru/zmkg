<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <link rel="stylesheet" type="text/css" href="/xyxmc/css/bootstrap.min.css">
  	<script type="text/javascript"  src="/xyxmc/js/jquery.min.js"></script>
  	<script type="text/javascript"  src="/xyxmc/js/bootstrap.min.js"></script>
  </head>
  <body>
  <h4><a href="pm">回到首页</a></h4>
<div class="table-responsive">
  <table class="table">
    <thead>
      <tr>
      	<th>编号</th>
        <th>方案</th>
        <th>灰</th>
        <th>硫</th>
        <th>挥发</th>
        <th>指数</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${jinMeiList }" var="jinMei"  varStatus="v">
     <tr>
        <td>${v.count }</td>
        <td>${jinMei.peibiFangAn }</td>
        	<c:forEach items="${jinMei.zhibiao }" var="zhibiao"  varStatus="v">
  				  <td><fmt:formatNumber pattern="##.00"  value="${zhibiao.value }"/></td>
  			</c:forEach>
      </tr>
  	</c:forEach>
    </tbody>
  </table>
</div>
  	
 			
 
  		
  		
  </body>
</html>
