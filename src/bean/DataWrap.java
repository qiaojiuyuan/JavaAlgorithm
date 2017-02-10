package bean;

public class DataWrap implements Comparable<DataWrap>{

	private int data;
	private String flag;
	
	public DataWrap(int data,String flag) {
		this.data = data;
		this.flag = flag;
	}
	
	public String toString() {
		return data+flag;
	}
	
	/**
	 * ��ǰ���ݴ��ڴ��ݽ����������򷵻�1����ȷ���0��С�ڷ���-1
	 */
	public int compareTo(DataWrap dw) {
		return this.data > dw.data ? 1 : (this.data == dw.data ? 0 : -1);
	}
}
