package com.mb.sedgewick.v1base.v1base.ex.v3;

public class HelloWorld {

    public static void main(String[] args) {
		
		if(args.length >=3) {
			if(Utils.isInteger(args[0]) && Utils.isInteger(args[1]) && Utils.isInteger(args[2])) {
				int i1 = Integer.parseInt(args[0]);
				int i2 = Integer.parseInt(args[1]);
				int i3 = Integer.parseInt(args[2]);
				if((i1 == i2) && (i1 == i3)) {
					System.out.println("Equals");
				}
				else {
					System.out.println("Not Equals");
				}
			}
			else {
				System.out.println("Please enter 3 integer arguments");
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