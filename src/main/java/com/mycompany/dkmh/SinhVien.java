/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dkmh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 84334
 */
public class SinhVien {

    private static final SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
    private String maSV;
    private String hoTen;
    private Date ngaySinh;
    private String gioiTinh;
    private String maLop;

    public SinhVien(String maSV, String hoTen, String ngaySinh, String gioiTinh, String maLop) throws ParseException {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = f.parse(ngaySinh);
        this.gioiTinh = gioiTinh;
        this.maLop = maLop;
    }

    public String getTen() {
        return "Ma Sinh Vien";
    }

    public void hienThi() {
        System.out.printf(getTen() + ": %s\n", this.maSV);
        System.out.printf("Ho Ten: %s\n", this.hoTen);
        System.out.printf("Ngay sinh: %s\n", f.format(ngaySinh));
        System.out.printf("Gioi Tinh: %s\n", this.gioiTinh);
        System.out.printf("Lop: %s\n", this.maLop);
        System.out.println("-----------------------------------");
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String HoTen) {
        this.hoTen = HoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

}
