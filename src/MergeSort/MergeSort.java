package MergeSort;

import bean.DataWrap;

/**
 * 归并排序
 * @author qiaojy
 *
 */
public class MergeSort {

	public static void mergeSort(DataWrap[] data) {
		//归并排序
		sort(data,0,data.length - 1);
	}
	
	/**
	 * 将索引从left到right范围的数组元素进行归并排序,递归调用到最后先计算第一个和第二个元素比较大小
	 * 之后是1~3进行排序
	 * @param data
	 * @param left
	 * @param right
	 */
	private static void sort(DataWrap[] data,int left,int right) {
		
		if(left < right) {
			//算出中间索引
			int center = (left + right) / 2;
			//对左边数组进行递归
			sort(data,left,center);
			//对右边数组进行递归
			sort(data,center + 1,right);
//			System.out.println("left="+left+",  right="+right);
			//合并
			merge(data,left,center,right);
		}
	}
	
	/**
	 * 将两个数组进行归并，归并前两个数组已经有序，归并后依然有序
	 * @param data
	 * @param left
	 * @param center
	 * @param right
	 */
	private static void merge(DataWrap[] data,int left,int center,int right) {
		System.out.println("left="+left+",  center="+center+",  right="+right);
		DataWrap[] tmpArr = new DataWrap[data.length];
		//代表数组右边部分的下标
		int mid = center + 1;
		//临时数组的下标索引
		int third = left;
		//保存data数组的最左边索引
		int tmp = left;
		while(left <= center && mid <= right) {
			//从两个数组中取出小的放入中间数组
			if(data[left].compareTo(data[mid]) <= 0) {
				tmpArr[third++] = data[left++];
			} else {
				tmpArr[third++] = data[mid++];
			}
		}
		//如果data数组的右半部分还有剩余元素，直接加入到临时数组里
		while(mid <= right) {
			tmpArr[third++] = data[mid++];
		}
		//如果data数组的左半部分还有剩余元素，直接加入到临时数组里
		while(left <= center) {
			tmpArr[third++] = data[left++];
		}
		//将临时数组的数据保存到原来的data数组里
		while(tmp <= right) {
			data[tmp] = tmpArr[tmp++];
		}
	}
}
