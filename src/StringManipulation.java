import java.util.Arrays;

public class StringManipulation {
	public static String parseString(String s)
	{
		String result = "";
		for(int i = s.length()-1; i >= 0; --i)
			result += i==0?s.charAt(i):s.charAt(i) +"-";
		return result;
	}
	public static String removeX(String s)
	{
		int[] x = new int[s.length()];
		int i = 0;
		int counter = 0;
		for(i = 0; i < s.length(); ++i)
		{
			if(s.charAt(i) == 'x')
				x[counter++] = i; //saves index of small x
		}
		
		if(counter == s.length())
			return s;
		
		String result = "";
		for(i = 0; i < counter; ++i)
		{
			if(x[i] != 0)
			{
				if(i > 0)
					result += i==counter-1?s.substring(x[i]+1, s.length()):s.substring(x[i-1]+1, x[i]);
				else 
					result += x[i]==0?"":s.substring(0, x[i]);
			}
		}
		for(i = 0; i < counter; ++i)
			result +='x';
		return result;
		
	}
	public static String firstLast(String s)
	{
			return s.length()>1?s.charAt(s.length()-1) +s.substring(1, s.length()-1) +s.charAt(0):s;
	}
	public static String maxLength(String s)
	{
		String[] words = s.split(" ");
		if(words.length == 1)
			return s;
		int max = 0;
		for(int i = 1; i < words.length; ++i)
			if(words[max].length() < words[i].length())
				max = i;
		return words[max];
	}
	public static String abbreviation(String s)
	{
		String[] words = s.split(" ");
		if(words.length == 1)
			return String.valueOf(Character.toUpperCase(words[0].charAt(0)));
		String result = "";
		for(int i = 0; i< words.length; ++i)
		{
			result += Character.toUpperCase(words[i].charAt(0));
		}
		return result;
	}
	public static String abbreviation2(String s)
	{
		String[] words = s.split(" ");
		if(words.length == 1)
			return String.valueOf(Character.toUpperCase(words[0].charAt(0)));
		String result = "";
		for(int i = 0; i< words.length; ++i)
		{
			result += Character.toUpperCase(words[i].charAt(i));
		}
		return result;
	}
	
	public static String nextChar(String s)
	{
		char[] input =s.toCharArray();
		for(int i = 0; i < input.length; ++i)
			if ((input[i] >= 97 && input[i] <= 121)||(input[i] >= 65 && input[i] <= 89))
				++input[i];
			else if(input[i] == 122)
				input[i] = 97;
			else if(input[i] == 90)
				input[i] = 65;
				
		return String.valueOf(input);
	}
	public static void main(String[] args)
	{
		System.out.println(StringManipulation.parseString("computer"));
		System.out.println(StringManipulation.removeX("xxabcxXXcxerxxXXwer"));
		System.out.println(StringManipulation.firstLast("Hello World"));
		System.out.println(StringManipulation.maxLength("Hi How are you"));
		System.out.println(StringManipulation.abbreviation("Softra Services Limited"));
		System.out.println(StringManipulation.abbreviation2("Softra Services Limited"));
		System.out.println(StringManipulation.nextChar("hello java"));
	}
}
