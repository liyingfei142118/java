

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
public class StaticInitTest
{
	// 先执行类初始化块将类变量a赋值为6
	static
	{
		a = 6;
	}
	// 再将类变量a赋值为9
	static int a = 9;
	public static void main(String[] args)
	{
		// 下面代码将输出9
		System.out.println(StaticInitTest.a);
	}
}

