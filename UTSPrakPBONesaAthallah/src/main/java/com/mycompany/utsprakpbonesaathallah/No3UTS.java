/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utsprakpbonesaathallah;

/**
 * Created by 21343062-Nesa Athallah
 * @author user
 */
import javax.swing.JOptionPane;
public class No3UTS {
    public static void main(String[] args) {
        int angka;
        
        angka = Integer.parseInt (JOptionPane.showInputDialog("Masukkan Angka:"));
        
         if(angka>=0)
     {
         JOptionPane.showMessageDialog(null,"Bilangan ini adalah bernilai Positif\n"+angka );
     }
         else
        {
         JOptionPane.showMessageDialog(null,"Bilangan ini adalah bernilai Negatif\n"+angka );
            
        }
    }
}