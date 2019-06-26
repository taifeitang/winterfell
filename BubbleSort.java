import java.util.Arrays;


public class BubbleSort{
	/*冒泡排序*/
	public  static int[] bubble(int[] arr){
		int temp;
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		return arr;
		
	}
	
	public static void main(String[] args) {
	     int[] arr=new int[]{3,5,1,2,6,4};
             bubble(arr);
             System.out.println(Arrays.toString(arr));
	}

}
