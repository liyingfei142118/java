
import java.nio.file.*;
import java.nio.charset.*;
import java.io.*;
import java.util.*;
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
public class FilesTest
{
	public static void main(String[] args)
		throws Exception
	{
		// 复制文件
		Files.copy(Paths.get("FilesTest.java"),
			new FileOutputStream("a.txt"));
		// 判断FilesTest.java文件是否为隐藏文件
		System.out.println("FilesTest.java是否为隐藏文件："
			+ Files.isHidden(Paths.get("FilesTest.java")));
		// 一次性读取FilesTest.java文件的所有行
		List<String> lines = Files.readAllLines(Paths
			.get("FilesTest.java"), Charset.forName("gbk"));
		System.out.println(lines);
		// 判断指定文件的大小
		System.out.println("FilesTest.java的大小为："
			+ Files.size(Paths.get("FilesTest.java")));
		List<String> poem = new ArrayList<>();
		poem.add("水晶潭底银鱼跃");
		poem.add("清徐风中碧竿横");
		// 直接将多个字符串内容写入指定文件中
		Files.write(Paths.get("pome.txt"), poem,
			Charset.forName("gbk"));
		// 使用Java 8新增的Stream API列出当前目录下所有文件和子目录
		Files.list(Paths.get(".")).forEach(path -> System.out.println(path));
		// 使用Java 8新增的Stream API读取文件内容
		Files.lines(Paths.get("FilesTest.java"), Charset.forName("gbk"))
			.forEach(line -> System.out.println(line));
		FileStore cStore = Files.getFileStore(Paths.get("C:"));
		// 判断C盘的总空间，可用空间
		System.out.println("C:共有空间：" + cStore.getTotalSpace());
		System.out.println("C:可用空间：" + cStore.getUsableSpace());
	}
}
