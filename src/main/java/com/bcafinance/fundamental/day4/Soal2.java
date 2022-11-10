package com.bcafinance.fundamental.day4;
/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition) 
@Author ASUS a.k.a. Archan
ITDP 7
Created on 10/11/2022
@Last Modified on 10/11/2022 14:36
Version 1.0
*/

public class Soal2 {
    public static void main(String[] args) {
        int intKeyword = 99;
        int[] intValArr = {66,77,88,99,100};
        int intLow = 0;
        int intHigh =intValArr.length-1;
        int intMed = 0;
        boolean isStatus = false;
        while (intLow<=intHigh) {
            intMed = (intLow + intHigh) / 2;
            if (intKeyword == intValArr[intMed]) {
                System.out.println(intKeyword + " FOUNDED in position " + (intMed + 1) + " and INDEX " + intMed);
                isStatus = true;
                break;
            }
            else{
                if (intKeyword>intValArr[intMed]){
                    intLow = intMed+1;

                }else {
                    intHigh = intMed-1;

                }
            }
        }
        if (!isStatus){
            System.out.println(intKeyword+" NOT FOUND!!");
        }
    }
}
