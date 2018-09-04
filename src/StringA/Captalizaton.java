package StringA;

public class Captalizaton {

	public static void util(String s1){
		String words[]=s1.split(" "); 
		for(String s:words){
		String init=s.substring(0,1);
		String last=s.substring(1);
		StringBuffer sb=new StringBuffer();
		sb.append(init.toLowerCase()+last.toUpperCase()+" ");
		sb.reverse();
		
		System.out.print(sb.toString());
		// i am anand from git
		
	}
	}
	public static void main(String[] args) {
		util("my Mame is Khan");
	}
	
}
