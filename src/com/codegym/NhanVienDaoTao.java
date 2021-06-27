package com.codegym;

public class NhanVienDaoTao extends NhanVien{
    String nganh;

    public NhanVienDaoTao() {
    }
    public NhanVienDaoTao(String nganh) {
        this.nganh = nganh;
    }

    public NhanVienDaoTao(String tenNhanVien, int tuoiNhanVien, String gioiTinh, String soDienThoai, String email, int luong, String nganh) {
        super(tenNhanVien, tuoiNhanVien, gioiTinh, soDienThoai, email, luong);
        this.nganh = nganh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return "NhanVienDaoTao{" +
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