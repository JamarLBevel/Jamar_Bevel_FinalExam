package com.example.bevel_jamar_finalexalm_barchart;

import java.util.Arrays;

public class ArraysCheck {
    
    int[] a,b; boolean outPut = true;
    
    ArraysCheck(int[] al,int[] bl) {
        a = al; b = bl;
    }
    public boolean check(){
        Arrays.sort(a);Arrays.sort(b);
        for (int n = 0; n < a.length;n++){
            if (a[n] < b[n]){
                a[n] += 1;
            }else if (b[n] < a[n]){
                b[n] += 1;
            }
            if (a[n] != b[n]){
                outPut = false;
            } 
            }
        return outPut;
    }
    
}

