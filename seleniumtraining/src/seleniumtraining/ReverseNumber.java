package seleniumtraining;

public class ReverseNumber {
	public static void main(String[] args) {
			int n=123,r=0;
			while(n!=0)
			{
				int reminder=n%10;
				r=r*10+reminder;
				n=n/10;
			}
				System.out.println("reverse number :" +r);
		}
}


