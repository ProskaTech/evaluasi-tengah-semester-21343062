/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utsprakpbonesaathallah;

/**
 * Created by 21340362-Nesa Athallah
 * @author user
 */
import java.util.Scanner;
public class No2UTS {
    public static void main(String[] args){
        int A,B,C,input;

        Scanner dataMasuk = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Baris = ");
        input = dataMasuk.nextInt();

        for(A=0;A<=input;A++){
            for(B=1;B<=A;B++){
            System.out.print(" ");
            }
            for(C=1;C<=input-A;C++){
            System.out.print(" #");
            }
            System.out.println();
        }

        for(A=1;A<=input;A++){
            for(B=1;B<=input-A;B++){
            System.out.print(" ");
            }
            for(C=1;C<=A;C++){
            System.out.print(" *");
            }
            System.out.println();
        }
    }
}