import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        KiaMorning kiaMorning = new KiaMorning();
//        System.out.println("Ten: " + kiaMorning.getName() +
//                ", gia: " + kiaMorning.getPrice() +
//                ", so banh xe: " + kiaMorning.getNumberOfWheels() +
//                ", quoc gia: " + kiaMorning.country);
//
//        Lexus lexus = new Lexus("Nhat Bon");
//        System.out.println("Ten: " + lexus.getName() +
//                ", gia: " + lexus.getPrice() +
//                ", so banh xe: " + lexus.getNumberOfWheels() +
//                ", quoc gia: " + lexus.country);

        // 0 -> 6
//        int[] mangInt = new int[]{1, 3, 6, 4, 7, 8, 10};
//        System.out.println(mangInt[5]);
//
//        String[] mangString = new String[]{"a", "x", "haha", "easy"};
//
//        Car[] mangCar = new Car[]{new Lexus(), new KiaMorning()};
//
        Math math = new Math();
//
//        int[] mang = new int[]{1, 2, 3, 4};
//
//        math.doiViTri(mang, 0, 3);
//        System.out.println(Arrays.toString(mang));

//        int[] mang = new int[]{10, 50, 30, 100, 5, 1, 2, 7, 8};
//        math.sapXepMang(mang);
//        System.out.println(Arrays.toString(mang));

//        int n = 3;
//        int m = 4;

        // Cach 1:
        // n = 3, m = 4
//        int x = n; // n = 3, m = 4, x = 3
//
//        n = m; // n = 4, m = 4, x = 3
//
//        m = x; // n = 4, m = 3, x = 3

        // Cach 2:
//        n = n + m; // n = 7, m = 4
//        m = n - m; // n = 7, m = 3
//        n = n - m; // n = 4, m = 3

//        System.out.println("n: " + n + ", m: " + m);

        // 5
        System.out.println(math.demSoLuong(new int[]{1, 1, 1, 1, 1, 4, 5, 3}, 1));
        // 0
        System.out.println(math.demSoLuong(new int[]{2, 2, 4, 5, 3}, 1));
    }
}