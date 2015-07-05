package com.briup.taglib;

import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class LoginTag extends TagSupport {
	private String imgurl;
	private String event;

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	
	public int doEndTag() throws JspException {
		JspWriter out = pageContext.getOut();
		// �ж�session�Ƿ��¼
		HttpSession session = pageContext.getSession();
		try {
			if (session != null && session.getAttribute("login") != null) {
				// ����Ѿ���¼����ʾ�û�ά��UI
				out.println("�Ѿ���¼");
			} else {
				// û�е�¼����ʾ��¼UI
				out.println("<div>");
				out.println("<table border=0 width='100%' height='100%'>");
				out.println("<form method='post' action='select.jsp' >");
				
				out.println("<tr><td align='left'>�û���:</td><td align='left'><input type='text' name='userName'/ style='width:110'></td></tr>");
				out.println("<tr><td align='left'>��  ��:</td><td align='left'><input type='password' name='userName'/ style='width:110'></td></tr>");
				
				out.println("<tr>");
				out.println("<td align='left'>��֤��:</td><td align='left'><input type='text' name='addnumber'/ style='width:110'></td>" +
						"<td align='left' width='20'>" +
						"<img src='image/code.img?param='"
				+ new Date().getTime()
				+ "width='40' height='15' onclick='location.reload();'/></td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td colspan='1' align='center'>");
				out.println("<input type='reset' value='����'/></td>");
				out.println("<td colspan='1' align='center'>");
				out.println("<input type='submit' value='��¼'/></td>");
				out.println("</tr>");
				out.println("</form>");
				out.println("</table>");
				out.println("</div>");
			}
		} catch (Exception e) {
			throw new JspException("��¼����");
		}
		return EVAL_PAGE;
	}

}
