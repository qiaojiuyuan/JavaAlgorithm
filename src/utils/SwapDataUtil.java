package utils;

import bean.DataWrap;
/**
 * �����������ݵĹ�����
 * @author qiaojy
 *
 */
public class SwapDataUtil {

	private SwapDataUtil(){}
	
	public static DataWrap[] swap(DataWrap[] data,int first,int second) {
		DataWrap tmp = data[first];
		data[first] = data[second];
		data[second] = tmp;
		return data;
	}
}
