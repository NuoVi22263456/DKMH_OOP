/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dkmh;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class QuanLyHocKy {

    private ArrayList<HocKy> dsHK = new ArrayList<>();

    public ArrayList<HocKy> getDsHK() {
        return dsHK;
    }

    public void docTapTin(String duongDan) throws FileNotFoundException, ParseException {
        File f = new File(duongDan);
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                String hocKy = sc.nextLine();
                String monCanDK = sc.nextLine();
                HocKy hk = new HocKy(hocKy, monCanDK);
                dsHK.add(hk);
            }
        }
    }

    public void hienThi() {
        for (HocKy n : dsHK) {
            n.hienThi();
        }
    }

    public HocKy timKiem(String kw) {
        for (HocKy s : dsHK) {
            if (s.getHocKy().contains(kw) == true) {
                return s;
            }
        }
        return null;
    }

    public void setDsHK(ArrayList<HocKy> dsHK) {
        this.dsHK = dsHK;
    }

}
