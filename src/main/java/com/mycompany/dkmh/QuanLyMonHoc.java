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
public class QuanLyMonHoc {

    private ArrayList<MonHoc> dsMH = new ArrayList<>();

    public void them(MonHoc mh) {
        dsMH.add(mh);
    }

    public void docTapTinMonHoc(String duongDan) throws FileNotFoundException, ParseException {
        File f = new File(duongDan);
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                String maMon = sc.nextLine();
                String tenMon = sc.nextLine();
                String tinChi = sc.nextLine();
                MonHoc mh = new MonHoc(maMon, tenMon, tinChi);
                dsMH.add(mh);
            }
        }
    }

    public void hienThi() {
        for (MonHoc n : dsMH) {
            n.hienThi();
        }
    }

    public ArrayList<MonHoc> getDsMH() {
        return dsMH;
    }

    public void setDsMH(ArrayList<MonHoc> dsMH) {
        this.dsMH = dsMH;
    }
}
