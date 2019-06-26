import java.util.Arrays;


public class InsertSort {
	/*插入排序实现*/
	public static void insertSort(long arr[]){
		int f;
		long temp;
	    System.out.println("排序过程：\n");
		for(int i=1;i<arr.length;i++){
			if(arr[i]<arr[i-1]){
				f=i;
				while(f>0&&arr[f]<arr[f-1]){
					temp=arr[f];
					arr[f]=arr[f-1];
					arr[f-1]=temp;
					System.out.println(Arrays.toString(arr));
					f--;
				}
			}	
		}
	}
	
	public static void main(String[] args) {
		long arr[]=new long[]{8,7,6,9,10,4};
		System.out.println("初始数据：\n"+Arrays.toString(arr));
		insertSort(arr);
		System.out.println("最终结果：\n"+Arrays.toString(arr));
	}

}
