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

import java.util.Random;

public class SoalDua {
    public static void main(String[] args) {
        String strKonsonan = "bcdfghjklmnpqrstvwxyz";
        String strVocal = "aiueo";

        StringBuilder strHasil = new StringBuilder("");

        char[] charKonsonan = strKonsonan.toCharArray();
        char[] charVocal = strVocal.toCharArray();

        Random random = new Random();
        int intVocal = random.nextInt(2) ;
        int intRange = random.nextInt(12,100);
        int intMulaiRandom = 7;
        int intKonsonanLength = strKonsonan.length();
        int intVocalLength = strVocal.length();

        for (int i = 0;i<intMulaiRandom;i++){
            if (intVocal == 1){
                intVocal =0;
                if (i==0){
                    strHasil = strHasil.append(Character.toUpperCase(charKonsonan[random.nextInt(intKonsonanLength)]));
                }else {
                    strHasil = strHasil.append(charKonsonan[random.nextInt(intKonsonanLength)]);
                }
            }else{
                intVocal =1;
                if (i==0){
                    strHasil = strHasil.append(Character.toUpperCase(charVocal[random.nextInt(intVocalLength)]));
                }else{
                    strHasil = strHasil.append(charVocal[random.nextInt(intVocalLength)]);
                }
            }
        }
        for (int j=intMulaiRandom;j<intRange;j++){
            intVocal = random.nextInt(2) ;
            if (intVocal == 1){
                strHasil = strHasil.append(charKonsonan[random.nextInt(intKonsonanLength)]);
            }else{
                strHasil = strHasil.append(charVocal[random.nextInt(intVocalLength)]);
            }
        }
        System.out.println(strHasil.toString());

    }
}
