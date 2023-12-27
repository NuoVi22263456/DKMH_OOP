/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dkmh;

/**
 *
 * @author MSI
 */
public class MonHoc {

    private String maMon;
    private String tenMon;
    private String tinChi;

    public MonHoc(String maMon, String tenMon, String tinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.tinChi = tinChi;
    }

    public void hienThi() {
        System.out.printf("Ma mon hoc: %s\n", this.maMon);
        System.out.printf("Ten mon hoc: %s\n", this.tenMon);
        System.out.printf("So tin chi: %s\n", this.tinChi);
        System.out.println("-----------------------------------");
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getTinChi() {
        return tinChi;
    }

    public void setTinChi(String tinChi) {
        this.tinChi = tinChi;
    }

}
