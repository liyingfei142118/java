

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
class Bird
{
	// 将原来的父类组合到原来的子类，作为子类的一个组合成分
	private Animal a;
	public Bird(Animal a)
	{
		this.a = a;
	}
	// 重新定义一个自己的breathe()方法
	public void breathe()
	{
		// 直接复用Animal提供的breathe()方法来实现Bird的breathe()方法。
		a.breathe();
	}
	public void fly()
	{
		System.out.println("我在天空自在的飞翔...");
	}
}
class Wolf
{
	// 将原来的父类组合到原来的子类，作为子类的一个组合成分
	private Animal a;
	public Wolf(Animal a)
	{
		this.a = a;
	}
	// 重新定义一个自己的breathe()方法
	public void breathe()
	{
		// 直接复用Animal提供的breathe()方法来实现Wolf的breathe()方法。
		a.breathe();
	}
	public void run()
	{
		System.out.println("我在陆地上的快速奔跑...");
	}
}
public class CompositeTest
{
	public static void main(String[] args)
	{
		// 此时需要显式创建被组合的对象
		var a1 = new Animal();
		var b = new Bird(a1);
		b.breathe();
		b.fly();
		// 此时需要显式创建被组合的对象
		var a2 = new Animal();
		var w = new Wolf(a2);
		w.breathe();
		w.run();
	}
}
