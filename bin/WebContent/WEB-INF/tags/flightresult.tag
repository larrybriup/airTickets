<%@tag pageEncoding="utf-8" %>
<%@taglib uri="/struts-tags" prefix="s" %>

<table width="900" align="center" border="1">
  <tr>
    <th>航班号</th>
    <th>出发城市</th>
    <th>到达城市</th>
    <th>出发日期</th>
    <th>头等舱剩余</th>
    <th>头等舱价格</th>
    <th>商务舱剩余</th>
    <th>商务舱价格</th>
    <th>经济舱剩余</th>
    <th>经济舱价格</th>
    <th>预定</th>
  </tr>
  <tr>
  
   <td align="center">10010</td>
    <td align="center">上海浦东</td>
    <td align="center">桂林</td>
    <td align="center">12-12-12</td>
    <td align="center">15</td>
    <td align="center">567</td>
    <td align="center">100</td>
    <td align="center">445</td>
    <td align="center">49</td>
    <td align="center">211</td>
    <td aligh="center">
    <%-- 
    <s:url action="order" id="orderURL"></s:url>
    --%>
    
    <a href=order.jsp>预订</a>
  </tr>
</table>
<br>
</center>
</body>
</html>