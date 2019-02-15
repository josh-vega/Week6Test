package com.example.week6test;

import java.util.ArrayList;
import java.util.Random;

public class Problem1 {
    private static int length;
    private static int[] array = new int[20];
    private static int[] tempArray = new int[20];

    public static void main(String[] args){
        System.out.println("*****Problem 1*****");
        Random random = new Random();
        for(int i=0;i<20;i++){
            int num = random.nextInt(1000);
            array[i] = num;
        }
        Problem1 mergeSort = new Problem1();
        mergeSort.sort(0,19);
        for(int i=0;i<20;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    private void sort(int start, int end){
        if(start < end){
            int middle = start + (end - start) / 2;
            sort(start, middle);
            sort(middle+1, end);
            merge(start, middle, end);
        }
    }

    private void merge(int start, int middle, int end){

        for(int i = start; i <= end; i++){
            tempArray[i] = array[i];
        }
        int i = start, j = middle+1, k = start;
        while (i <= middle && j <= end){
            if(tempArray[i] <= tempArray[j]){
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i<=middle) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
    }
}
