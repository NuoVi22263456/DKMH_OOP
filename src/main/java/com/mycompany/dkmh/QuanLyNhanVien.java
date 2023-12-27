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
public class QuanLyNhanVien {

    private ArrayList<NhanVien> dsNhanVien = new ArrayList<>();

    public void them(NhanVien nv) {
        dsNhanVien.add(nv);
    }

    public void hienThi() {
        for (NhanVien n : dsNhanVien) {
            n.hienThi();
        }
    }

    public void docTapTin(String duongDan) throws FileNotFoundException, ParseException {
        File f = new File(duongDan);
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                String maID = sc.nextLine();
                String tenNhanVien = sc.nextLine();
                String ngaySinh = sc.nextLine();
                String gioiTinh = sc.nextLine();

                NhanVien nv = new NhanVien(maID, tenNhanVien, ngaySinh, gioiTinh) {
                    @Override
                    public double layHeSo() {
                        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    }

                };
                dsNhanVien.add(nv);
            }
        }
    }

    public void luongGiangVien(String maNV) throws IOException, ParseException {
        String duongDan = "src/main/resources/NhanVien.txt";
        List<String> dong = Files.readAllLines(Paths.get(duongDan));
        int viTri = dong.indexOf(maNV);
        if (viTri != -1) {

            String maID = dong.get(viTri);
            String tenNV = dong.get(viTri + 1);
            String ngaySinh = dong.get(viTri + 2);
            String gioiTinh = dong.get(viTri + 3);

            NhanVien nv = new GiangVien(maID, tenNV, ngaySinh, gioiTinh);
            nv.hienThi();
            System.out.printf("Luong co ban: %.1f\n", nv.tinhLuong());

        }

    }

    public void luongChuyenVien(String maNV) throws IOException, ParseException {
        String duongDan = "src/main/resources/NhanVien.txt";
        List<String> dong = Files.readAllLines(Paths.get(duongDan));
        int viTri = dong.indexOf(maNV);
        if (viTri != -1) {

            String maID = dong.get(viTri);
            String tenNV = dong.get(viTri + 1);
            String ngaySinh = dong.get(viTri + 2);
            String gioiTinh = dong.get(viTri + 3);

            NhanVien nv = new ChuyenVien(maID, tenNV, ngaySinh, gioiTinh);
            nv.hienThi();
            nv.layHeSo();
            System.out.printf("Luong co ban: %.1f\n", nv.tinhLuong());

        }

    }

    public NhanVien timKiem(String kw) {
        for (NhanVien s : dsNhanVien) {
            if (s.getMaID().contains(kw) == true) {
                return s;
            }
        }
        return null;
    }

    public ArrayList<NhanVien> getDsNhanVien() {
        return dsNhanVien;
    }

    public void setDsNhanVien(ArrayList<NhanVien> dsNhanVien) {
        this.dsNhanVien = dsNhanVien;
    }

}
