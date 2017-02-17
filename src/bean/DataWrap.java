package bean;

public class DataWrap implements Comparable<DataWrap>{

	private int data;
	private String flag;
	
	public DataWrap(int data,String flag) {
		this.data = data;
		this.flag = flag;
	}
	
	

	public int getData() {
		return data;
	}



	public void setData(int data) {
		this.data = data;
	}



	public String toString() {
		return data+flag;
	}
	
	/**
	 * 当前数据大于传递进来的数据则返回1，相等返回0，小于返回-1
	 */
	public int compareTo(DataWrap dw) {
		return this.data > dw.data ? 1 : (this.data == dw.data ? 0 : -1);
	}
}
