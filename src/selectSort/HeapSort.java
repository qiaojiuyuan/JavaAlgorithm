package selectSort;

import java.util.Arrays;

import bean.DataWrap;
import utils.SwapDataUtil;
/**
 * 堆排序
 * @author qiaojy
 *
 */
public class HeapSort {

	public static DataWrap[] heapSort(DataWrap[] data) {
		System.out.println("开始排序");
		int arrayLegth = data.length;
		//循环建堆
		for(int i = 0;i < arrayLegth - 1;i++) {
			//建大顶堆
			builMaxHeap(data,arrayLegth - 1 -i);
			//建立小顶堆
//			builMinHeap(data, arrayLegth - 1 - i);
			//互换堆顶和最后一个元素
			data = SwapDataUtil.swap(data,0,arrayLegth - 1 - i);
			System.out.println(Arrays.toString(data));
		}
		return data;
	}
	
	private static void builMaxHeap(DataWrap[] data,int lastIndex) {
		//从lastIndex处节点(最后一个节点)的父节点开始
		for(int i = (lastIndex - 1) / 2;i >= 0;i--) {
			//k保存当前正在判断的节点
			int k = i;
			//如果当前k节点存在子节点
			while(k*2+1 <= lastIndex) {
				//k节点存在的左子节点的索引
				int biggerIndex = 2*k+1;
				//如果biggerIndex小于lastIndex，说明k节点有右子节点
				if(biggerIndex < lastIndex) {
					//如果右子节点比左子节点大
					if(data[biggerIndex].compareTo(data[biggerIndex+1]) < 0) {
						biggerIndex++;//biggerIndex总是记录大的子节点的索引
					}
				}
				//如果父节点k小于子结点的最大值就进行交换
				if(data[k].compareTo(data[biggerIndex]) < 0) {
					data = SwapDataUtil.swap(data,k,biggerIndex);
					//将biggerIndex赋给k，开始while的下一次循环，重新保证k节点的值大于其左、右子节点
					k = biggerIndex;
				} else {
					break;
				}
			}
			
		}
	}
	
	private static void builMinHeap(DataWrap[] data,int lastIndex) {
		
		for(int i = (lastIndex-1)/2;i >= 0;i--) {
			int k = i;
			while((2 * k + 1) <= lastIndex) {
				int minIndex = 2 * k + 1;
//				System.out.println("minIndex + 1="+minIndex + 1+"  ,k="+k);
				if((minIndex + 1) <= lastIndex) {
					if(data[minIndex].compareTo(data[minIndex+1]) > 0) {
						minIndex++;
					}
				}
				if(data[k].compareTo(data[minIndex]) > 0) {
					data = SwapDataUtil.swap(data, k, minIndex);
					k = minIndex;
				} else {
					break;
				}
			}
		}
	}
	
	
}