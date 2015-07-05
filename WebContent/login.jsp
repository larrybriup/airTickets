<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="ui" tagdir="/WEB-INF/tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>XX航空公司票务系统</title>
	</head>
	<body background="image/logon2.jpg">
		<table width="100%" height="100%" border=1>
			<!-- logo -->
			<tr height="50">
				<td>
					<ui:logo />
				</td>
			</tr>
			<!-- data -->
			<tr>
				<td>
					<table border=1 width="100%" height="100%">
						<tr height="30px">
							<td>
								<ui:tool />
							</td>
						</tr>
						<tr>
							<td width="100%">
								<table border=1 width="100%" height="100%">
									<tr>
										<td width="200">
											<table border=0 width="100%" height="100%">
												<tr>
													<td>
														<ui:list />
													</td>
												</tr>
											</table>
										</td>
										<td>
											<table width="800" hight="600">
												<tr align="center">
													<td>
														<ui:login/>
													</td>
												</tr>
											</table>
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr height="50">
				<td>
                 <ui:foot/>
					<br>
				</td>
			</tr>
		</table>
	</body>
</html>
