package selectSort;

import java.util.Arrays;

import bean.DataWrap;
import utils.SwapDataUtil;
/**
 * 直接选择排序
 * @author qiaojy
 *
 */
public class SelectSort {

	public static DataWrap[] selectSort(DataWrap[] data) {
		System.out.println("开始排序");
		int arrayLength = data.length;
		for(int i = 0;i < arrayLength - 1;i++) {
			int minIndex = i;
			for(int j = i+1;j < arrayLength;j++) {
				if(data[minIndex].compareTo(data[j]) > 0) {
					minIndex = j;//这样可以不用每次都进行交换，节省了交换的时间
				}
			}
			if(minIndex != i) {
				data = SwapDataUtil.swap(data, i, minIndex);
			}
			System.out.println(Arrays.toString(data));
		}
		return data;
	}
	
}
