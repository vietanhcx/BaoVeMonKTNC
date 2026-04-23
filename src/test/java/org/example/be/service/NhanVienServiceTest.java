package org.example.be.service;

import org.example.be.Service.NhanVienService;
import org.example.be.entity.NhanVien;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {

    private NhanVienService nhanVienService;

    @BeforeEach
    void setUp() {

        nhanVienService = new NhanVienService();
    }

    @Test
    void updateNhanVienWithValidNhanVien() {
        NhanVien nv = new NhanVien("333", "A33", 2, 10, 2, "it");
        nhanVienService.addNhanVien(nv);
        nv.setTen("A33");
        nhanVienService.updateNhanVien(nv);

        assertEquals("A33", nhanVienService.getByMa("333").getTen());
    }

    @Test
    void updateNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> nhanVienService.updateNhanVien(null));
        assertEquals("Nhan vien khong duoc trong", exception.getMessage());
    }

    @Test
    void updateNhanVienWithInvalidName() {
        NhanVien nv = new NhanVien("88", "Anh", 20, 10, 22, "it");
        nhanVienService.addNhanVien(nv);

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                nhanVienService.updateNhanVien(new NhanVien("88", "", 20, 10, 22, "it")));
        assertEquals("ten khong duoc de trong", exception.getMessage());
    }
}