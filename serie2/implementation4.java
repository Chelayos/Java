package serie2;

import java.util.Scanner;

public class implementation4 {

	public static void main(String[] args) {
		double l�nge, breite, fl�che, umfang;
		Scanner s = new Scanner (System.in);
		
		System.out.println("L�nge des Rechtecks?");
		l�nge = s.nextDouble();
		
		System.out.println("Breite des Rechtecks?");
		breite = s.nextDouble();
		
		fl�che = l�nge * breite;
		umfang = 2*l�nge + 2*breite;
		
		System.out.println("Umfang = " + umfang);
		System.out.println("Fl�che = " + fl�che);
		
	}

}
