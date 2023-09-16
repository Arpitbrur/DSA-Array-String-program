package practice;

public class program_103 {

	public static void main(String[] args) {
		int arr[]= {54,23,76,99,27,43,32,87};
		for(int j=0;j<arr.length;j++) {
			for(int i=0;i<arr.length-1; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
