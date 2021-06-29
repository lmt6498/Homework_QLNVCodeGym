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
    public void display(){
        System.out.println("NhanVienFullTime{" +
                "tenNhanVien='" + this.getTenNhanVien() + '\'' +
                ", tuoiNhanVien=" + this.getTuoiNhanVien() +
                ", gioiTinh='" + this.getGioiTinh() + '\'' +
                ", soDienThoai='" + this.getSoDienThoai() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", luong=" + this.getLuong() +
                ", nganh=" + this.getNganh() +
                '}');
    }
}