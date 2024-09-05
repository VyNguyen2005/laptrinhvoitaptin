/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai01;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class ReadTextFile {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("sanpham.txt");
            BufferedReader br = new BufferedReader(fr);
            String s;
            try {
                while ((s=br.readLine()) != null) {
                    String[] chuoi = s.split(";");
                    System.out.println("SanPham{" + "maso=" + chuoi[0] + ", ten=" + chuoi[1] + ", gia=" + chuoi[2] + '}');
                }
            } catch (IOException ex) {
                System.out.println("Loi: " +ex.toString());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Loi: " +ex.toString());
            System.out.println("Ghi file sanpham that bai");
        }
    }
}
