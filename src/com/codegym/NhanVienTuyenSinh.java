package com.codegym;

public class NhanVienTuyenSinh extends NhanVien{
    int soTuyenSinh;
    int doanhThu;

    public NhanVienTuyenSinh(){}

    public NhanVienTuyenSinh(int soTuyenSinh, int doanhThu) {
        this.soTuyenSinh = soTuyenSinh;
        this.doanhThu = doanhThu;
    }

    public NhanVienTuyenSinh(String tenNhanVien, int tuoiNhanVien, String gioiTinh, String soDienThoai, String email, int luong, int soTuyenSinh, int doanhThu) {
        super(tenNhanVien, tuoiNhanVien, gioiTinh, soDienThoai, email, luong);
        this.soTuyenSinh = soTuyenSinh;
        this.doanhThu = doanhThu;
    }


    public int getSoTuyenSinh() {
        return soTuyenSinh;
    }

    public void setSoTuyenSinh(int soTuyenSinh) {
        this.soTuyenSinh = soTuyenSinh;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }


    @Override
    public int doanhThu(){
        return getLuong()*8+(getSoTuyenSinh()*10);
    }
    @Override
    public String toString() {
        return "NhanVienTuyenSinh{" +
                "tenNhanVien='" + tenNhanVien + '\'' +
                ", tuoiNhanVien=" + tuoiNhanVien +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", email='" + email + '\'' +
                ", luong=" + luong +
                ", soTuyenSinh=" + soTuyenSinh +
                ", doanhThu=" + doanhThu +
                '}';
    }
}