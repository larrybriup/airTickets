<%@tag pageEncoding="utf-8" %>
<%@taglib uri="/struts-tags" prefix="s" %>

<html>
<head>
<title>航班信息列表</title>
</head>
<body>
<h3 align="center">航班信息列表</h3>
<table width="700" align="center" border="1">
  <tr>
   <th>航班号</th>
    <th>出发城市</th>
    <th>到达城市</th>
    <th>出发日期</th>
    <th>头等舱剩余</th>
    <th>商务舱剩余</th>
    <th>经济舱剩余</th>
     <th>预定</th>
  </tr>
  <%-- <s:iterator value="flights" status="status">--%>
    <tr>
    <td align="center">100</td>
    <td align="center">南京</td>
    <td align="center">西安</td>
    <td align="center">12-5-10</td>
    <td align="center">20</td>
    <td align="center">30</td>
    <td align="center">100</td>
    <td><a href=”order.jsp“>预订</a></td>
    </tr>
    <tr>
    <td align="center">100</td>
    <td align="center">南京</td>
    <td align="center">西安</td>
    <td align="center">12-5-10</td>
    <td align="center">20</td>
    <td align="center">30</td>
    <td align="center">100</td>
    <td><a href=”order.jsp“>预订</a></td>
    </tr>
    <tr>
    <td align="center">100</td>
    <td align="center">南京</td>
    <td align="center">西安</td>
    <td align="center">12-5-10</td>
    <td align="center">20</td>
    <td align="center">30</td>
    <td align="center">100</td>
    <td><a href=”order.jsp“>预订</a></td>
    </tr>
    <tr>
    <td align="center">100</td>
    <td align="center">南京</td>
    <td align="center">西安</td>
    <td align="center">12-5-10</td>
    <td align="center">20</td>
    <td align="center">30</td>
    <td align="center">100</td>
    <td><a href=”order.jsp“>预订</a></td>
    </tr>
    <tr>
    <td align="center">100</td>
    <td align="center">南京</td>
    <td align="center">西安</td>
    <td align="center">12-5-10</td>
    <td align="center">20</td>
    <td align="center">30</td>
    <td align="center">100</td>
    <td><a href=”order.jsp“>预订</a></td>
    </tr>
    <tr>
    <td align="center">100</td>
    <td align="center">南京</td>
    <td align="center">西安</td>
    <td align="center">12-5-10</td>
    <td align="center">20</td>
    <td align="center">30</td>
    <td align="center">100</td>
    <td><a href=”order.jsp“>预订</a></td>
    </tr>
  <%--</s:iterator>--%>
</table>
<br>
</body>
</html>
