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
public class DaoTaoTuXa extends SinhVien {

    private String hinhThucHoc;
    private String thoiGianHoc;

    public DaoTaoTuXa(String maSV, String hoTen, String ngaySinh, String gioiTinh, String maLop, String hinhThucHoc, String thoiGianHoc) throws ParseException {
        super(maSV, hoTen, ngaySinh, gioiTinh, maLop);
        this.hinhThucHoc = hinhThucHoc;
        this.thoiGianHoc = thoiGianHoc;
    }

    public String getHinhThucHoc() {
        return hinhThucHoc;
    }

    public void setHinhThucHoc(String hinhThucHoc) {
        this.hinhThucHoc = hinhThucHoc;
    }

    public String getThoiGianHoc() {
        return thoiGianHoc;
    }

    public void setThoiGianHoc(String thoiGianHoc) {
        this.thoiGianHoc = thoiGianHoc;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Hinh thuc hoc: %s\n", hinhThucHoc);
        System.out.printf("Thoi gian hoc: %s\n", thoiGianHoc);
    }

}
