/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViDu01;

import java.io.*;
/**
 *
 * @author ADMIN
 */
public class ReadLineText {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("baitho.txt");
            BufferedReader br = new BufferedReader(fr);
//            int ch;
            String s;
            while ((s=br.readLine()) != null) {                
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println("Loi: " +e.toString());
            System.out.println("Doc file that bai");
        }
    }
}
