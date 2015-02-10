package com.mb.sedgewick.v1base.v1base.ex.v9;

/**
 * Created by m.bova on 12/18/2014.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(intToBinaryString(1));
        System.out.println(intToBinaryString(10));
    }

    public static String intToBinaryString(int N) {
        String s = "";
        for(int n = N; n > 0; n = n/2) {
            //System.out.println( "-- n="+ Integer.toString(n) );

            s = (n % 2) + s;

            System.out.println( "-- n=" + n );
            System.out.println( "-- n % 2=" + n % 2 );
            System.out.println( "-- s=" + s );
        }

        return s;
    }
}
