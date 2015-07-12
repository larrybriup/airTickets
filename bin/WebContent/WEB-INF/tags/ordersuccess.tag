<%@tag pageEncoding="utf-8" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<title>航班信息列表</title>
</head>
<body>
<h3 align="center">航班信息列表</h3>
<table width="800" align="center" border="1">
  <tr>
    <th>机票编号</th>
    <th>航班号</th>
    <th>乘客姓名</th>
    <th>身份证号码</th>
    <th>出票日期</th>
    <th>仓位等级</th>
    <th>乘客类型</th>
    <th>退票</th>
  </tr>
  <%--<s:iterator value="tickets" status="status">--%>
  <tr>
    <td align="center">10010</td>
    <td align="center">10010</td>
    <td align="center">张三</td>
    <td align="center">1234567</td>
    <td align="center">12-12-10</td>
    <td align="center">经济仓</td>
    <td align="center">成人</td>
    <td align="center">
    <a onclick="javascript:return confirm('are you sure?')" 
    href="refund.jsp">退票</a>
    </td>
    </tr>
     <tr>
    <td align="center">10010</td>
    <td align="center">10010</td>
    <td align="center">张三</td>
    <td align="center">1234567</td>
    <td align="center">12-12-10</td>
    <td align="center">经济仓</td>
    <td align="center">成人</td>
    <td align="center">
    <a onclick="javascript:return confirm('are you sure?')" 
    href="refund.jsp">退票</a>
    </td>
    </tr>
     <tr>
    <td align="center">10011</td>
    <td align="center">10011</td>
    <td align="center">李四</td>
    <td align="center">1234567</td>
    <td align="center">12-12-10</td>
    <td align="center">经济仓</td>
    <td align="center">成人</td>
    <td align="center">
    <a onclick="javascript:return confirm('are you sure?')" 
    href="refund.jsp">退票</a>
    </td>
    </tr>
     <tr>
    <td align="center">10012</td>
    <td align="center">10012</td>
    <td align="center">王五</td>
    <td align="center">1234567</td>
    <td align="center">12-12-10</td>
    <td align="center">经济仓</td>
    <td align="center">儿童</td>
    <td align="center">
    <a onclick="javascript:return confirm('are you sure?')" 
    href="refund.jsp">退票</a>
    </td>
    </tr>
  <%--</s:iterator>--%>
</table>
<br>
</body>
</html>
