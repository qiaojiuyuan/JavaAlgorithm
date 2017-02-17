package BuckeSort;

import java.util.Arrays;

import bean.DataWrap;

public class BucketSort {

	public static void bucketSort(DataWrap[] data,int min,int max) {
		System.out.println("开始排序");
		int arrayLength = data.length;
		DataWrap[] tmp = new DataWrap[arrayLength];
		//buckets数组相当于定义了max-min个桶
		//buckets数组用于记录待排序元素的信息
		int[] buckets = new int[max - min];
		for(int i = 0;i < arrayLength;i++) {
			//buckets数组记录了DataWrap出现的次数
			buckets[data[i].getData() - min]++;
		}
		System.out.println("记录dataWrap出现次数==buckets="+Arrays.toString(buckets));
		//计算"落入"各桶内的元素在有序序列中的位置
		for(int i = 1;i < max - min;i++) {
			//前一个Bucket的值+当前bucket的值为当前bucket的新值
			buckets[i] = buckets[i]+buckets[i-1];
		}
		//循环结束后，buckets数组元素记录了"落入"前面所有桶和
		//"落入"当前bucket中元素的总数
		//也就是说,buckets数组元素的值代表了"落入"当前桶的元素在有序序列中的位置
		System.out.println("元素的位置===buckets="+Arrays.toString(buckets));
		//将data数组中数据完全复制到tmp数组中缓存起来
		System.arraycopy(data, 0, tmp, 0, arrayLength);
		//根据buckets数组中的信息将待排序列的各元素放入相应的位置
		for(int k = arrayLength - 1;k >= 0;k--) {
			data[--buckets[tmp[k].getData() - min]] = tmp[k];
		}
	}
}
