package seleniumtraining;

public class Palindrom {
	public static void main(String[] args) {
		int n=121,r,sum=0,temp;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(10*sum)+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("number is palindrom");
		else
		System.out.println("number is not palindrom");

	}
	}
