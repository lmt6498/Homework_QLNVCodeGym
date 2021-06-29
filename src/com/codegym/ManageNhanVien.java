package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManageNhanVien {
    List<NhanVien> nhanVien = ReadWriteFileBinary.readDataFromFile("E:\\JavaProject\\Homework_QLNV\\src\\list.txt");
    static Scanner scanner = new Scanner(System.in);
    static SortNhanVien sortNhanVien = new SortNhanVien();


    public void themNhanVien(String loaiNhanVien) {
        nhanVien.add(create(loaiNhanVien));
        ReadWriteFileBinary.writeToFile("src/list.txt",nhanVien);
    }



    public NhanVien create(String loaiNhanVien) {
        String tenNhanVien = getTenNhanVien();
        int tuoiNhanVien = getTuoiNhanVien();
        String gioiTinh = getGioiTinh();
        String soDienThoai = getSoDienThoai();
        String email = getEmail();
        int luong = getLuong();

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
    public void searchByName() {
        System.out.println("Nhập tên nhân viên cần sửa: ");
        String tenNV = getTenNhanVien();
        for (NhanVien s : nhanVien) {
            if (s instanceof NhanVienDaoTao) {
                if (((NhanVienDaoTao) s).getTenNhanVien().equals(tenNV)) {
                    s.display();
                }
            } else if (s instanceof NhanVienFullTime) {
                if (((NhanVienFullTime) s).getTenNhanVien().equals(tenNV)) {
                    s.display();
                }
            }else if (s instanceof NhanVienPartTime) {
                if (((NhanVienPartTime) s).getTenNhanVien().equals(tenNV)) {
                    s.display();
                }
            }else if (s instanceof NhanVienTuyenSinh) {
                if (((NhanVienTuyenSinh) s).getTenNhanVien().equals(tenNV)) {
                    s.display();
                }
            }
        }
    }


    public void show() {
        for (NhanVien nv : nhanVien) {
            System.out.println(nv);
        }
    }

    public void doanhThuNhanVien(String loaiNhanVien) {
        String index = scanner.nextLine();
        for (NhanVien nv : nhanVien) {
            if (nv.getTenNhanVien().equals(index)) {
                if (loaiNhanVien == "NhanVienFullTime") {
                    System.out.println("Doanh thu của nhân viên: " + nv.getTenNhanVien() + " là " + nv.doanhThu() + " VND");
                }
                if (loaiNhanVien == "NhanVienPartTime") {
                    System.out.println("Doanh thu của nhân viên: " + nv.getTenNhanVien() + " là " + nv.doanhThu() + " VND");
                }
                if (loaiNhanVien == "NhanVienTuyenSinh") {
                    System.out.println("Doanh thu của nhân viên: " + nv.getTenNhanVien() + " là " + nv.doanhThu() + " VND");
                }
            }
        }
    }
    public void edit (String loaiNhanVien){
        System.out.println("Nhap ten nhan vien can sua");
        String name = getTenNhanVien();
        SortNhanVien nameSorter = new SortNhanVien();
        int index = Collections.binarySearch(nhanVien, new NhanVien(name, 0, null, null, null, 0), nameSorter);
        nhanVien.set(index, create(loaiNhanVien));
        ReadWriteFileBinary.writeToFile("src/list.txt", nhanVien);
    }
    public void xoaNhanVien(){
        String tenNV = getTenNhanVien();
        nhanVien.removeIf(x -> x.getTenNhanVien().equals(tenNV));
        ReadWriteFileBinary.writeToFile("src/list.txt",nhanVien);

    }
    public void sortNhanVien(){
        Collections.sort(nhanVien,sortNhanVien);
    }
    private int getLuong() {
        System.out.println("Lương nhân viên:");
        return Integer.parseInt(scanner.nextLine());
    }

    private String getEmail() {
        System.out.println("Email nhân viên:");
        return scanner.nextLine();
    }

    private String getSoDienThoai() {
        System.out.println("Số điện thoại nhân viên:");
        return scanner.nextLine();
    }

    private String getGioiTinh() {
        System.out.println("Giới tính nhân viên:");
        return scanner.nextLine();
    }

    private int getTuoiNhanVien() {
        System.out.println("Tuổi nhân viên:");
        return Integer.parseInt(scanner.nextLine());
    }

    private String getTenNhanVien() {
        System.out.println("Tên nhân viên:");
        return scanner.nextLine();
    }
}