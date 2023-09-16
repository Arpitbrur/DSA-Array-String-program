package practice;

public class program_97 {

	public static void main(String[] args) {
		int arr[]= {10,11,12,13,14};
		int temp[] = new int[arr.length];
		for(int i =0; i<temp.length;i++) {
			temp[i]=arr[i];
		}
		for(int i=0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
