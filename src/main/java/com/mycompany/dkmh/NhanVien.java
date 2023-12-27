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
 * @author MSI
 */
public abstract class NhanVien {

    private static final SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
    private String maID;
    private String tenNhanVien;
    private Date ngaySinh;
    private String gioiTinh;

    public NhanVien(String maID, String tenNhanVien, String ngaySinh, String gioiTinh) throws ParseException {

        this.ngaySinh = f.parse(ngaySinh);
        this.maID = maID;
        this.tenNhanVien = tenNhanVien;
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return "Ma Nhan Vien";
    }

    public void hienThi() {
        System.out.printf(getTen() + ": %s\n", this.maID);
        System.out.printf("Ho Ten: %s\n", this.tenNhanVien);
        System.out.printf("Ngay sinh: %s\n", f.format(ngaySinh));
        System.out.printf("Gioi Tinh: %s\n", this.gioiTinh);
        System.out.println("-----------------------------------");
    }

    public abstract double layHeSo();

    public double tinhLuong() {
        return layHeSo() * 6500000;
    }

    public String getMaID() {
        return maID;
    }

    public void setMaID(String maID) {
        this.maID = maID;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
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
}
