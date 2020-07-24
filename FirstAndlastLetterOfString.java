package com.raj;

import java.util.Scanner;

public class FirstAndlastLetterOfString {
	public void Firstandlast(String str) {
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length()-1));
		
	}
		
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = in.nextLine();
		FirstAndlastLetterOfString fs = new FirstAndlastLetterOfString();
		fs.Firstandlast(str);

	}

}
