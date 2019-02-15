package com.example.week6test;

public class Problem4 {

    public static void main(String[] args){
        System.out.println("*****Problem 4*****");
        int row = 3, col = 6;
        int array[][] = { {1,  2,  3,  4,  5,  6},
                {7,  8,  9,  10, 11, 12},
                {13, 14, 15, 16, 17, 18}
        };
        spiral(row,col,array);
    }

    private static void spiral(int rowEnd, int colEnd, int array[][]){
        int rowStart = 0, colStart = 0;

        while (rowStart < rowEnd && colStart < colEnd){
            //First Row
            for(int i = 0; i < colEnd; ++i){
                System.out.print(array[rowStart][i] + " ");
            }
            rowStart++;

            //Last Col
            for(int i = rowStart; i < rowEnd; ++i){
                System.out.print(array[i][colEnd-1] + " ");
            }
            colEnd--;

            //Last Row
            if(rowStart < rowEnd){
                for(int i = colEnd-1; i >= colStart; --i){
                    System.out.print(array[rowEnd-1][i] + " ");
                }
                rowEnd--;
            }

            //Remaining
            if(colStart < colEnd){
                for(int i = rowEnd-1; i >= rowStart; --i){
                    System.out.print(array[i][colStart] + " ");
                }
                colStart++;
            }
        }
    }

}
