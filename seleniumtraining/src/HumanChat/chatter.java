package HumanChat;

public class chatter {
	public static void main(String[] args) {
		// Nirav , Ayesha

		Human h1 = new Human();
		h1.name = "Nirav";
		h1.country = "India";
		h1.age = 25; 

		Human h2 = new Human();
		h2.name = "Ayesha";
		h2.country = "US";
		h2.age = 24;

		h1.speak("Hello");
		h2.speak("Hey! How r u?");

		Human h3 = new Human();
		h3.name = "Sufiyan";
		h3.country = "Aus";
		h3.age = 26;
}
}