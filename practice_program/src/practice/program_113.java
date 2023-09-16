package practice;

public class program_113 {

	public static void main(String[] args) {
		int count =0;
		int arr[]= {12,34,45,12,45,78,66 };
		for(int j =0; j<arr.length; j++) {
			for(int i =j+1; i<arr.length; i++) {
				if(arr[i]==arr[j]) {
					count++;
				}				
			}		
		}
		System.out.println(count);
	}
}
