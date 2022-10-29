public class Lexus extends Car {

    public Lexus() {
        this.country = "Tau Khua";
    }

    public Lexus(String country) {
        this.country = country;
    }

    // trả về giá của con kia morning
    @Override
    public int getPrice() {
        return 5_00_000_000;
    }

    // trả về tên
    @Override
    public String getName() {
        return "Lexus";
    }

    public int getWeight() {
        return 100;
    }

}
