package Haha;

import javax.swing.plaf.PanelUI;

public class HinhTron {
    private double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron() {

    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getChuVi() {
        return 2 * Math.PI * banKinh;
    }

    public double getDienTich() {
        return Math.PI * banKinh * banKinh;
    }
    public void hienThi(){
        System.out.println(getChuVi());
        System.out.println(getDienTich());
    }

}
