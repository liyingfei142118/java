
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
public class ResolveTest
{
	public static void main(String[] args)
	{
		try (
			// 创建一个ObjectOutputStream输入流
			var oos = new ObjectOutputStream(new FileOutputStream("transient.txt"));
			// 创建一个ObjectInputStream输入流
			var ois = new ObjectInputStream(new FileInputStream("transient.txt")))
		{
			oos.writeObject(Orientation.HORIZONTAL);
			var ori = (Orientation) ois.readObject();
			System.out.println(ori == Orientation.HORIZONTAL);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}