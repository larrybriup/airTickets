<%@tag pageEncoding="utf-8" %>
<center>
<table width="60%" align="center" height="100%">
<form method="post" action="addFlight.jsp">
<body><tr><td colspan="2" align="center" bgcolor="skyblue">请填写航班信息</td></tr>
<tr><td colspan="2" align="center" bgcolor="skyblue">&nbsp;</td></tr>
<tr>
<td align="right" bgcolor="skyblue">航班号:</td>
<td align="center" bgcolor="skyblue">
<input name="flightnumber" type="text"></td>
</tr> 
<tr>
		   <td align="right" bgcolor="skyblue">出发城市:</td>
		   <td align="center" bgcolor="skyblue">
		     <select name="from_city" >
			    <option value="beijing">北京
				<option value="shanghai">上海
				<option value="chongqing">重庆
				<option value="tianjin">天津
			        <option value="shijiazhuang">石家庄
				<option value="qinhuangdao">秦皇岛
				<option value="taiyuan">太原
				<option value="changzhi">长治
			        <option value="yuncheng">运城
				<option value="hushi">呼和浩特
				<option value="baotou">包头
				<option value="hailaer">海拉尔
				<option value="xilinhaote">锡林浩特
			        <option value="changchun">长春
				<option value="jilin">吉林
				<option value="yanji">延吉
				<option value="shenyang">沈阳
				<option value="dalian">大连
			        <option value="dandong">丹东
				<option value="jinzhou">锦州
				<option value="zhaoyang">朝阳
				<option value="haerbin">哈尔滨
				<option value="qiqihaer">齐齐哈尔
			        <option value="jiamusi">佳木斯
				<option value="mudanjiang">牡丹江
				<option value="zhengzhou">郑州
				<option value="luoyang">洛阳
				<option value="nanyang">南阳
			        <option value="zhejiang">杭州
				<option value="ningbo">宁波
				<option value="wenzhou">温州
				<option value="huangyan">黄岩
				<option value="yiwu">义乌
			        <option value="zhuozhou">衢州
				<option value="zhoushan">舟山
				<option value="hefei">合肥
				<option value="huangshan">黄山
				<option value="anqing">安庆
			        <option value="fuzhou">福州
				<option value="xiamen">厦门
				<option value="jinjiang">晋江
				<option value="wuyishan">武夷山
				<option value="nanchang">南昌
				<option value="ganzhou">赣州
				<option value="jiujiang">九江
				<option value="jingdezhen">景德镇
				<option value="guangzhou">广州
			        <option value="shenzhen">深圳
				<option value="zhanjiang">湛江
				<option value="zhuhai">珠海
				<option value="shantou">汕头
				<option value="meixian">梅县
			        <option value="changsha">长沙
				<option value="changzhou">常德
				<option value="zhangjiajie">张家界
				<option value="hengyang">衡阳
				<option value="yinchuan">银川
			        <option value="jinan">济南
				<option value="qingdao">青岛
				<option value="yantai">烟台
				<option value="weifang">潍坊
				<option value="weihai">威海
			        <option value="linyi">临沂
				<option value="jining">济宁
				<option value="kunming">昆明
			        <option value="jinghong">景洪
				<option value="lijiang">丽江
				<option value="dali">大理
				<option value="mangshi">芒市
				<option value="zhongdian">中甸
			        <option value="baoshan">宝山
				<option value="lasa">拉萨
				<option value="xian">西安
				<option value="hanzhong">汉中
				<option value="yanan">延安
			        <option value="wushi">乌鲁木齐
				<option value="yining">伊宁
				<option value="kashi">喀什
				<option value="kuwele">库尔勒
				<option value="akesu">阿克苏
			        <option value="aletai">阿勒泰
				<option value="hetian">和田
				<option value="kuche">库车
				<option value="qiemo">且末
				<option value="tacheng">塔城
			        <option value="aermata">阿尔玛塔
				<option value="haikou">海口
				<option value="sanya">三亚
				<option value="wuhan">武汉
				<option value="xiangfan">襄樊
			        <option value="shashi">沙市
				<option value="yichang">宜昌
				<option value="enshi">恩施
			        <option value="guiyang">贵阳
				<option value="tongren">同仁
				<option value="chengdu">成都
				<option value="wanxian">万县
				<option value="luzhou">泸州
			        <option value="yibin">宜宾
				<option value="guangyuan">广元
				<option value="mianyang">绵羊
				<option value="xichang">西昌
				<option value="jiuzhaigou">九寨沟
			        <option value="lanzhou">兰州
				<option value="dunhuang">敦煌
				<option value="jining">南宁
				<option value="guilin">桂林
				<option value="liuzhou">柳州
			        <option value="beihai">北海
				<option value="nanjing">南京
				<option value="changzhou">常州
				<option value="xuzhou">徐州
				<option value="lianyungang">连云港
			        <option value="nantong">南通
				<option value="yanchgeng">盐城
				<option value="wuxi">无锡
				
			 </select>
		   </td>
		   <td></td>
		 </tr>
		 <tr>
		   <td align="right" bgcolor="skyblue">到达城市:</td>
		   <td align="center" bgcolor="skyblue">
		     <select name="to_city">
			    <option value="beijing">北京
				<option value="shanghai">上海
				<option value="chongqing">重庆
				<option value="tianjin">天津
			        <option value="shijiazhuang">石家庄
				<option value="qinhuangdao">秦皇岛
				<option value="taiyuan">太原
				<option value="changzhi">长治
			        <option value="yuncheng">运城
				<option value="hushi">呼和浩特
				<option value="baotou">包头
				<option value="hailaer">海拉尔
				<option value="xilinhaote">锡林浩特
			        <option value="changchun">长春
				<option value="jilin">吉林
				<option value="yanji">延吉
				<option value="shenyang">沈阳
				<option value="dalian">大连
			        <option value="dandong">丹东
				<option value="jinzhou">锦州
				<option value="zhaoyang">朝阳
				<option value="haerbin">哈尔滨
				<option value="qiqihaer">齐齐哈尔
			        <option value="jiamusi">佳木斯
				<option value="mudanjiang">牡丹江
				<option value="zhengzhou">郑州
				<option value="luoyang">洛阳
				<option value="nanyang">南阳
			        <option value="zhejiang">杭州
				<option value="ningbo">宁波
				<option value="wenzhou">温州
				<option value="huangyan">黄岩
				<option value="yiwu">义乌
			        <option value="zhuozhou">衢州
				<option value="zhoushan">舟山
				<option value="hefei">合肥
				<option value="huangshan">黄山
				<option value="anqing">安庆
			        <option value="fuzhou">福州
				<option value="xiamen">厦门
				<option value="jinjiang">晋江
				<option value="wuyishan">武夷山
				<option value="nanchang">南昌
				<option value="ganzhou">赣州
				<option value="jiujiang">九江
				<option value="jingdezhen">景德镇
				<option value="guangzhou">广州
			        <option value="shenzhen">深圳
				<option value="zhanjiang">湛江
				<option value="zhuhai">珠海
				<option value="shantou">汕头
				<option value="meixian">梅县
			        <option value="changsha">长沙
				<option value="changzhou">常德
				<option value="zhangjiajie">张家界
				<option value="hengyang">衡阳
				<option value="yinchuan">银川
			        <option value="jinan">济南
				<option value="qingdao">青岛
				<option value="yantai">烟台
				<option value="weifang">潍坊
				<option value="weihai">威海
			        <option value="linyi">临沂
				<option value="jining">济宁
				<option value="kunming">昆明
			        <option value="jinghong">景洪
				<option value="lijiang">丽江
				<option value="dali">大理
				<option value="mangshi">芒市
				<option value="zhongdian">中甸
			        <option value="baoshan">宝山
				<option value="lasa">拉萨
				<option value="xian">西安
				<option value="hanzhong">汉中
				<option value="yanan">延安
			        <option value="wushi">乌鲁木齐
				<option value="yining">伊宁
				<option value="kashi">喀什
				<option value="kuwele">库尔勒
				<option value="akesu">阿克苏
			        <option value="aletai">阿勒泰
				<option value="hetian">和田
				<option value="kuche">库车
				<option value="qiemo">且末
				<option value="tacheng">塔城
			        <option value="aermata">阿尔玛塔
				<option value="haikou">海口
				<option value="sanya">三亚
				<option value="wuhan">武汉
				<option value="xiangfan">襄樊
			        <option value="shashi">沙市
				<option value="yichang">宜昌
				<option value="enshi">恩施
			        <option value="guiyang">贵阳
				<option value="tongren">同仁
				<option value="chengdu">成都
				<option value="wanxian">万县
				<option value="luzhou">泸州
			        <option value="yibin">宜宾
				<option value="guangyuan">广元
				<option value="mianyang">绵羊
				<option value="xichang">西昌
				<option value="jiuzhaigou">九寨沟
			        <option value="lanzhou">兰州
				<option value="dunhuang">敦煌
				<option value="jining">南宁
				<option value="guilin">桂林
				<option value="liuzhou">柳州
			        <option value="beihai">北海
				<option value="nanjing">南京
				<option value="changzhou">常州
				<option value="xuzhou">徐州
				<option value="lianyungang">连云港
			        <option value="nantong">南通
				<option value="yanchgeng">盐城
				<option value="wuxi">无锡
			 </select>
		   </td>
		   	   <td></td>
		 </tr>
<tr>
<td align="right" bgcolor="skyblue">出发日期:</td><td align="center" bgcolor="skyblue"><input name="departureDate" type="text"></td>
</tr> 
<tr>
<td align="right" bgcolor="skyblue">头等舱座位数:</td><td align="center" bgcolor="skyblue"><input name="firstClassRemainSeats" type="text"></td>
</tr> 
<tr>
<td align="right" bgcolor="skyblue">头等舱价格:</td><td align="center" bgcolor="skyblue"><input name="fprice" type="text"></td>
</tr> 
<tr>
<td align="right" bgcolor="skyblue">商务舱座位数:</td><td align="center" bgcolor="skyblue"><input name="businessClassRemainSeats" type="text"></td>
</tr>
<tr>
<td align="right" bgcolor="skyblue">商务舱价格:</td><td align="center" bgcolor="skyblue"><input name="bprice" type="text"></td>
</tr>
<tr><td align="right" bgcolor="skyblue">经济舱座位数:</td><td align="center" bgcolor="skyblue"><input name="economyClassRemainSeats" type="text"></td></tr>
<td align="right" bgcolor="skyblue">经济舱价格:</td><td align="center" bgcolor="skyblue"><input name="eprice" type="text"></td></tr>

<tr><td colspan="2" align="center"bgcolor="skyblue">&nbsp;</td></tr>
<tr>
<td colspan="2" align="center" bgcolor="skyblue">
<input value="添加航班" type="submit">
</td></tr>
</body>
</form>
</table>

</center>