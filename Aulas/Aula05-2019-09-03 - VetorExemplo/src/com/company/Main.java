package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x[] = new int[10];
        /*for(int i = 0; i < x.length; i++)
        {
            System.out.println(x[i]);
        }*/

        /*for (int item:x) {
            System.out.println(item);
        }

        int vetor[] = {12,45,78};
        for (int i:vetor) {
            System.out.println(i);
        }*/

        int v1[] = {1,2,3,4,5,7,9,11,13,15};
        int v2[] = new int[10];

        //System.arraycopy(v1,3,v2,5,5);
        Arrays.fill(v2, 99);


        for (int i = 0; i < v2.length; i++) {
            System.out.println(v2[i]);
        }
    }
}
