

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
public class AssignOperatorTest
{
	public static void main(String[] args)
	{
		var str = "Java"; // 为变量str赋值为Java
		var pi = 3.14; // 为变量pi赋值为3.14
		var visited = true; // 为变量visited赋值为true
		var str2 = str; // 将变量str的值赋给str2
		int a;
		int b;
		int c;
		// 通过为a, b, c赋值，三个变量的值都是7
		a = b = c = 7;
		// 输出三个变量的值。
		System.out.println(a + "\n" + b + "\n" + c);

		var d1 = 12.34;
		var d2 = d1 + 5; // 将表达式的值赋给d2
		System.out.println(d2); // 输出d2的值，将输出17.34

	}
}
