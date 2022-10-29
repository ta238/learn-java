import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1000000000);
        car.setPrice(123456789);
        System.out.println("gia tien oto="+car.getPrice());

    }
}