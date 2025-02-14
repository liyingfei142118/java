

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
class Animal
{
	private void beat()
	{
		System.out.println("心脏跳动...");
	}
	public void breathe()
	{
		beat();
		System.out.println("吸一口气，吐一口气，呼吸中...");
	}
}
// 继承Animal，直接复用父类的breathe()方法
class Bird extends Animal
{
	public void fly()
	{
		System.out.println("我在天空自在的飞翔...");
	}
}
// 继承Animal，直接复用父类的breathe()方法
class Wolf extends Animal
{
	public void run()
	{
		System.out.println("我在陆地上的快速奔跑...");
	}
}
public class InheritTest
{
	public static void main(String[] args)
	{
		var b = new Bird();
		b.breathe();
		b.fly();
		var w = new Wolf();
		w.breathe();
		w.run();
	}
}
