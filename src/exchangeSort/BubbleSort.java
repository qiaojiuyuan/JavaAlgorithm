package exchangeSort;

import java.util.Arrays;

import bean.DataWrap;
import utils.SwapDataUtil;
/**
 * 冒泡排序
 * @author qiaojy
 *
 */
public class BubbleSort {

	public static DataWrap[] bubbleSort(DataWrap[] data) {
		System.out.println("开始排序");
		int arrayLegth = data.length;
		for(int i = 0;i < arrayLegth;i++) {
			boolean flag = false;
			for(int j = 0;j < arrayLegth - 1 - i;j++) {
				if(data[j].compareTo(data[j+1]) > 0) {
					data = SwapDataUtil.swap(data, j, j+1);
					flag = true;
				}
			}
			System.out.println(Arrays.toString(data));
			if(!flag) {//如果某次对比没有发生变化，说明已经有序，可以提前结束排序
				break;
			}
		}
		return data;
	}
}
