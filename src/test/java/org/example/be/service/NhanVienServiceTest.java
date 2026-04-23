package org.example.be.service;

import org.example.be.Service.NhanVienService;
import org.example.be.entity.NhanVien;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NhanVienServiceTest {
    NhanVienService service;

    @BeforeEach
    void setup() {
        service = new NhanVienService();
    }

    @Test
    void testUpdateThanhCong() {
        NhanVien nv = new NhanVien("NV01", "Anh", 20, 1000, 2, "IT");
        service.update(nv, "NV01", "Viet Anh", 25, 2000, 5, "Dev");
        Assertions.assertEquals("Viet Anh", nv.getTen());
        Assertions.assertEquals(25, nv.getTuoi());
    }

    @Test
    void testUpdateTenTrong() {
        NhanVien nv = new NhanVien("NV01", "Anh", 20, 1000, 2, "IT");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            service.update(nv, "NV01", "", 25, 2000, 5, "Dev");
        });
    }
}