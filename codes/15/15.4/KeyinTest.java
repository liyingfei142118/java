
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
public class KeyinTest
{
	public static void main(String[] args)
	{
		try (
			// 将Sytem.in对象转换成Reader对象
			var reader = new InputStreamReader(System.in);
			// 将普通Reader包装成BufferedReader
			var br = new BufferedReader(reader))
		{
			String line = null;
			// 采用循环方式来一行一行的读取
			while ((line = br.readLine()) != null)
			{
				// 如果读取的字符串为"exit"，程序退出
				if (line.equals("exit"))
				{
					System.exit(1);
				}
				// 打印读取的内容
				System.out.println("输入内容为:" + line);
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}
