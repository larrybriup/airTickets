<%@tag pageEncoding="utf-8" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<center>
<table width="60%" align="center" height="100%">
<form method="post" action="shopingcart.jsp">
<body><tr><td colspan="2" align="center" bgcolor="skyblue">订票信息</td></tr>
<tr><td colspan="2" align="center" bgcolor="skyblue">&nbsp;</td></tr>
<tr><td align="center" bgcolor="skyblue">航班号:</td><td align="center" bgcolor="skyblue"><input name="flightnumber" type="text"></td></tr>
<tr>
		   <td bgcolor="skyblue" align="center">舱位等级:</td>
		   <td bgcolor="skyblue" align="center">
		     <select name="CabinClass">
			     <option value="firstClass">头等舱
                 <option value="businessClass">商务舱
                 <option value="economyClass">经济舱
			 </select>
		   </td>
		   	   <td></td>
		 </tr>
<tr><td align="center" bgcolor="skyblue">乘客姓名:</td><td align="center" bgcolor="skyblue"><input name="realName"type="text"></td></tr> 
<tr>
		   <td bgcolor="skyblue" align="center">乘客类型:</td>
		   <td align="center"  bgcolor="skyblue">
		     <select name="passengerType">
			     <option value="adult">成人&nbsp;&nbsp;
                 <option value="child">儿童&nbsp;&nbsp;
                 <option value="infant">婴儿&nbsp;&nbsp;
			 </select>
		   </td>
		   	   <td></td>
		 </tr>
<tr>
<td align="center" bgcolor="skyblue">乘客身份证号码:</td><td align="center" bgcolor="skyblue"><input name="certificationNumber" type="text"></td>
</tr>

<tr><td colspan="2" align="center"bgcolor="skyblue">&nbsp;</td></tr>
<tr>
<td colspan="2" align="center" bgcolor="skyblue">
<input value="预定" type="submit">
</td></tr>
</body></form></table>
</center>