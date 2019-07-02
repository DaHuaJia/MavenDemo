package com.krt;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        int a[] = {1,3,5,7,9};
        int b[] = {2,4,6,8,10};

        int len = a.length + b.length;

        int res[] = new int[len];

        int j=0,k=0;
        for(int i=0; i<a.length; i++){
            for( ; j<b.length; j++){
                if(a[i]>b[j]){
                    res[k++] = b[j];
                }else{
                    break;
                }
            }
            res[k++] = a[i];
        }
        if(j==b.length-1){
            res[k++] = b[j];
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
