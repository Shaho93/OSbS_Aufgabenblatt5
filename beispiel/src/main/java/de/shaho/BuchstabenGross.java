package de.shaho;
import java.util.Scanner;

public class BuchstabenGross {

	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		String text= st.nextLine();
		int diff = 'a' - 'A';
		text = text.toUpperCase();
		System.out.println(text);

	}

}
