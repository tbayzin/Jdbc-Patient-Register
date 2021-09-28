public class HeartShockMach extends Device{
    private String ram;
    private  int price;


    public HeartShockMach(String ramSize, int priceOf) {
        this.ram = ramSize;
        this.price = priceOf;
    }



    @Override
    public String getDetails() {
        return  "Kalp şoku makinasının rami: " + this.ram + " ve fiyatı:  " + this.price + "dır";
    }

    @Override
    public String toString() {
        return "HeartShockMach{" +
                "ram='" + ram + '\'' +
                ", price=" + price +
                '}';
    }
}
