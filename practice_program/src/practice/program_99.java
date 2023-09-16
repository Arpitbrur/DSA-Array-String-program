package practice;

import java.util.Scanner;

public class program_99 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[]= {10,20,30,50,60};
		System.out.println("Enter index value");
		int index = scanner.nextInt();
		System.out.println("Enter array element value");
		int temp[]= new int[arr.length+1];
		for(int i=0; i<temp.length;i++) {
			if(i<index) {
				temp[i]=arr[i];
			}else if(i==index) {
				temp[i]= scanner.nextInt();
			}else {
				temp[i]= arr[i-1];
			}
		}
		for(int i=0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
