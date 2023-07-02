package penobject;

public class Ballpen {
	Refill refillObject;
	Cap cap;
	penBody body;




	public void writeContent(String content) {
		System.out.println("-- will be written in " + refillObject.color);
		System.out.println(content);
	}	
}
