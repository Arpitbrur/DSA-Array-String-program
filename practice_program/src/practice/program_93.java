package practice;

public class program_93 {

	public static void main(String[] args) {
		int sum =0;
		int arr[]= {10,11,12,13,14};
		for(int i=0; i<arr.length; i++) {
			if(i%2!=0) {
				sum =sum+arr[i];
			}
		}
		System.out.println(sum);
	}
}
