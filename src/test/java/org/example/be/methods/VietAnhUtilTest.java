package org.example.be.methods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VietAnhUtilTest {

        VietAnhUtil vietanh = new VietAnhUtil();

        @Test
        @DisplayName("Tinh tong so nguyen chi het cho 3 voi n = 10")
        void testTinhTongVoiNBang10() {
             Assertions.assertEquals(18, vietanh.tinhTongChiaHetCho3(10));
        }

        @Test
        @DisplayName("Tinh tong so nguyen chi het cho 3 n = 3")
        void testTinhTongVoiNBang3() {
            Assertions.assertEquals(3, vietanh.tinhTongChiaHetCho3(3));
        }
        @Test
        @DisplayName("Tinh tong so nguyen chi het cho 3 voi n <3")
        void testTinhTongVoiNBeHon3f() {
            Assertions.assertEquals(0,vietanh.tinhTongChiaHetCho3(2));
        }
    }

