package practice;

import java.util.Scanner;

public class program_100 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[]= {12,13,14,15,67,16,17};
		System.out.println("Enter index value");
		int index = scanner.nextInt();
		int temp[] = new int[arr.length-1];
		for(int i =0; i<temp.length; i++) {
			if(i<index) {
				temp[i]= arr[i];
			}else {
				temp[i]= arr[i+1];
			}
		}
		for(int i = 0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
