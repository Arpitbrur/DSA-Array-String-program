package practice;

public class program_133 {

	public static void main(String[] args) {
		String s1 = "java is a programming language";
		String s2[] = s1.split(" ");
		for (String s3 : s2) {
			char ch[] =s3.toCharArray();
			String rev =" ";
			for(int i = ch.length-1; i>=0; i--) {
				rev =rev +ch[i];
			}
			System.out.print(rev);
		}
	}
}
