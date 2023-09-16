package practice;

public class program_112 {

	public static void main(String[] args) {
		int index=0, count=0;
		int arr[] = {10,20,20,50,50,45};

		int temp[]= new int[arr.length];
		
		System.out.println("Before removing duplicate from the array:");
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}

		for(int i=0;i<arr.length;i++)
		{
		count=0;
		for(int j=i+1;j<arr.length;j++)
		{
		if(arr[i]==arr[j])
		{
		count=count+1;
		break;
		}

		} 
		if(count==0)
		{
		temp[index]=arr[i];
		index++;
		}
		}

		for(int i=0;i<index;i++)
		{
		arr[i]=temp[i];
		}
		System.out.println("After removing duplicate from the array");
		for(int i=0;i<index;i++)
		{
		System.out.println(arr[i]);
		}

		}
		
}
