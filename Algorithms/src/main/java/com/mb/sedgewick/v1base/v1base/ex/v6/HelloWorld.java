package com.mb.sedgewick.v1base.v1base.ex.v6;

public class HelloWorld {

    public static void main(String[] args) {
		
		int f = 0;
		int g = 1;
		for(int i = 0; i < 15; i++) {
			System.out.println(f);
			f = f + g;
			g = f - g;
		}


	}
}