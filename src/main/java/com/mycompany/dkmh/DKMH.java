/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dkmh;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class DKMH {

    public static void main(String[] args) throws FileNotFoundException, ParseException, IOException {
        Scanner input = new Scanner(System.in);
        DanhSachDangKy dk = new DanhSachDangKy();
        boolean cont = true;
        do {
            System.out.println("======================================================");
            System.out.println("BANG CHON");
            System.out.println("1. Tim kiem thong tin Nhan Vien");
            System.out.println("2. In danh sach Sinh Vien");
            System.out.println("3. In danh sach Mon Hoc");
            System.out.println("4. Tim kiem sinh vien theo ma sinh vien");
            System.out.println("5. Dang ky mon hoc");
            System.out.println("6. Kiem tra sinh vien dã dang ky hay chua");
            System.out.println("7. Chinh sua dang ky mon hoc");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            int chon = input.nextInt();
            switch (chon) {
                case 1 -> {
                    QuanLyNhanVien dsNhanVien = new QuanLyNhanVien();
                    String duongDan = "src/main/resources/NhanVien.txt";
                    System.out.print("Nhap ma nhan vien: ");
                    String s = Ghi.sc.nextLine();
                    dsNhanVien.docTapTin(duongDan);
                    if (dsNhanVien.timKiem(s) != null) {
                        String vaiTro = s.substring(0, 2);
                        switch (vaiTro) {
                            case "24" -> {
                                System.out.println("Nhan vien co vai tro la Chuyen Vien.");
                                System.out.println("Thong tin chuyen vien:");
                                dsNhanVien.luongChuyenVien(s);
                            }
                            case "25" -> {
                                System.out.println("Nhan vien co vai tro la Giang Vien.");
                                System.out.println("Thong tin giang vien:");
                                dsNhanVien.luongGiangVien(s);
                            }
                            default ->
                                throw new AssertionError();
                        }
                    } else {

                    }
                }
                case 2 -> {
                    System.out.println("Danh sach Sinh Vien");
                    QuanLySinhVien dsSinhVien = new QuanLySinhVien();
                    System.out.println("Danh sach doc file");
                    String duongDan = "src/main/resources/SinhVien.txt";
                    dsSinhVien.docTapTin(duongDan);
                    dsSinhVien.hienThi();
                }
                case 3 -> {
                    System.out.println("Danh sach MonHoc");
                    QuanLyMonHoc dsMH = new QuanLyMonHoc();
                    String duongDan = "src/main/resources/MonHoc.txt";
                    dsMH.docTapTinMonHoc(duongDan);
                    dsMH.hienThi();

                }
                case 4 -> {
                    System.out.print("Nhap ma so sinh vien ban muon tim: ");
                    String s = Ghi.sc.nextLine();
                    QuanLySinhVien dsSinhVien = new QuanLySinhVien();
                    String duongDan = "src/main/resources/SinhVien.txt";
                    dsSinhVien.docTapTin(duongDan);
                    if (dsSinhVien.timKiem(s) != null) {
                        String hinhThucDaoTao = s.substring(0, 2);
                        switch (hinhThucDaoTao) {
                            case "10" -> {
                                System.out.println("Sinh Vien Dao Tao Chinh Quy.");
                                System.out.println("Thong tin sinh vien:");
                                dsSinhVien.docChinhQuy(s);
                            }
                            case "11" -> {
                                System.out.println("Sinh Vien Dao Tao Tu Xa.");
                                System.out.println("Thong tin sinh vien:");
                                dsSinhVien.docDTTX(s);
                            }
                            default ->
                                throw new AssertionError();
                        }
                    } else {
                        System.err.println("Khong tim thay sinh vien.");
                    }
                }
                case 5 -> {
                    System.out.print("Nhap ma so sinh vien ban muon dang ky: ");
                    String s = Ghi.sc.nextLine();
                    QuanLySinhVien dsSinhVien = new QuanLySinhVien();
                    String duongDan1 = "src/main/resources/SinhVien.txt";
                    dsSinhVien.docTapTin(duongDan1);
                    String duongDan2 = "src/main/resources/DanhSachDangKy.txt";
                    dk.docTapTin(duongDan2);
                    if (dsSinhVien.timKiem(s) != null) {
                        dsSinhVien.timKiem(s).hienThi();
                        if (dk.timKiem(s) == null) {
                            System.out.print("Nhap hoc ky ban muon dang ky: ");
                            String hk = Ghi.sc.nextLine();
                            String nganh = s.substring(4, 6);

                            if (null != nganh) {
                                switch (nganh) {
                                    case "01" -> {
                                        System.out.println("Nganh Khoa Hoc May Tinh Hoc Ky " + hk + " can dang ky nhung mon sau:");
                                        QuanLyHocKy dsHK = new QuanLyHocKy();
                                        String duongDanCS = "src/main/resources/CS.txt";
                                        dsHK.docTapTin(duongDanCS);
                                        if (dsHK.timKiem(hk) != null) {
                                            dsHK.timKiem(hk).hienThi();
                                            Scanner scanner = new Scanner(System.in);
                                            System.out.print("Nhap ma sinh vien: ");
                                            String maSV = scanner.nextLine();
                                            System.out.print("Nhap ten sinh vien: ");
                                            String tenSV = scanner.nextLine();
                                            System.out.print("Nhap mon dang ky: ");
                                            String monDangKy = scanner.nextLine();
                                            DangKy dangKy = new DangKy(maSV, tenSV, monDangKy);
                                            dk.themDangKy(dangKy);
                                            dk.ghiDuLieuVaoTep(maSV, tenSV, monDangKy);
                                        } else {
                                            System.err.println("Khong tim hoc ky.");
                                        }
                                    }
                                    case "02" -> {
                                        System.out.println("Nganh Cong Nghe Thong Tin Hoc Ky " + hk + " can dang ky nhung mon sau:");
                                        QuanLyHocKy dsHK = new QuanLyHocKy();
                                        String duongDanIT = "src/main/resources/IT.txt";
                                        dsHK.docTapTin(duongDanIT);
                                        if (dsHK.timKiem(hk) != null) {
                                            dsHK.timKiem(hk).hienThi();
                                            Scanner scanner = new Scanner(System.in);
                                            System.out.print("Nhap ma sinh vien: ");
                                            String maSV = scanner.nextLine();
                                            System.out.print("Nhap ten sinh vien: ");
                                            String tenSV = scanner.nextLine();
                                            System.out.print("Nhap mon dang ky: ");
                                            String monDangKy = scanner.nextLine();
                                            DangKy dangKy = new DangKy(maSV, tenSV, monDangKy);
                                            dk.themDangKy(dangKy);
                                            dk.ghiDuLieuVaoTep(maSV, tenSV, monDangKy);
                                        } else {
                                            System.err.println("Khong tim hoc ky.");
                                        }
                                    }
                                    case "03" -> {
                                        System.out.println("Nganh He Thong Thong Tin Quan Ly Hoc Ky " + hk + " can dang ky nhung mon sau:");
                                        QuanLyHocKy dsHK = new QuanLyHocKy();
                                        String duongDanIM = "src/main/resources/IM.txt";
                                        dsHK.docTapTin(duongDanIM);
                                        if (dsHK.timKiem(hk) != null) {
                                            dsHK.timKiem(hk).hienThi();
                                            System.out.print("Nhap ma sinh vien: ");
                                            String maSV = Ghi.sc.nextLine();
                                            System.out.print("Nhap ten sinh vien: ");
                                            String tenSV = Ghi.sc.nextLine();
                                            System.out.print("Nhap mon dang ky: ");
                                            String monDangKy = Ghi.sc.nextLine();
                                            DangKy dangKy = new DangKy(maSV, tenSV, monDangKy);
                                            dk.themDangKy(dangKy);
                                            dk.ghiDuLieuVaoTep(maSV, tenSV, monDangKy);
                                        } else {
                                            System.err.println("Khong tim hoc ky.");
                                        }

                                    }
                                    default -> {
                                    }
                                }
                            }
                        } else {
                            System.err.println("Khong tim thay sinh vien.");
                        }
                    } else {
                        System.err.println("Sinh Vien da dang ky!!!");
                    }
                }
                case 6 -> {
                    System.out.print("Nhap ma so sinh vien ban muon kiem tra: ");
                    String s = Ghi.sc.nextLine();
                    DanhSachDangKy dsDK = new DanhSachDangKy();
                    String duongDan = "src/main/resources/DanhSachDangKy.txt";
                    dsDK.docTapTin(duongDan);
                    if (dsDK.timKiem(s) != null) {
                        dsDK.timKiem(s).hienThi();
                    } else {
                        System.err.println("Khong tim thay sinh vien.");
                    }
                }
                case 7 -> {
                    System.out.print("Nhap ma so sinh vien ban muon chinh sua: ");
                    String s = Ghi.sc.nextLine();
                    DanhSachDangKy dsDK = new DanhSachDangKy();
                    String duongDan = "src/main/resources/DanhSachDangKy.txt";
                    dsDK.docTapTin(duongDan);
                    if (dsDK.timKiem(s) != null) {
                        System.out.println("1. Chinh sua dang ky.");
                        System.out.println("2. Them mon hoc.");
                        System.out.println("3. Xoa dang ky.");
                        System.out.print("Chon nghiep vu: ");
                        int nghiepVu = input.nextInt();
                        switch (nghiepVu) {
                            case 1 -> {
                                dsDK.timKiem(s).hienThi();
                                System.out.print("Nhap mon ma ban muon dang ky lai: ");
                                String monDangKy = Ghi.sc.nextLine();
                                dsDK.thayThe(s, monDangKy);
                            }
                            case 2 -> {
                                dsDK.timKiem(s).hienThi();
                                System.out.print("Nhap mon ma ban muon dang ky them: ");
                                String monDangKyThem = Ghi.sc.nextLine();
                                dsDK.themMH(s, monDangKyThem);
                            }
                            case 3 -> {
                                dsDK.timKiem(s).hienThi();
                                System.out.print("Ban chac chan muon xoa dang ky chu [1:Co - 0:Khong]: ");
                                int quyetDinh = input.nextInt();
                                switch (quyetDinh) {
                                    case 1 -> {
                                        dk.xoaDK(s);
                                    }
                                    default ->
                                        throw new AssertionError();
                                }

                            }
                            default ->
                                throw new AssertionError();
                        }
                    } else {
                        System.err.println("Sinh Vien chua dang ky!!!");
                    }

                }

                default -> {
                    System.out.println("Tam biet!!!");
                    cont = false;
                }
            }
        } while (cont);
    }

}
