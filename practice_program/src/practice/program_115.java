package practice;

public class program_115 {

	public static void main(String[] args) {
		int arr[]= {12,15,18,21};
		for(int i=0; i<arr.length-1; i++) {
			for(int j =arr[i]+1; j<arr[i+1]; j++) {
				System.out.print(j+" ");
			}
		}
	}
}
