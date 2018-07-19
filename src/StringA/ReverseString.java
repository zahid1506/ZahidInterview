package StringA;

public class ReverseString {
	static StringBuffer sb = new StringBuffer();
	public static  void reverse(String s){
		for(int i = s.length()-1;i>=0; i--){
			sb.append(s.charAt(i));
		}
		System.out.println(sb.toString());
		
	}
	public static void main(String[] args) {
		ReverseString.reverse("asd");
	}

}
