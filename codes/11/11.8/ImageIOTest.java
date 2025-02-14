
import javax.imageio.*;
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
public class ImageIOTest
{
	public static void main(String[] args)
	{
		String[] readFormat = ImageIO.getReaderFormatNames();
		System.out.println("-----Image能读的所有图形文件格式-----");
		for (var tmp : readFormat)
		{
			System.out.println(tmp);
		}
		String[] writeFormat = ImageIO.getWriterFormatNames();
		System.out.println("-----Image能写的所有图形文件格式-----");
		for (var tmp : writeFormat)
		{
			System.out.println(tmp);
		}
	}
}
