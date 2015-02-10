package com.mb.sedgewick.v1base.v1base.ex.v11;

/**
 * Created by m.bova on 12/18/2014.
 */
public class HelloWorld {
    public static void main(String[] args) {
        boolean[][] boolArra1 = {
                {true, true, true},
                {true, false, true},
                {false, true, false}
        };
        printBinaryArray( boolArra1 );


        boolean[][] boolArra2 = {
                {true, true, true, false},
                {true, false, false, true},
                {false, true, false, true},
                {false, true, false, true}
        };
        printBinaryArray( boolArra2 );
    }

    public static void printBinaryArray(boolean[][] binaryArray ){

        printBinaryArrayHeader( binaryArray );

        for(int row = 0; row < binaryArray.length; row++) {
            System.out.print(row+"\t");
            for(int column = 0; column <  binaryArray[0].length; column++) {
                if(binaryArray[row][column] == true) {
                    System.out.print('*');
                    System.out.print("\t");
                } else {
                    System.out.print(' ');
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }

    public static void printBinaryArrayHeader(boolean[][] binaryArray ) {
        System.out.print("\t");
        for(int column = 0; column <  binaryArray[0].length; column++) {
            System.out.print(column);
            System.out.print("\t");
        }
        System.out.println("");
    }
}
