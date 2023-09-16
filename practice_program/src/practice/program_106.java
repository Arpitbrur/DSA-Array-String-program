package practice;

public class program_106 {

	public static void main(String[] args) {
		sortArray();
	}
	public static void sortArray() {
		int arr[]= {34,54,678,12,21};
		for(int j=0; j<arr.length; j++) {
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		for(int i=0;i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
