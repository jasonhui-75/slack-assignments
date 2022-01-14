import java.util.Arrays;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] primes = new int[101];
		int i = 0;
		for(i = 0; i < 101; ++i)
			primes[i]=(i<=1)?0:1;
		for(i = 2; i < Math.sqrt(101); ++i)
		{
			if(primes[i] == 1)
				for(int j = i+i; j < 101; j+=i)
					primes[j] = 0;
		}
		for(i = 0; i < 101; ++i)
			if(primes[i] == 1)
				System.out.println(i);
	}

}
