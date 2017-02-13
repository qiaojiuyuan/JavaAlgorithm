package insertSort;

import java.util.Arrays;

import bean.DataWrap;

/**
 * 希尔排序
 * 其实是对直接插入排序的扩展
 * @author qiaojy
 *
 */
public class ShellSort {

	public static DataWrap[] shellSort(DataWrap[] data) {
		System.out.println("开始排序");
		int arrayLength = data.length;
		//h变量保存可变增量
		int h = 1;
		while(h <= arrayLength/3) {
			//增量公式
			h = h * 3 + 1;
		}
		while(h > 0) {
			System.out.println("h的值:"+h);
			for(int i = h;i < arrayLength;i++) {
				DataWrap tmp = data[i];
				if(data[i].compareTo(data[i-h]) < 0) {
					int j = i - h;
					for(;j >= 0 && data[j].compareTo(tmp) > 0;j -= h) {
						data[j+h] = data[j];
					}
					data[j+h] = tmp;
				}
				System.out.println(Arrays.toString(data));
			}
			//经过第一轮的比较后，h增量已达数组最大值，需要进行减量
			h = (h - 1) / 3;
		}
		return data;
	}
}
