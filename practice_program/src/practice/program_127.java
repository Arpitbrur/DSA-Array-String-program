package practice;

public class program_127 {

	public static void main(String[] args) {
		String s1 = "ARPITBRUR";
		String upper ="";
		char ch[]= s1.toCharArray();
		for(int i=0; i<ch.length; i++) {
			char c= (char) (ch[i]+32);
			upper = upper+c;
		}
		System.out.println(upper);
	}
}
