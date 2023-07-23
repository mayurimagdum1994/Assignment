package abc;

public class AbcDemo {
	public static void main(String args[]){  

	    Car b = new Audi();

	    b.run();  

	  }  

	}  

	class Car{

		 void run()
		 {
			 System.out.println("running");
			 }

		}

		class Audi extends Car{

		 void run()
		 {
			 System.out.println("running swiftly with 100km");
		}  

	}
