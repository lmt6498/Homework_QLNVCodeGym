package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         ManageNhanVien manageNhanVien = new ManageNhanVien();
         Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("QUAN LI NHAN VIEN CODEGYMM");
                System.out.println("1. Thêm nhân viên");
                System.out.println("2. Sửa nhân viên");
                System.out.println("3. Đuổi nhân viên");
                System.out.println("4. Hiển thị lương nhân viên");
                System.out.println("5. Tìm kiếm nhân viên theo tên");
                System.out.println("6. Sắp xếp theo tên nv.");
                System.out.println("7. Show danh sách");
                System.out.println("8. Exit");
                System.out.println("Enter choise: ");
                int choise = Integer.parseInt(scanner.nextLine());
                switch (choise) {
                    case 1:
                        System.out.println("THÊM NHÂN VIÊN");
                        System.out.println("1. Nhân viên đào tạo");
                        System.out.println("2. Nhân viên tuyển sinh");
                        int select1 = Integer.parseInt(scanner.nextLine());
                        switch (select1) {
                            case 1: {
                                System.out.println("NHÂN VIÊN ĐÀO TẠO");
                                System.out.println("1. Nhân viên Full time");
                                System.out.println("2. Nhân viên Part time");
                                int select2 = Integer.parseInt(scanner.nextLine());
                                switch (select2) {
                                    case 1:
                                        manageNhanVien.themNhanVien("NhanVienFullTime");
                                        break;
                                    case 2:
                                        manageNhanVien.themNhanVien("NhanVienPartTime");
                                        break;
                                }
                            }
                            break;
                            case 2:
                                manageNhanVien.themNhanVien("NhanVienTuyenSinh");
                                break;
                        }
                    break;
                    case 2:
                        System.out.println("Nhập loại nhân viên cần sửa: ");
                        String loaiNV = scanner.nextLine();
                        manageNhanVien.edit(loaiNV);
                    break;
                    case 3:
                        System.out.println("Nhập tên nhân viên cần đuổi");
                        manageNhanVien.xoaNhanVien();
                        break;

                    case 4:
                        System.out.println("CHỌN LOẠI NHÂN VIÊN CẦN TÍNH:");
                        System.out.println("    1. Đào tạo");
                        System.out.println("    2. Tuyển sinh");
                        int select3 = Integer.parseInt(scanner.nextLine());
                        switch (select3) {
                            case 1:
                                System.out.println("          LOẠI NHÂN VIÊN CẦN TÍNH");
                                System.out.println("          1. Full time");
                                System.out.println("          2. Part time");
                                int select4 = Integer.parseInt(scanner.nextLine());
                                switch (select4) {
                                    case 1:
                                        System.out.println("Nhập tên nhân viên cần tính lương:");
                                        manageNhanVien.doanhThuNhanVien("NhanVienFullTime");
                                        break;
                                    case 2:
                                        System.out.println("Nhập tên nhân viên cần tính lương:");
                                        manageNhanVien.doanhThuNhanVien("NhanVienPartTime");
                                        break;
                                }
                            break;
                            case 2:
                                System.out.println("Nhập tên nhân viên cần tính lương:");
                                manageNhanVien.doanhThuNhanVien("NhanVienTuyenSinh");
                                break;
                        }
                    break;
                    case 5:
                        System.out.println("Tìm kiếm theo tên: ");
                        manageNhanVien.searchByName();
                        break;
                    case 6:
                        manageNhanVien.sortNhanVien();
                        break;
                    case 7:
                        manageNhanVien.show();
                        break;
                    case 8:
                        System.exit(0);

                }
            }
    }
}
