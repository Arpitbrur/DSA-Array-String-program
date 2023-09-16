package practice;

public class program_109 {

	public static void main(String[] args) {
		secondLargestNumber();
	}
	public static void secondLargestNumber(){
		int arr[] = {34,56,67,89,22,54};
		for(int j=0; j<arr.length; j++) {
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i]<arr[i+1]) {
					int temp =arr[i];
					arr[i]= arr[i+1];
					arr[i+1] =temp;
				}
			}
		}
		
		System.out.println("Second largest number is:- "+arr[arr.length-2]);
	}
}
