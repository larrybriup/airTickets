package com.briup.web.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class IdentifyingCode extends HttpServlet {   
	 // 验证码图片的宽度。   
    private int width = 80;   
    // 验证码图片的高度。   
    private int height = 26;   
    // 验证码字符个数   
    private int codeCount = 4;   
    private int x = 0;   
  
    // 字体高度   
    private int fontHeight;   
    private int codeY;   
    char[] codeSequence = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',   
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',   
            'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};   
    
     /**  
      * 初始化验证图片属性  
      */  
     public void init() throws ServletException {   
         // 从web.xml中获取初始信息   
         // 宽度   
         String strWidth = this.getInitParameter("width");   
         // 高度   
         String strHeight = this.getInitParameter("height");   
         // 字符个数   
         String strCodeCount = this.getInitParameter("codeCount");   
         
         // 将配置的信息转换成数值   
         try {   
             if (strWidth != null && strWidth.length() != 0) {   
                 width = Integer.parseInt(strWidth);   
                 if (strHeight != null && strHeight.length() != 0) {   
                     height = Integer.parseInt(strHeight);   
                 }   
                 if (strCodeCount != null && strCodeCount.length() != 0) {   
                     codeCount = Integer.parseInt(strCodeCount);   
                 }   
             }   
            }catch(NumberFormatException e){   
            	e.printStackTrace();
            }   
    
             x = width / codeCount;   
             fontHeight = height - 2;   
             codeY = height - 2;   
    
         }   
    
     protected void service(HttpServletRequest req, HttpServletResponse resp)   
             throws ServletException, java.io.IOException {   
    
         // 定义图像buffer   
        BufferedImage buffImg = new BufferedImage(width, height,   
                 BufferedImage.TYPE_INT_RGB);   
        Graphics2D g = buffImg.createGraphics();   
  
        // 创建一个随机数生成器类   
        Random random = new Random();   
  
        //设定图像背景色(因为是做背景，所以偏淡)   
        g.setColor(getRandColor(random,200,250));
        g.fillRect(0, 0, width, height);   
  
        // 创建字体，字体的大小应该根据图片的高度来定。   
        Font font = new Font("Fixedsys", Font.PLAIN, fontHeight);   
        // 设置字体。   
        g.setFont(font);   

       // 画边框。   
       g.setColor(getRandColor(random,100,120));   
       g.drawRect(0, 0, width - 1, height - 1);   
  
   // 随机产生30条干扰线，使图象中的认证码不易被其它程序探测到。   
       g.setColor(getRandColor(random,60,200));   
      
       for (int i = 0; i < 30; i++) {   
           int x = random.nextInt(width);   
           int y = random.nextInt(height);   
           int xl = random.nextInt(20);   
           int yl = random.nextInt(20);   
           g.drawLine(x, y, x + xl, y + yl);   
       }   
  
       // randomCode用于保存随机产生的验证码，以便用户登录后进行验证。   
       StringBuffer randomCode = new StringBuffer();   
       int red = 0, green = 0, blue = 0;   
       String sRand="";
       // 随机产生codeCount数字的验证码。   
       for (int i = 0; i < codeCount; i++) {   
           // 得到随机产生的验证码数字。   
           String strRand = String.valueOf(codeSequence[random.nextInt(36)]);
           
           // 用随机产生的颜色将验证码绘制到图像中。 
            g.setColor(getRandColor(random,10,150));  
            g.drawString(strRand, (i) * x, codeY);   
  
            // 将产生的四个随机数组合在一起。   
            randomCode.append(strRand);   
       }   
      //  把验证码转换成小写保存  
        sRand = randomCode.toString();
        sRand = sRand.toLowerCase();
        
     // 将四位数字的验证码保存到Session中。
        HttpSession session = req.getSession();   
        session.setAttribute("validateCode",sRand);   
  
        // 禁止图像缓存。   
        resp.setHeader("Pragma", "no-cache");   
        resp.setHeader("Cache-Control", "no-cache");   
        resp.setDateHeader("Expires", 0);   
  
        resp.setContentType("image/jpeg");   
  
        // 将图像输出到Servlet输出流中。   
        ServletOutputStream sos = resp.getOutputStream();   
        ImageIO.write(buffImg, "jpeg", sos);   
        sos.close();   
     } 
     protected Color getRandColor(Random random,int fc,int bc){   
         if(fc>255) fc=255;   
         if(bc>255) bc=255;   
         int r=fc+random.nextInt(bc-fc);   
         int g=fc+random.nextInt(bc-fc);   
         int b=fc+random.nextInt(bc-fc);   
         return new Color(r,g,b);   
     }   
}
