
public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f0 = 0;
		int f1 = 1;
		int counter = 0;
		System.out.println(f0);
		System.out.println(f1);
		do {
			System.out.println(f0+f1);
			if(counter++ %2 == 0)
				f1 += f0;
			else
				f0 += f1;
			
		}while(counter <=8);
	}

}
