package practice;

public class program_89 {

	public static void main(String[] args) {
		int arr[] = {10,20,40,30,50};
		int largest= arr[0];
		for(int i=0; i<arr.length; i++) {
			if(largest>arr[i]) {
				largest=arr[i];
			}
			
		}
		System.out.println(largest);
	}
}
