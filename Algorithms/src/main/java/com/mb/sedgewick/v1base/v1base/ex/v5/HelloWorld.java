package com.mb.sedgewick.v1base.v1base.ex.v5;

public class HelloWorld {

    public static void main(String[] args) {
		
		if(args.length >=2) {
			if(Utils.isDouble(args[0]) && Utils.isDouble(args[1]) ) {
				double i1 = Double.parseDouble(args[0]);
				double i2 = Double.parseDouble(args[1]);

				if((i1 >0 && i1 < 1) && (i2 >0 && i2 < 1)) {
					System.out.println("true");
				}
				else {
					System.out.println("false");
				}
			}
			else {
				System.out.println("Please enter 2 double arguments");
			}
		} else {
			System.out.println("Please enter arguments");
		}		
		/*
        if(args[0] != null && !args[0].isEmpty()) {
			if(args[1] != null && !args[1].isEmpty()) {
				if(args[2] != null && !args[2].isEmpty()) {

				} else {
					System.out.println("Third argument is empty");
				}
			} else {
				System.out.println("Second argument is empty");
			}
        } else {
			System.out.println("First argument is empty");
		}
		*/
		
        // System.out.println("Hello, World");
		// System.out.println("args.length="+args.length);
    }

}