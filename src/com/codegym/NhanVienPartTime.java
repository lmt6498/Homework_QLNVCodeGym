package com.codegym;

public class NhanVienPartTime extends NhanVienDaoTao{
    int time;
    public NhanVienPartTime(){}

    public NhanVienPartTime(int time) {
        this.time = time;
    }

    public NhanVienPartTime(String nganh, int time) {
        super(nganh);
        this.time = time;
    }

    public NhanVienPartTime(String tenNhanVien, int tuoiNhanVien, String gioiTinh, String soDienThoai, String email, int luong, String nganh, int time) {
        super(tenNhanVien, tuoiNhanVien, gioiTinh, soDienThoai, email, luong, nganh);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int doanhThu() {
        return getLuong()*time;
    }

    @Override
    public String toString() {
        return "NhanVienPartTime{" +
                "tenNhanVien='" + tenNhanVien + '\'' +
                ", tuoiNhanVien=" + tuoiNhanVien +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", email='" + email + '\'' +
                ", luong=" + luong +
                ", nganh='" + nganh + '\'' +
                ", time=" + time +
                '}';
    }
}