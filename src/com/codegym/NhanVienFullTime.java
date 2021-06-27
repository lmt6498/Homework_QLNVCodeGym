package com.codegym;

public class NhanVienFullTime extends NhanVienDaoTao {
    public NhanVienFullTime() {
    }

    public NhanVienFullTime(String nganh) {
        super(nganh);
    }

    public NhanVienFullTime(String tenNhanVien, int tuoiNhanVien, String gioiTinh, String soDienThoai, String email, int luong, String nganh) {
        super(tenNhanVien, tuoiNhanVien, gioiTinh, soDienThoai, email, luong, nganh);
    }


    @Override
    public String toString() {
        return "NhanVienFullTime{" +
                "tenNhanVien='" + tenNhanVien + '\'' +
                ", tuoiNhanVien=" + tuoiNhanVien +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", email='" + email + '\'' +
                ", luong=" + luong +
                ", nganh='" + nganh + '\'' +
                '}';
    }
}