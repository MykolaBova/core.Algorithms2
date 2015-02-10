package com.mb.sedgewick.v1base.v1base.ex;

class Wind
{
    public static void main(String[] args)
    {
        int arr[] = new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i] = (i+1)*2;
        }
        System.out.println("original array");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        for(int i=0,j=arr.length-1;i<(arr.length)/2;i++,j--)
        {
            int c;
            c=arr[i];
            arr[i]=arr[j];
            arr[j]=c;
        }

        System.out.println("Reversed array");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}