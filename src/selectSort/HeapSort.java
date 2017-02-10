package selectSort;

import java.util.Arrays;

import bean.DataWrap;
import utils.SwapDataUtil;
/**
 * ������
 * @author qiaojy
 *
 */
public class HeapSort {

	public static DataWrap[] heapSort(DataWrap[] data) {
		System.out.println("��ʼ����");
		int arrayLegth = data.length;
		//ѭ������
		for(int i = 0;i < arrayLegth - 1;i++) {
			//���󶥶�
			builMaxHeap(data,arrayLegth - 1 -i);
			//����С����
//			builMinHeap(data, arrayLegth - 1 - i);
			//�����Ѷ������һ��Ԫ��
			data = SwapDataUtil.swap(data,0,arrayLegth - 1 - i);
			System.out.println(Arrays.toString(data));
		}
		return data;
	}
	
	private static void builMaxHeap(DataWrap[] data,int lastIndex) {
		//��lastIndex���ڵ�(���һ���ڵ�)�ĸ��ڵ㿪ʼ
		for(int i = (lastIndex - 1) / 2;i >= 0;i--) {
			//k���浱ǰ�����жϵĽڵ�
			int k = i;
			//�����ǰk�ڵ�����ӽڵ�
			while(k*2+1 <= lastIndex) {
				//k�ڵ���ڵ����ӽڵ������
				int biggerIndex = 2*k+1;
				//���biggerIndexС��lastIndex��˵��k�ڵ������ӽڵ�
				if(biggerIndex < lastIndex) {
					//������ӽڵ�����ӽڵ��
					if(data[biggerIndex].compareTo(data[biggerIndex+1]) < 0) {
						biggerIndex++;//biggerIndex���Ǽ�¼����ӽڵ������
					}
				}
				//������ڵ�kС���ӽ������ֵ�ͽ��н���
				if(data[k].compareTo(data[biggerIndex]) < 0) {
					data = SwapDataUtil.swap(data,k,biggerIndex);
					//��biggerIndex����k����ʼwhile����һ��ѭ�������±�֤k�ڵ��ֵ�����������ӽڵ�
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
