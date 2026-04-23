package org.example.be.methods;

public class VietAnhUtil {

        public int tinhTongChiaHetCho3(int n) {
            if (n < 1) return 0;
            int tong = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0) {
                    tong += i;
                }
            }
            return tong;
        }
    }

