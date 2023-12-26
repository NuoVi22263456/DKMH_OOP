/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dkmh;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 84334
 */
public class QuanLySinhVien {

    private ArrayList<SinhVien> dsSinhVien;

    public QuanLySinhVien() {
        this.dsSinhVien = new ArrayList<>();
    }

    public void them(SinhVien sv) {
        dsSinhVien.add(sv);
    }

    public void hienThi() {
        for (SinhVien n : dsSinhVien) {
            n.hienThi();
        }
    }

    public void docTapTin(String duongDan) throws FileNotFoundException, ParseException {
        File f = new File(duongDan);
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                String maSV = sc.nextLine();
                String hoTen = sc.nextLine();
                String ngaySinh = sc.nextLine();
                String gioiTinh = sc.nextLine();
                String maLop = sc.nextLine();

                SinhVien sv = new SinhVien(maSV, hoTen, ngaySinh, gioiTinh, maLop);
                dsSinhVien.add(sv);
            }
        }
    }


    public SinhVien timKiem(String kw) {
        for (SinhVien s : dsSinhVien) {
            if (s.getMaSV().contains(kw) == true) {
                return s;
            }
        }
        return null;
    }

    public ArrayList<SinhVien> getDsSinhVien() {
        return dsSinhVien;
    }

    public void setDsSinhVien(ArrayList<SinhVien> dsSinhVien) {
        this.dsSinhVien = dsSinhVien;
    }
}
