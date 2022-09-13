package JavaProgPractice;

public class RecursionSumOfNumbers {
    static int n=124;
    static int sum=0;
	public static void main(String[] args) {
		System.out.println("Start");
		sumofNumber();
		System.out.println(sum);
		System.out.println("end");

	}
	public static void sumofNumber()
	{
		if(n>0)
		{
			int rem =n%10;
			sum=sum+rem;
			n=n/10;
			sumofNumber();
		}
		
	}

}
