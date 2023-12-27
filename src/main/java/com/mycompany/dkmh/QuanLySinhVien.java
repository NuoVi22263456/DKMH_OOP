/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dkmh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MSI
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

    public void docChinhQuy(String maSV) throws IOException, ParseException {
        String duongDan = "src/main/resources/SinhVien.txt";
        List<String> dong = Files.readAllLines(Paths.get(duongDan));
        int viTri = dong.indexOf(maSV);
        if (viTri != -1) {
            String tenSV = dong.get(viTri + 1);
            String ngaySinh = dong.get(viTri + 2);
            String gioiTinh = dong.get(viTri + 3);
            String maLop = dong.get(viTri + 4);
            String hinhThuc = "Hoc tai co so quy dinh.";
            SinhVien sv = new ChinhQuy(maSV, tenSV, ngaySinh, gioiTinh, maLop, hinhThuc);
            sv.hienThi();
        }
    }

    public void docDTTX(String maSV) throws IOException, ParseException {
        String duongDan = "src/main/resources/SinhVien.txt";
        List<String> dong = Files.readAllLines(Paths.get(duongDan));
        int viTri = dong.indexOf(maSV);
        if (viTri != -1) {
            String tenSV = dong.get(viTri + 1);
            String ngaySinh = dong.get(viTri + 2);
            String gioiTinh = dong.get(viTri + 3);
            String maLop = dong.get(viTri + 4);
            String hinhThuc = "Hoc online co huong dan";
            String thoiGian = "2-3 nam";
            SinhVien sv = new DaoTaoTuXa(maSV, tenSV, ngaySinh, gioiTinh, maLop, hinhThuc, thoiGian);
            sv.hienThi();
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
