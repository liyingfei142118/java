
import java.util.Arrays;
import java.util.function.*;
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
public class ArraysTest2
{
	public static void main(String[] args)
	{
		var arr1 = new int[] {3, -4, 25, 16, 30, 18};
		// 对数组arr1进行并发排序
		Arrays.parallelSort(arr1);
		System.out.println(Arrays.toString(arr1));
		var arr2 = new int[] {3, -4, 25, 16, 30, 18};
		Arrays.parallelPrefix(arr2, new IntBinaryOperator()
		{
			// left代表新数组中前一个索引处的元素，right代表原数组中当前索引处的元素
			// 新数组的第一个元素总等于原数组第一个元素
			public int applyAsInt(int left, int right)
			{
				return left * right;
			}
		});
		System.out.println(Arrays.toString(arr2));
		var arr3 = new int[5];
		Arrays.parallelSetAll(arr3, new IntUnaryOperator()
		{
			// operand代表正在计算的元素索引
			public int applyAsInt(int operand)
			{
				return operand * 5;
			}
		});
		System.out.println(Arrays.toString(arr3));
	}
}
