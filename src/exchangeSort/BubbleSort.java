package exchangeSort;

import java.util.Arrays;

import bean.DataWrap;
import utils.SwapDataUtil;
/**
 * ð������
 * @author qiaojy
 *
 */
public class BubbleSort {

	public static DataWrap[] bubbleSort(DataWrap[] data) {
		System.out.println("��ʼ����");
		int arrayLegth = data.length;
		for(int i = 0;i < arrayLegth;i++) {
			boolean flag = false;
			for(int j = 0;j < arrayLegth - 1 - i;j++) {
				if(data[j].compareTo(data[j+1]) > 0) {
					data = SwapDataUtil.swap(data, j, j+1);
					flag = true;
				}
			}
			System.out.println(Arrays.toString(data));
			if(!flag) {//���ĳ�ζԱ�û�з����仯��˵���Ѿ����򣬿�����ǰ��������
				break;
			}
		}
		return data;
	}
}
