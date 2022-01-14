
public class SwitchCaseTest {
	public static void main(String[] args)
	{
		char c = 'u';
		c = Character.toUpperCase(c);
		switch(c)
		{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("It is a vowel.");
				break;
			default:
				System.out.println("It is not a vowel.");
		}
	}
}
