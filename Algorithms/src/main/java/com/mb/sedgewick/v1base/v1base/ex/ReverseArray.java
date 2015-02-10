package com.mb.sedgewick.v1base.v1base.ex;

import java.util.Arrays;
import java.util.List;

/**
 * Created by m.bova on 12/18/2014.
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(Arrays.toString(array) );
        List list = Utils.arayToList(array);
        System.out.println(list);
    }
}
