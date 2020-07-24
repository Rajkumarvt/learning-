package com.raj;

import java.util.Arrays;

public class Snippet {
	public static void main(String[] args) {
		String [] strname = {"john", "sony", "amit","madhu"};
		String [] revName =  new String [strname.length];
		
		int index = 0;
		for(int i = strname.length-1; i>=0; i--) {
			revName[index] = strname[i];
			index++;
		}
		System.out.println(Arrays.toString(revName));
	}
}

