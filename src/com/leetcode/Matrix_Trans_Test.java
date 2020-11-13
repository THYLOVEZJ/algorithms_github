package com.leetcode;

public class Matrix_Trans_Test {
    public static void main(String[] args) {
        int[][] myMatrix=new int[][]{{1,2,3},{4,5,6}};
        Matrix_Trans mt=new Matrix_Trans();
        int[][] B=mt.transpose(myMatrix);
        for (int i=0;i<B.length;i++){
            for (int j=0;j<B[0].length;j++)
                System.out.print(B[i][j]);
            System.out.println();
        }
    }
}
