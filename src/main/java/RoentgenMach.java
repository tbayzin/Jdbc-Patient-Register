public class RoentgenMach extends Device {
    private String ram;
    private  int price;
    private int weight;



    public RoentgenMach(String ramSize, int priceOf,int weightOf) {
        this.ram = ramSize;
        this.price = priceOf;
        this.weight = weightOf;
    }



    @Override
    public String getDetails() {
        return  "Rontgen makinasının rami: " + this.ram + " fiyatı:  " + this.price + " ve ağırlığı "
                + this.weight + " kilogramdır";
    }


    @Override
    public String toString() {
        return "Roentgen Mach{" +
                "ram='" + ram + '\'' +
                ", price=" + price +
                '}';
    }
}
