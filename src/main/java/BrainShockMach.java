public class BrainShockMach extends Device {
    private String ram;
    private  int price;


    public BrainShockMach(String ramSize, int priceOf) {
        this.ram = ramSize;
        this.price = priceOf;
    }



    @Override
    public String getDetails() {
        return  "Beyin şoku makinasının rami: " + this.ram + " ve fiyatı:  " + this.price + "dır";
    }

    @Override
    public String toString() {
        return "Beyin soku{" +
                "ram='" + ram + '\'' +
                ", price=" + price +
                '}';
    }

}
