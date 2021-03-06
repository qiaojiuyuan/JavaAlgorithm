import java.util.Arrays;

import BuckeSort.BucketSort;
import MergeSort.MergeSort;
import bean.DataWrap;
import exchangeSort.BubbleSort;
import exchangeSort.QuickSort;
import insertSort.BinaryInsertSort;
import insertSort.InsertSort;
import insertSort.ShellSort;
import selectSort.HeapSort;
import selectSort.SelectSort;

public class MainTest {

	public static void main(String[] args) {
//		DataWrap [] data = {new DataWrap(21, ""),
//				            new DataWrap(30, ""),
//				            new DataWrap(49, ""),
//				            new DataWrap(30, ""),
//				            new DataWrap(16, ""),
//				            new DataWrap(9, "")};
		
		DataWrap [] data = {new DataWrap(9, ""),
	            new DataWrap(5, ""),
	            new DataWrap(-1, ""),
	            new DataWrap(8, ""),
	            new DataWrap(5, ""),
	            new DataWrap(7, ""),
	            new DataWrap(3, ""),
	            new DataWrap(-5, ""),
	            new DataWrap(1, ""),
	            new DataWrap(3, "")};
		System.out.println("排序前:\n"+Arrays.toString(data));
//		data = SelectSort.selectSort(data);
//		data = HeapSort.heapSort(data);
//		data = BubbleSort.bubbleSort(data);
//		data = QuickSort.quickSort(data);
//		data = InsertSort.insertSort(data);
//		data = BinaryInsertSort.binaryInsertSort(data);
//		data = ShellSort.shellSort(data);
//		MergeSort.mergeSort(data);
		BucketSort.bucketSort(data, -5, 10);
		System.out.println("排序后:\n"+Arrays.toString(data));
		
	}
}
