package StringA;

 class StringFormatter {  
public static String capitalizeWord(String str){  
    String words[]=str.split(" ");  
    StringBuffer sb=new StringBuffer();
    for(String w:words){  
        String first=w.substring(0,1);  
        String afterfirst=w.substring(1);  
        //capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
        sb.append(first.toUpperCase()+afterfirst+" ");
    }  
    return sb.toString();  
}  
}  

public class WordProg {

	public static void main(String[] args) {
		  System.out.println(StringFormatter.capitalizeWord("my name is khan"));  
		  System.out.println(StringFormatter.capitalizeWord("I am sonoo jaiswal"));  

	}

}
