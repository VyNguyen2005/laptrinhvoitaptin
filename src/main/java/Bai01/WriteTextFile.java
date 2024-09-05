/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai01;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class WriteTextFile {
    public static ArrayList<SanPham> dsSanPham = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Nhap ma so san pham thu " +(i + 1) + ": ");
            String maso = sc2.nextLine();
            System.out.print("Nhap ten san pham thu " +(i + 1) + ": ");
            String ten = sc2.nextLine();
            System.out.print("Nhap gia san pham thu " +(i + 1) + ": ");
            float gia = sc1.nextFloat();
            
            SanPham sp = new SanPham(maso, ten, gia);
            dsSanPham.add(sp);
        }

        try {
            FileWriter fw = new FileWriter("sanpham.txt");
            for (SanPham sanPham : dsSanPham) {
                fw.write(sanPham.getMaso() + ";" + sanPham.getTen() + ";" + sanPham.getGia() + "\n");
            }
            fw.close();
            System.out.println("Da ghi xong");
        } catch (Exception e) {
            System.out.println("Loi: " +e.toString());
            System.out.println("Ghi file sanpham that bai");
        }
    }
}
