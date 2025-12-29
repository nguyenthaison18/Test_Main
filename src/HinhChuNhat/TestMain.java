package HinhChuNhat;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("chieu dai = ");
        double dai = input.nextDouble();
        System.out.print("chieu rong = ");
        double rong = input.nextDouble();
        Main hcn = new Main(dai, rong);
        hcn.display();

    }
}
