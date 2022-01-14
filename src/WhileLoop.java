
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "tacocat";
		while(s.length()>1)
			if(s.charAt(0) != s.charAt(s.length()-1)) break;
			else  s = s.substring(1, s.length()-1);
		System.out.println(s.length()<=1?"It is a palidrome":"It is not a palidrome");
	}

}
