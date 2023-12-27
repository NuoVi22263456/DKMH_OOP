/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dkmh;

/**
 *
 * @author MSI
 */
public class HocKy {

    private String hocKy;
    private String monCanDK;

    public HocKy(String hocKy, String monCanDK) {
        this.hocKy = hocKy;
        this.monCanDK = monCanDK;
    }

    public void hienThi() {
        System.out.printf("Hoc ky: %s\n", this.hocKy);
        System.out.printf("Mon hoc can dang ky: %s\n", this.monCanDK);
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    public String getMonCanDK() {
        return monCanDK;
    }

    public void setMonCanDK(String monCanDK) {
        this.monCanDK = monCanDK;
    }

}
