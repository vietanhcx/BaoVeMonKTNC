package org.example.be.methods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VietAnhUtilTest {

        VietAnhUtil vietanh = new VietAnhUtil();

        @Test
        void testTinhTongVoiNBang10() {

            Assertions.assertEquals(18, vietanh.tinhTongChiaHetCho3(10));
        }

        @Test
        void testTinhTongVoiNBang3() {
            Assertions.assertEquals(3, vietanh.tinhTongChiaHetCho3(3));
        }

        @Test
        void testTinhTongVoiNBeHon3() {
            Assertions.assertEquals(0,vietanh.tinhTongChiaHetCho3(2));
        }
    }

