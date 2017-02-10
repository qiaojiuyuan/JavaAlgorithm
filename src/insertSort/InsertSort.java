package insertSort;

import java.util.Arrays;

import bean.DataWrap;
/**
 * 直接插入排序
 * @author qiaojy
 *
 */
public class InsertSort {

	public static DataWrap[] insertSort(DataWrap[] data) {
		System.out.println("开始排序");
		int arrayLength = data.length;
		for(int i = 1;i < arrayLength;i++) {
			DataWrap tmp = data[i];
			if(data[i].compareTo(data[i-1]) < 0) {
				int j = i - 1;
				//如果tmp前面的数据小，就没必要再进行比对前面的数据了，因为前面的数据已经是有序的
				for(;j >= 0 && data[j].compareTo(tmp) > 0;j--) {
					data[j + 1] = data[j];//将数据向后移动一个位置
				}
				//把当前正在对比的数据插入到正好比它小的数据的后面位置
				data[j+1] = tmp;
			}
			System.out.println(Arrays.toString(data));
		}
		return data;
	}
}
