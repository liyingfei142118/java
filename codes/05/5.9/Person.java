

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
public class Person
{
	// 下面定义一个实例初始化块
	{
		var a = 6;
		if (a > 4)
		{
			System.out.println("Person实例初始化块：局部变量a的值大于4");
		}
		System.out.println("Person的实例初始化块");
	}
	// 定义第二个实例初始化块
	{
		System.out.println("Person的第二个实例初始化块");
	}
	// 定义无参数的构造器
	public Person()
	{
		System.out.println("Person类的无参数构造器");
	}
	public static void main(String[] args)
	{
		new Person();
	}
}

