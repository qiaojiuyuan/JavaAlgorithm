package exchangeSort;

import java.util.Arrays;

import bean.DataWrap;
import utils.SwapDataUtil;
/**
 * 快速排序
 * @author qiaojy
 *
 */
public class QuickSort {

	public static DataWrap[] quickSort(DataWrap[] data) {
		System.out.println("开始排序");
		data = subSort(data, 0, data.length - 1);
		return data;
	}
	/**
	 * 对data数组中从start~end索引范围的子序列进行处理，
	 * 小于分界值的数据放在左边，大于分界值的数据放在右边。
	 * 分界值可以直接取data数组的第一个元素
	 * @param data
	 * @param start
	 * @param end
	 */
	private static DataWrap[] subSort(DataWrap[] data,int start,int end) {
		if(start < end) {
			//以第一个数据做为分界值
			DataWrap base = data[start];
			//从左边开始搜索的索引
			int left = start;
			//从右边开始搜索的索引,这里加1是为了防止下面--right少对比了数组的最后一个数据
			int right = end+1;
			while(true) {
				//从左边开始搜索大于base分界值的数据索引，并把该索引保存到left
				while(left < end && data[++left].compareTo(base) <= 0);
				//从右向左开始搜索小于base分界值的数据索引，并把该索引保存到right
				while(right > start && data[--right].compareTo(base) >= 0);
				if(left < right) {
					data = SwapDataUtil.swap(data, left, right);
				} else {
					break;
				}
			}
			//将base分界值与最后找到的比它小的数据进行交换
			data = SwapDataUtil.swap(data, start, right);
			//将base分界值左边数据组进行再次的快速排序
			subSort(data, start, right - 1);
			//将base分界值右边数据组进行再次的快速排序
			subSort(data,right + 1,end);
			System.out.println(Arrays.toString(data));
			return data;
		}
		return data;
	}
}
