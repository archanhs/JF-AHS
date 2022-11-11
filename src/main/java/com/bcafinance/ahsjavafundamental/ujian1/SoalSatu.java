package com.bcafinance.ahsjavafundamental.ujian1;
/*
https://github.com/archanhs/JF-AHS.git
Created By IntelliJ IDEA 2022.2.3 (Community Edition) 
@Author ASUS a.k.a. Archan
ITDP 7
Created on 11/11/2022
@Last Modified on 11/11/2022 13:41
Version 1.0
*/

import java.util.Scanner;

public class SoalSatu {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
        int intNumber = 0;
        int intTotal = 0;
        boolean isAgain = true;
        try {
            while (isAgain){
                System.out.print("Masukkan angka sepuasnya:");
                intNumber = myScanner.nextInt();
                intTotal += intNumber;
            }
        }
        catch(Exception e) {
            System.out.println("Jumlah:"+intTotal);
        }

    }
}
