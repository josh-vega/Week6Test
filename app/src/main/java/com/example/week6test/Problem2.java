package com.example.week6test;

import java.util.ArrayList;

public class Problem2 {

    public static void main(String[] args){
        System.out.println("*****Problem 2*****");
        String[][] stringArray = {{"a", "b", "c"},{"d", "e", "f"},{"g", "a", "b"}};
        String[] elements = new String[9];
        ArrayList<String> duplicates = new ArrayList<>();
        ArrayList<Coordinate> coordinates = new ArrayList<>();


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0; k<9; k++){
                    if(stringArray[i][j].equals(elements[k])){
                        //coordinates.add(new Coordinate(i,j));
                        duplicates.add(stringArray[i][j]);
                    }
                }
                elements[i*3+j] = stringArray[i][j];
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(duplicates.contains(stringArray[i][j])){
                    coordinates.add(new Coordinate(i,j));
                }
            }
        }

        for (int i=0;i<coordinates.size();i++){
            System.out.println(coordinates.get(i).getX() + " " + coordinates.get(i).getY());
        }

    }
}

class Coordinate{
    int x, y;
    int val;

    public Coordinate() {
    }

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate(int x, int y, int val) {
        this.x = x;
        this.y = y;
        this.val = val;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}