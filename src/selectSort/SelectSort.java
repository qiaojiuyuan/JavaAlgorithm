package selectSort;

import java.util.Arrays;

import bean.DataWrap;
import utils.SwapDataUtil;
/**
 * ֱ��ѡ������
 * @author qiaojy
 *
 */
public class SelectSort {

	public static DataWrap[] selectSort(DataWrap[] data) {
		System.out.println("��ʼ����");
		int arrayLength = data.length;
		for(int i = 0;i < arrayLength - 1;i++) {
			int minIndex = i;
			for(int j = i+1;j < arrayLength;j++) {
				if(data[minIndex].compareTo(data[j]) > 0) {
					minIndex = j;//�������Բ���ÿ�ζ����н�������ʡ�˽�����ʱ��
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
