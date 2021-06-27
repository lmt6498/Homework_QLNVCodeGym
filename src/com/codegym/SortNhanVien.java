package com.codegym;

import java.util.Comparator;

public class SortNhanVien implements Comparator<NhanVien> {
    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        return o1.getTenNhanVien().compareTo(o2.tenNhanVien);
    }
}