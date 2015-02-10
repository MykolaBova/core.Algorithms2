package com.mb.sedgewick.v1base.v1base.ex.v12;

/**
 * Created by m.bova on 12/18/2014.
 */
public class HelloWorld {
    public static void main(String[] args) {
        int[] a = new int[10];
        System.out.println("---- 1");

        for(int i = 0; i < 10; i++){
            System.out.print(i + "\t");
        }
        System.out.println("");
        for(int i = 0; i < 10; i++){
            a[i] = 9 - i;
            System.out.print(a[i] + "\t");
        }
        System.out.println("");

        System.out.println("---- 2");
        for(int i = 0; i < 10; i++){
            System.out.print("i="+ i);
            System.out.print(" a[i]*="+ a[i]);
            System.out.print(" a[a[i]]*="+ a[a[i]]);

            a[i] = a[a[i]];
            printPartialLine(a, i);

            System.out.print("a[a[i]="+ a[a[i]]);
            System.out.println(" a[i]="+a[i]);
            System.out.println("-");
        }
        System.out.println("---- 3");
        for(int i = 0; i < 10; i++){
            System.out.println(a[i]);
        }
    }

    public static void printPartialLine(int[] a, int limit) {
        System.out.println("");
        for(int i = 0; i < a.length; i++){
            System.out.print(i + "\t");
        }
        System.out.println("");
        for(int i = 0; i <= limit; i++){
            System.out.print(a[i] + "\t");
        }
        for(int i = limit; i < a.length-1; i++){
            System.out.print("*" + "\t");
        }
        System.out.println("");
    }
}
