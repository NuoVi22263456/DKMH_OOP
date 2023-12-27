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
public class DangKy {

    private String maSV;
    private String tenSV;
    private String monDaDK;

    public DangKy(String maSV, String tenSV, String monDaDK) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.monDaDK = monDaDK;
    }

    public void nhapDK() throws ParseException {
        System.out.print("Ma sinh vien:  ");
        this.maSV = Ghi.sc.nextLine();
        System.out.print("Ten sinh vien:  ");
        this.tenSV = Ghi.sc.nextLine();
        System.out.print("Mon dang ky:  ");
        this.monDaDK = Ghi.sc.nextLine();
    }

    public void hienThi() {
        System.out.printf("Ma sinh vien: %s\n", this.maSV);
        System.out.printf("Ten sinh vien: %s\n", this.tenSV);
        System.out.printf("Mon da dang ky: %s\n", this.monDaDK);
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMsSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getMonDaDK() {
        return monDaDK;
    }

    public void setMonDaDK(String monDaDK) {
        this.monDaDK = monDaDK;
    }

}
