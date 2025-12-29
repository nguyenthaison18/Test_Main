package Haha;

import java.util.Scanner;

public class TestHinhTron {
    static void main() {
        Scanner sc = new Scanner(System.in);
        HinhTron hinhTron = new HinhTron();
        double r =  0;
        System.out.print("ban kinh = ");
        r = sc.nextDouble();
        while (r <= 0) {
            if (r <= 0) {
                System.out.print("ko hop le, vui long nhap lai");
                r = sc.nextDouble();
                hinhTron.setBanKinh(r);
            }
        }
        hinhTron.hienThi();
    }
}
