package com.example.week6test;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Problem3 {
    static Deque<Integer> deque;
    static HashSet<Integer> map;
    static int cacheSize;

    public static void main(String[] args){

        System.out.println("*****Problem 3*****");
        Problem3 cache = new Problem3(4);
        cache.refer(1);
        cache.refer(2);
        cache.refer(3);
        cache.refer(1);
        cache.refer(4);
        cache.refer(5);
        cache.display();
    }

    Problem3(int n){
        deque = new LinkedList<>();
        map = new HashSet<>();
        cacheSize = n;
    }

    public void refer(int x){
        if(!map.contains(x)){
            if(deque.size()==cacheSize){
                int last = deque.removeLast();
                map.remove(last);
            }
        }
        else {
            int index=0, i=0;
            Iterator<Integer> itr = deque.iterator();
            while (itr.hasNext()){
                if(itr.next()==x){
                    index = i;
                    break;
                }
                i++;
            }
            deque.remove(index);
        }
        deque.push(x);
        map.add(x);
    }

    public void display(){
        Iterator<Integer> itr = deque.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
