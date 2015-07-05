<%@tag pageEncoding="utf-8" %>
<center>
<script type="text/javascript">
 setInterval("curTime.innerHTML=new Date().toLocaleString()+' 星期'+'日一二三四五六'.charAt(new Date().getDay());",1000);
</script>
<table>
<tr><td width="220" align="right">您好，欢迎光临本站</td><td width="400" align="right" style="color:red"> <div id="curTime" style="z-index:99;">
        </div>
</td>
<td width="40%" align="right"><a href="index.jsp">首页</a>|
<a href="alogin.jsp">管理员登陆</a>|
<a href="register.jsp">注册</a>|
<a href="exit.action">退出</a>
</table>
</center>