package serie4;

import serie4.Student.Major;

public class aufgaben {
	
	enum CardSuit {clubs, diamonds, hearts, spades}

	public static void main(String[] args) {
		
		/* Aufgabe 1
		 * clubs
		 * hearts
		 * 0
		 * 2
		 */
		
		System.out.println("Aufgabe 1");
		CardSuit card1, card2;
		card1 = CardSuit.clubs;
		card2 = CardSuit.hearts;
		
		System.out.println(card1);
		System.out.println(card2.name());
		System.out.println(card1.ordinal());
		System.out.println(card2.ordinal());;
		System.out.println("-------------------");
		
		/* Aufgabe 2
		 * Typensicherheit (ich stelle sicher, dass ich die richtigen Werte verwende. Enums k�nnen ausserdem nicht �berschrieben werden.)
		 * Gegenbeispiel
		 * card1 = "hearts";
		 * card1 = "something";
		 */
		
		/* Aufgabe 3 */
		
		System.out.println("Aufgabe 3");
		System.out.println(Integer.MAX_VALUE);
		System.out.println("-------------------");
		
		int i = Integer.MAX_VALUE + 1;
		System.out.println(i);
		
		/* Aufgabe 4 */
		Double d = new Double(3.456);
		
		/* Aufgabe 5 
		 * 
		 * public void Book()
		{
			int Bookid;
			int Libraryid;
			int Userid = 0; // 0 = available, not borrowed
			String title;
			String author;
			String publish_date;
			String description;
		}
		
		public void UpdateBook(); // update information
		public void DeleteBook(); // book has been taken out of service, book was lost, book is damaged
		public void AddBook(); // adds new Book
		public ArrayList<Book> ListBooks(); // lists books
	*/
		
				
		/* Aufgabe 6 
		 * Ein Objekt wird aus einer Klasse instanziert. Eine Klasse kann nicht instanziert werden. */
		
		
		/* Aufgabe 7 
		 *  faceValue = 1
		 *  diese Variabel wurden initialisiert und dies bezeichnet man als Instanzdaten. */
		
		/* Aufgabe 8 
		 * roll()
		 * setFaceValue()*/
		
		/* Aufgabe 9
		 * Das Objekt wird durch die Mehtode toString() ausgegeben;
		 */
		
		System.out.println("Aufgabe 9");
		Student s = new Student("Matt", Major.Info, 329874);
		System.out.print(s);
		System.out.println("-------------------");
		
		/* Aufgabe 10
		 * Scope ist der der Bereich, in dem die Variable g�ltig ist. / Scope ist der Bereich, wo auf die Variable zugegriffen werden kann.
		 */
		
		/* Aufgabe 11
		 * Java ist eine objektorientierte Programmiersprache und im Normalfall wird man je nach Projekt nicht nur mit einer Klasse, sondern mit sehr vielen Klassen arbeiten. 
		 * Wenn dann am Projekt nicht nur eine Person, sondern eine ganze Gruppe arbeitet, dann m�ssen im Programm selbst Vorkehrungen getroffen werden um m�gliche Fehler schon im Vorhinein auszuschlie�en. 
		 * Hilfreich ist dabei die sogenannte Datenkapselung
		 * 
		 * M�gliche Zugriffsarten bei der Kapselung
		 * public (+) - Zugriff von au�erhalb und innerhalb der Klasse m�glich
		 * private (-) - Zugriff nur innerhalb der Klasse m�glich
		 * protected (#) - Zugriff nur innerhalb der Klasse und von Spezialisierungen derselben
		 */
		
		/* Aufgabe 12
		 * Ein Interface ist eine Schnittstelle, in der festgelegt wird, �ber welche Methoden die Klassen, die das Interface implementieren, verf�gen m�ssen. 
		 * Die Interfaces selber enthalten daher nur Funktionsk�pfe und Konstanten. Alle Klassen, die das Interface implementieren, m�ssen s�mtliche Methoden, die das Interface vorgibt, enthalten.
		 * http://www.java-tutorial.org/objektorientierung-interfaces.html
		 */
		
		/* Aufgabe 13
		 * Weil sich Konstanten nicht �ndern, ist es �blich diese als public zu deklarieren
		 */
		
	}

}
