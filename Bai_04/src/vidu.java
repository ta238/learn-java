import java.util.Scanner;

public class vidu {
    public static void main(String[] args) {
        //khai bao bien va doc du lieu
        Scanner scanner = new Scanner(System.in);
        // mot vai vi du
        System.out.println("nhap vao ho va ten:");
        String hoVaTen = scanner.nextLine();

        System.out.println("ma sinh vien");
        long maSinhVien = scanner.nextLong();

        System.out.println("diem thi");
        float diemThi = scanner.nextFloat();
        System.out.println("ho va ten"+hoVaTen);
        System.out.println("ma sinh vien"+maSinhVien);
        System.out.println("diem thi"+diemThi);
    }
}
