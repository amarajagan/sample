import java.util.ArrayList;
import java.util.List;

public class StringTest {
 public static void main(String[] args) {
	String input="a4k3b2";
	StringBuilder target=new StringBuilder();
	for(int i=0;i<input.length();i++) {
		char ch=input.charAt(i);
		if(Character.isAlphabetic(ch)) {
			target.append(ch);
		}
		else if(Character.isDigit(ch)) {
			 char ch1=target.charAt(i-1);
			 int temp2=ch-48;			 
			 System.out.println("temp2 is "+temp2);
			 int result=(int)ch1+temp2;
			 char result1=(char)result;
			 System.out.println("Result is "+result);
			 target.append(result1);
		}
				
	}
	
	String output= target.toString();
	System.out.println("output is "+output);
	
	
	
	List<String> values =new ArrayList<String>();
	
	values.add("one");
	values.add("one");
	
	values.stream().forEach( (i)->System.out.println(i));
	
	
//	 int i=1;
//	 char c=(char)i-48;
	 
//	 System.out.println("number is"+c);
}
}
