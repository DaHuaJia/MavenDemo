package com.krt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello World !
 *
 */
public class Demo2 {
    public static void main( String[] args ){
        Scanner in = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        while(in.hasNext()){
            a.add(in.nextInt());
        }
        while(in.hasNext()){
            b.add(in.nextInt());
        }

        int len = a.size() + b.size();

        int res[] = new int[len];

        int j=0,k=0;
        for(int i=0; i<a.size(); i++){
            for( ; j<b.size(); j++){
                if(a.get(i)>b.get(j)){
                    res[k++] = b.get(j);
                    
                }else{
                    break;
                }
            }
            res[k++] = a.get(i);
        }
        if(j==b.size()-1){
            res[k++] = b.get(j);
        }

        for(int i=0; i<len; i++){
            System.out.print(res[i]+", ");
        }

        if(len % 2 == 0){
            System.out.println((res[len/2]+res[(len/2)-1])/2.0);

        }else{
            System.out.println(res[len/2]);
        }
    }
}
