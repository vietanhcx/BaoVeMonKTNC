package org.example.be.Service;

import org.example.be.entity.NhanVien;
import java.util.ArrayList;
import java.util.List;

public class NhanVienService {

    private List<NhanVien> listNhanVien = new ArrayList<>();

    public void addNhanVien(NhanVien nv) {
       if (nv == null) {
            throw new IllegalArgumentException("Nhan vien khong duoc trong");
        }
        listNhanVien.add(nv);
    }

    public void updateNhanVien(NhanVien nv) {

        if (nv == null) {
            throw new IllegalArgumentException("Nhan vien khong duoc trong");
        }

        if (nv.getTen() == null || nv.getTen().trim().isEmpty()) {
            throw new IllegalArgumentException("ten khong duoc de trong");
        }

        for (int i = 0; i < listNhanVien.size(); i++) {
            if (listNhanVien.get(i).getMaNV().equals(nv.getMaNV())) {
                listNhanVien.set(i, nv);
                return;
            }
        }
    }

    public List<NhanVien> getAll() {
        return listNhanVien;
    }

    public NhanVien getByMa(String ma) {
        return listNhanVien.stream()
                .filter(nv -> nv.getMaNV().equals(ma))
                .findFirst()
                .orElse(null);
    }
}