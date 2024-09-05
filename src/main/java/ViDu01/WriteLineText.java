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
public class WriteLineText {
    public static void main(String[] args) {
        String s = "Buoc toi deo ngang bong xe ta\nCo cay chen la, la chen hoa";
        String s2 = "\nLom khom duoi nui tieu vai chu\nLac dac ben song cho may nha";
        try {
            FileWriter fw = new FileWriter("baitho.txt");
            fw.write(s);
            fw.write(s2);
            fw.close();
            System.out.println("Da ghi xong");
        } catch (Exception e) {
            System.out.println("Loi: " +e.toString());
            System.out.println("Ghi file that bai");
        }
    }
}
