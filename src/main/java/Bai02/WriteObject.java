/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai02;
import java.io.*;
import java.util.ArrayList;
import Bai01.SanPham;
/**
 *
 * @author nguye
 */
public class WriteObject {
    public static void main(String[] args) {
        ArrayList<SanPham> dsSanPham = new ArrayList<>();
        
        dsSanPham.add(new SanPham("SP01", "Gao", 45000));
        dsSanPham.add(new SanPham("SP02", "Lua Mi", 34000));
        dsSanPham.add(new SanPham("SP03", "Tinh Dau", 23000));
        try {
            FileOutputStream fos = new FileOutputStream("sanpham.bin");
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(dsSanPham);
            }
            fos.close();
            System.out.println("Da ghi xong");
        } catch (IOException e) {
            System.out.println("Loi: " +e.toString());
            System.out.println("Ghi file that bai");
        }
        
    }
}
