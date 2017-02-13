package insertSort;

import java.util.Arrays;

import bean.DataWrap;

/**
 * 折半插入排序
 * @author qiaojy
 *
 */
public class BinaryInsertSort {

	public static DataWrap[] binaryInsertSort(DataWrap[] data) {
		System.out.println("开始排序");
		int arrayLength = data.length;
		for(int i = 1;i < arrayLength;i++) {
			int low = 0;
			int height = i - 1;
			DataWrap tmp = data[i];
			while(low <= height) {
				//计算出折半下标索引
				int mid = (low + height) / 2;
				if(tmp.compareTo(data[mid]) > 0) {
					//如果大于中间值就把最低索引变成中间值后面的索引
					low = mid + 1;
				} else {
					//如果小于中间值就把最高的范围变成中间值前面的索引
					height = mid - 1;
				}
			}
			//把low后面的索引数据全部向后移动一位
			for(int j = i;j > low;j--) {
				data[j] = data[j - 1];
			}
			data[low] = tmp;
			System.out.println(Arrays.toString(data));
		}
		return data;
	}
}
