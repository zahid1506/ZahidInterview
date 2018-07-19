package StringA;

public class ReverseEachword {

	public static void reverseword(String s){
		String arrofstr[]=s.split(" ");
		for(String w:arrofstr){
			StringBuffer sb=new StringBuffer(w);
			sb.reverse();
			System.out.print(sb.toString()+" ");
		}
	}
	public static void main(String[] args) {
		reverseword("my name is anand");
	}
	
}
