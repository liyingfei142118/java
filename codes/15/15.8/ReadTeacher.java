
import java.io.*;
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
public class ReadTeacher
{
	public static void main(String[] args)
	{
		try (
			// 创建一个ObjectInputStream输出流
			var ois = new ObjectInputStream(new FileInputStream("teacher.txt")))
		{
			// 依次读取ObjectInputStream输入流中的四个对象
			var t1 = (Teacher) ois.readObject();
			var t2 = (Teacher) ois.readObject();
			var p = (Person) ois.readObject();
			var t3 = (Teacher) ois.readObject();
			// 输出true
			System.out.println("t1的student引用和p是否相同："
				+ (t1.getStudent() == p));
			// 输出true
			System.out.println("t2的student引用和p是否相同："
				+ (t2.getStudent() == p));
			// 输出true
			System.out.println("t2和t3是否是同一个对象："
				+ (t2 == t3));
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
