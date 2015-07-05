<%@tag pageEncoding="utf-8"%>
<html>
<head>
<title>注册信息</title>
</head>
<body bgcolor="skyblue">
<table align="center" height="100%" width="60%">
<form method="post" action="login.jsp" >
<tr><td align="center" colspan="2" bgcolor="skyblue">注册信息</td></tr>
<tr><td align="center" bgcolor="skyblue">用&nbsp;户&nbsp;名:</td><td align="center" bgcolor="skyblue"><input type="text" name="userName"/></td></tr>
<tr>
<td align="center" bgcolor="skyblue">密&nbsp;&nbsp;&nbsp;&nbsp;码:</td><td align="center" bgcolor="skyblue"><input type="password" name="password"></td>
</tr>
<tr>
<td align="center" bgcolor="skyblue">重复密码:</td><td align="center" bgcolor="skyblue"><input type="password" name="repassword"></td>
</tr>
<tr><td align="center" bgcolor="skyblue">真实姓名:</td><td align="center" bgcolor="skyblue"><input type="text" name="name"/></td></tr>
<tr>
<td align="center"bgcolor="skyblue">性&nbsp;&nbsp;&nbsp;&nbsp;别:</td>
<td align="center"bgcolor="skyblue">
男性 <input type="radio" name="gender" value="male"/ checked>
女性<input type="radio" name="gender" value="female">
</td>
</tr>
<tr>
<td align="center"bgcolor="skyblue" >身份证号码:</td>
<td align="center" bgcolor="skyblue"><input type="text" name="cid"></td>
</tr>
<tr>
<td align="center"bgcolor="skyblue" >手机号码:</td>
<td align="center" bgcolor="skyblue"><input type="text" name="telephone"></td>
</tr>
<tr>
<td align="center"bgcolor="skyblue" >电子邮箱:</td>
<td align="center" bgcolor="skyblue"><input type="text" name="email"></td>
</tr>
<tr>
<td align="center"bgcolor="skyblue" >地址:</td>
<td align="center" bgcolor="skyblue"><input type="text" name="address"></td>
</tr>
<tr>
<td colspan="2" align="center" bgcolor="skyblue">
<input type="submit" value="提交">
</tr>
</form>
</table>
</body>
</html>