import java.util.Arrays;

import bean.DataWrap;
import exchangeSort.BubbleSort;
import exchangeSort.QuickSort;
import insertSort.InsertSort;
import selectSort.HeapSort;
import selectSort.SelectSort;

public class MainTest {

	public static void main(String[] args) {
		DataWrap [] data = {new DataWrap(21, ""),
				            new DataWrap(30, ""),
				            new DataWrap(49, ""),
				            new DataWrap(30, ""),
				            new DataWrap(16, ""),
				            new DataWrap(9, "")};
		System.out.println("排序前:\n"+Arrays.toString(data));
//		data = SelectSort.selectSort(data);
//		data = HeapSort.heapSort(data);
//		data = BubbleSort.bubbleSort(data);
//		data = QuickSort.quickSort(data);
		data = InsertSort.insertSort(data);
		System.out.println("排序后:\n"+Arrays.toString(data));
		
	}
}
