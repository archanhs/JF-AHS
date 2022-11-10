package com.bcafinance.fundamental.day4;
/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition) 
@Author ASUS a.k.a. Archan
ITDP 7
Created on 10/11/2022
@Last Modified on 10/11/2022 13:56
Version 1.0
*/

public class Soal1 {
    public static void main(String[] args) {
        int[] intArr = {3,8,5,2,1,9,10};
        int intB = 1;
        boolean isFound = true;
        for (int i = 0 ;i<intArr.length;i++){
            if (intB == intArr[i]){
                System.out.println("Angka "+intB+" Sudah Ditemukan, pada index ke "+ i);
                isFound = false;
                break;
            }
        }
        if (isFound){
            System.out.println("angka "+intB+" yang anda cari tidak ditemukan!!");
        }
    }
}
