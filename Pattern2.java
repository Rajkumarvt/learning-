package com.raj;

public class Pattern2 {

	public static void main(String[] args) {
		char last = 'E', alphabet = 'A';
		System.out.println(last - 'A' +1);
		System.out.println('E' - 'B');
		for (int i = 1; i<= (last - 'A' +1); ++i) {
			for (int j =1; j<=i; ++j) {
				System.out.print(alphabet + " ");
				
			}
			++alphabet;
			System.out.println();
		}
	}

}
