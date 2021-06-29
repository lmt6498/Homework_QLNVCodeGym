package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileBinary {
    public static void writeToFile(String path, List<NhanVien> products){
        try {
            FileOutputStream fos = new FileOutputStream(path,false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static ArrayList<NhanVien> readDataFromFile(String path){
        ArrayList<NhanVien> nhanVien = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            nhanVien = (ArrayList<NhanVien>) ois.readObject();
            ois.close();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return nhanVien;
    }
}
