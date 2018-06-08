<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<link rel="stylesheet" type="text/css" href="${root}/css/bootstrap.min.css">
  	<script type="text/javascript"  src="${root}/js/jquery.min.js"></script>
  	<script type="text/javascript"  src="${root}/js/bootstrap.min.js"></script>
  </head>
  
  <body>
	<div style="padding: 50px 100px 10px;">
    <form class="bs-example bs-example-form" role="form"  action="add"  method="post">
        <div class="input-group input-group-lg">
            <span class="input-group-addon">煤种</span>
           <input class="form-control"  value="${yuanmeiDo.name }"  name="yuanmei.name" />
        </div>
        <br>
         <div class="input-group input-group-lg">
            <span class="input-group-addon">灰分</span>
            <input  class="form-control"  value="${yuanmeiDo.hui }"  name="yuanmei.hui" />
        </div>
        <br>
         <div class="input-group input-group-lg">
            <span class="input-group-addon">硫份</span>
            <input  class="form-control" value="${yuanmeiDo.liu }"  name="yuanmei.liu" />
        </div>
        <br>
         <div class="input-group input-group-lg">
            <span class="input-group-addon">挥发</span>
            <input  class="form-control"  value="${yuanmeiDo.huifa }"  name="yuanmei.huifa" />
        </div>
        <br>
         <div class="input-group input-group-lg">
            <span class="input-group-addon">指数</span>
            <input  class="form-control" value="${yuanmeiDo.zhishu }"  name="yuanmei.zhishu" />
        </div>
        <br>
       <div class="input-group input-group-lg">
            <span class="input-group-addon">回收</span>
            <input  class="form-control"  value="${yuanmeiDo.huishou }"  name="yuanmei.huishou" />
        </div><br/>
        
   
        <div class="input-group input-group-lg">
            <span class="input-group-addon">成本</span>
            <input  class="form-control" value="${yuanmeiDo.chengben }"  name="yuanmei.chengben" />
        </div><br/>
        
        <div class="form-group">
		    <div class="col-sm-offset-6 col-sm-12">
		     <input type="hidden" value="${yuanmeiDo.id }" name="yuanmei.id"/>
		      <button type="submit" class="btn btn-default">提交</button>
		    </div>
  		</div>
    </form>
	</div>
  
  </body>
</html>
