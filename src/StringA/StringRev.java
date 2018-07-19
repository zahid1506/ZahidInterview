package StringA;

public class StringRev {
	static String s1="";
    static	String s2= "AnandKumar";
	public static void rev(){
		for(int i=s2.length()-1;i>=0;i--){
			s1=s1+s2.charAt(i);
		}
		System.out.println(s1);
		
	}

	
	
	public static void main(String[] args) {
		StringRev w= new StringRev();
	    w.rev();
		
		
	}

}
