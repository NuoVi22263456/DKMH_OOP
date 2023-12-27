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
public class ChuyenVien extends NhanVien {

    public ChuyenVien(String maID, String tenNhanVien, String ngaySinh, String gioiTinh) throws ParseException {
        super(maID, tenNhanVien, ngaySinh, gioiTinh);
    }

    @Override
    public double layHeSo() {
        return 1.45;
    }

}
