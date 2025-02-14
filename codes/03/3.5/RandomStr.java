

/**
 * Description:
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2020, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 5.0
 */
public class RandomStr
{
	public static void main(String[] args)
	{
		// 定义一个空字符串
		var result = "";
		// 进行6次循环
		for (var i = 0; i < 6; i++)
		{
			// 生成一个97～122的int型的整数
			var intVal = (int) (Math.random() * 26 + 97);
			// 将intValue强制转换为char后连接到result后面
			result = result + (char) intVal;
		}
		// 输出随机字符串
		System.out.println(result);
	}
}
