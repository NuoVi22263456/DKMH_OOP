/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dkmh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
public class DanhSachDangKy {

    private ArrayList<DangKy> dsDK = new ArrayList<>();

    public void themDangKy(DangKy dangKy) {
        dsDK.add(dangKy);
    }

    public void docTapTin(String duongDan) throws FileNotFoundException, ParseException {
        File f = new File(duongDan);
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                String maSV = sc.nextLine();
                String hoTen = sc.nextLine();
                String monDaDK = sc.nextLine();

                DangKy dk = new DangKy(maSV, hoTen, monDaDK);
                dsDK.add(dk);
            }
        }
    }

    public void ghiDuLieuVaoTep(String a, String b, String c) throws IOException {
        File f = new File("src/main/resources/DanhSachDangKy.txt");
        FileWriter w = new FileWriter(f, true);
        try (PrintWriter writer = new PrintWriter(w)) {
            // Lặp qua danh sách và ghi từng đối tượng DangKy vào tệp
            DangKy dangKy = new DangKy(a, b, c);
            writer.println(dangKy.getMaSV());
            writer.println(dangKy.getTenSV());
            writer.println(dangKy.getMonDaDK());

            System.out.println("Đã ghi dữ liệu vào tệp thành công.");
        }
    }

    public void thayThe(String maSV, String monThayThe) throws IOException {
        String duongDan = "src/main/resources/DanhSachDangKy.txt";
        List<String> dong = Files.readAllLines(Paths.get(duongDan));
        for (int i = 0; i < dong.size(); i++) {
            if (dong.get(i).equals(maSV)) {
                dong.set((i + 2), monThayThe);
                break;
            }
        }
        Files.write(Paths.get(duongDan), dong);
    }

    public void themMH(String maSV, String monThem) throws IOException {
        String duongDan = "src/main/resources/DanhSachDangKy.txt";
        List<String> dong = Files.readAllLines(Paths.get(duongDan));
        int viTri = dong.indexOf(maSV);
        if (viTri != -1) {
            String line = dong.get(viTri + 2);
            line = line + ", " + monThem;
            dong.set(viTri + 2, line);
        }
        Files.write(Paths.get(duongDan), dong);
    }

    public void xoaDK(String maSV) throws IOException {
        String duongDan = "src/main/resources/DanhSachDangKy.txt";
        List<String> dong = Files.readAllLines(Paths.get(duongDan));
        int viTri = dong.indexOf(maSV);
        if (viTri != -1) {
            for (int f = viTri; f <= viTri + 2; f++) {
                String line = dong.get(f);
                line = "";
                dong.set(f, line);
            }
        }
        Files.write(Paths.get(duongDan), dong);
    }

    public DangKy timKiem(String kw) {
        for (DangKy s : dsDK) {
            if (s.getMaSV().contains(kw) == true) {
                return s;
            }
        }
        return null;
    }

    public void hienThi() {
        for (DangKy n : dsDK) {
            n.hienThi();
        }
    }

    public ArrayList<DangKy> getDsDK() {
        return dsDK;
    }

    public void setDsDK(ArrayList<DangKy> dsDK) {
        this.dsDK = dsDK;
    }

}
