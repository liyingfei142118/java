
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
public class EnumSetTest2
{
	public static void main(String[] args)
	{
		var c = new HashSet();
		c.clear();
		c.add(Season.FALL);
		c.add(Season.SPRING);
		// 复制Collection集合中所有元素来创建EnumSet集合
		var enumSet = EnumSet.copyOf(c);   // ①
		System.out.println(enumSet); // 输出[SPRING, FALL]
		c.add("疯狂Java讲义");
		c.add("轻量级Java EE企业应用实战");
		// 下面代码出现异常：因为c集合里的元素不是全部都为枚举值
		enumSet = EnumSet.copyOf(c);  // ②
	}
}
