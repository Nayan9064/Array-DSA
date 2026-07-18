package com.nayan;

public class java {


//    int[][] arr=new int[3][3];

    int [] [] arr =new int[3][3];
    System.out.println(arr.length);

    for (int row=0; row< arr.length; row++){
        for (int col=0; col< arr[row].length; col++){
            arr[row][col]=in.nextInt();
        }
    }

    for (int row col=0;row<arr[row].length;row++){
        for (int col=0 ; col< arr[row].length; col++){
            System.out.print(arr[row][col]+" ");
        }
    }
    System.out.println();


}
