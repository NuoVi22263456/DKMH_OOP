/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dkmh;

import java.text.ParseException;

/**
 *
 * @author MSI
 */
public class ChinhQuy extends SinhVien {

    private String hinhThucHoc;

    public ChinhQuy(String maSV, String hoTen, String ngaySinh, String gioiTinh, String maLop, String hinhThucHoc) throws ParseException {
        super(maSV, hoTen, ngaySinh, gioiTinh, maLop);
        this.hinhThucHoc = hinhThucHoc;
    }

    public String getHinhThucHoc() {
        return hinhThucHoc;
    }

    public void setHinhThucHoc(String hinhThucHoc) {
        this.hinhThucHoc = hinhThucHoc;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Hinh thuc hoc: %s\n", hinhThucHoc);
    }

}
