package practice;

public class program_95 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int max =0;
		for(int i =0; i<arr.length; i++) {
			if(i%2!=0) {
				if(max < arr[i]) {
					max =arr[i];
				}
			}
		}
		System.out.println(max);
	}
}
