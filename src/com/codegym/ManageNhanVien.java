package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManageNhanVien {
    List<NhanVien> nhanVien = new ArrayList<NhanVien>();
    static Scanner scanner = new Scanner(System.in);
    static SortNhanVien sortNhanVien = new SortNhanVien();


    public void themNhanVien(String loaiNhanVien) {
        NhanVien nhanViens = create(loaiNhanVien);
        nhanVien.add(nhanViens);
    }



    public NhanVien create(String loaiNhanVien) {
        System.out.println("Tên nhân viên:");
        String tenNhanVien = scanner.nextLine();
        System.out.println("Tuổi nhân viên:");
        int tuoiNhanVien = Integer.parseInt(scanner.nextLine());
        System.out.println("Giới tính nhân viên:");
        String gioiTinh = scanner.nextLine();
        System.out.println("Số điện thoại nhân viên:");
        String soDienThoai = scanner.nextLine();
        System.out.println("Email nhân viên:");
        String email = scanner.nextLine();
        System.out.println("Lương nhân viên:");
        int luong = Integer.parseInt(scanner.nextLine());

        if (loaiNhanVien == "NhanVienFullTime") {
            System.out.println("Ngành:");
            String nganh = scanner.nextLine();
            return new NhanVienFullTime(tenNhanVien, tuoiNhanVien, gioiTinh, soDienThoai, email, luong, nganh);
        }
        if (loaiNhanVien == "NhanVienPartTime") {
            System.out.println("Ngành:");
            String nganh = scanner.nextLine();
            System.out.println("Giờ:");
            int time = Integer.parseInt(scanner.nextLine());
            return new NhanVienPartTime(tenNhanVien, tuoiNhanVien, gioiTinh, soDienThoai, email, luong, nganh, time);
        }
        if (loaiNhanVien == "NhanVienTuyenSinh") {
            System.out.println("Số tuyển sinh:");
            int soTuyenSinh = Integer.parseInt(scanner.nextLine());
            System.out.println("Doanh Thu:");
            int doanhThu = Integer.parseInt(scanner.nextLine());
            return new NhanVienTuyenSinh(tenNhanVien, tuoiNhanVien, gioiTinh, soDienThoai, email, luong, soTuyenSinh, doanhThu);
        }
        return null;
    }

    public void show() {
        for (NhanVien nv : nhanVien) {
            System.out.println(nv);
        }
    }

    public void doanhThuNhanVien(String loaiNhanVien) {
        String index = scanner.nextLine();
        for(NhanVien nv:nhanVien){
            if(nv.getTenNhanVien().equals(index)){
                if(loaiNhanVien == "NhanVienFullTime"){
                    System.out.println("Doanh thu của nhân viên: "+nv.getTenNhanVien()+" là "+ nv.doanhThu()+" VND");
                }
                if(loaiNhanVien == "NhanVienPartTime"){
                    System.out.println("Doanh thu của nhân viên: "+nv.getTenNhanVien()+" là "+ nv.doanhThu()+ " VND");
                }
                if(loaiNhanVien == "NhanVienTuyenSinh"){
                    System.out.println("Doanh thu của nhân viên: "+nv.getTenNhanVien()+" là "+ nv.doanhThu() +" VND");
                }
            }
        }


    }
    public void xoaNhanVien(){
        String tenNV = scanner.nextLine();
        nhanVien.removeIf(x -> x.getTenNhanVien().equals(tenNV));
    }
    public void sortNhanVien(){
        Collections.sort(nhanVien,sortNhanVien);
    }

}