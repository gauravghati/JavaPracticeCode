package com.gauravghati;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int mat[][] = new int[n][n];
        int count = (n+1)/2;
        int k = 1;

        while (count>0){
            int end = n-k;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++) {
                    if((i==n-end-1 || i==end) || (j==n-end-1 || j==end)) {
                        if(mat[i][j]==0)
                            mat[i][j] = count;
                    }
                }
            }
            count--;
            k++;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}

