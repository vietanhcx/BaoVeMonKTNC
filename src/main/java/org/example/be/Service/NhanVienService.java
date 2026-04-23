package org.example.be.Service;

import org.example.be.entity.NhanVien;
import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    private List<NhanVien> list = new ArrayList<>();

    public void add(NhanVien nv) {
        if (nv.getMaNV() == null || nv.getMaNV().isBlank())
            throw new IllegalArgumentException("Mã không được trống");
        list.add(nv);
    }

    public void update(NhanVien nv, String maMoi, String tenMoi, int tuoiMoi, float luongMoi, int soNamMoi, String phongMoi) {
        if (tenMoi == null || tenMoi.isBlank())
            throw new IllegalArgumentException("Tên không được trống");
        if (tuoiMoi < 18 || tuoiMoi > 60)
            throw new IllegalArgumentException("Tuổi không hợp lệ");

        nv.setTen(tenMoi);
        nv.setTuoi(tuoiMoi);
        nv.setLuong(luongMoi);
        nv.setSoNamLamViec(soNamMoi);
        nv.setPhongBan(phongMoi);
    }
}