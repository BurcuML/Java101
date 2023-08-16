package BurcBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ocak=1,
                subat=2,
                mart=3,
                nisan=4,
                mayis=5,
                haziran=6,
                temmuz=7,
                agustos=8,
                eylul=9,
                ekim=10,
                kasim=11,
                aralik=12;
        Scanner date = new Scanner(System.in);

        System.out.println("Doğduğunuz ayı sayı olarak giriniz: ");
        int month = date.nextInt();
        System.out.println("Doğduğunuz tarihi giriniz: ");
        int birthday = date.nextInt();

        if(month==1){
            if(birthday<22){
                System.out.println("Oğlak Burcu.");
            }else {
                System.out.println("Kova Burcu.");
            }
        }
        else if(month==2){
            if(birthday<20){
                System.out.println("Kova Burcu.");
            }else {
                System.out.println("Balık Burcu.");
            }
        }
        else if(month==3){
            if(birthday<21){
                System.out.println("Balık Burcu.");
            }else {
                System.out.println("Koç Burcu.");
            }
        }
        else if(month==4){
            if(birthday<21){
                System.out.println("Koç Burcu.");
            }else {
                System.out.println("Boğa Burcu.");
            }
        }
       else if(month==5){
            if(birthday<22){
                System.out.println("Boğa Burcu.");
            }else {
                System.out.println("İkizler Burcu.");
            }
        }
        else if(month==6){
            if(birthday<23){
                System.out.println("İkizler Burcu.");
            }else {
                System.out.println("Yengeç Burcu.");
            }
        }
        else if(month==7){
            if(birthday<23){
                System.out.println("Yengeç Burcu.");
            }else {
                System.out.println("Aslan Burcu.");
            }
        }
        else if(month==8){
            if(birthday<23){
                System.out.println("Aslan Burcu.");
            }else {
                System.out.println("Başak Burcu.");
            }
        }
        else if(month==9){
            if(birthday<23){
                System.out.println("Başak Burcu.");
            }else {
                System.out.println("Terazi Burcu.");
            }
        }
        else if(month==10){
            if(birthday<23){
                System.out.println("Terazi Burcu.");
            }else {
                System.out.println("Akrep Burcu.");
            }
        }
        else if(month==11){
            if(birthday<22){
                System.out.println("Akrep Burcu.");
            }else {
                System.out.println("Yay Burcu.");
            }
        }
        else if(month==12){
            if(birthday<22){
                System.out.println("Yay Burcu.");
            }else {
                System.out.println("Oğlak Burcu.");
            }
        }
        else{
            System.out.println("Geçersiz tarih girdiniz.");
        }
    }

}