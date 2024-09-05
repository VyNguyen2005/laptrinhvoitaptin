/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai02;
import Bai01.SanPham;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author nguye
 */
public class ReadObject {
    public static void main(String[] args) {
        ArrayList<SanPham> dsSanPham = null;
        try {
            FileInputStream fis = new FileInputStream("sanpham.bin");
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                dsSanPham = (ArrayList<SanPham>) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Loi: " +e.toString());
        }
        if (dsSanPham != null) {
            for (SanPham sanPham : dsSanPham) {
                System.out.println(sanPham);
            }
        } else {
            System.out.println("Danh sach san pham la null hoac khong the doc tu tep.");
        }
    }
}
