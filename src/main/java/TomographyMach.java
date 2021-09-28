public class TomographyMach extends Device {

    private String ram;
    private  int price;
    private int weight;



    public TomographyMach(String ramSize, int priceOf,int weightOf) {
        this.ram = ramSize;
        this.price = priceOf;
        this.weight = weightOf;
    }



    @Override
    public String getDetails() {
        return  "Tomogorafi makinasının rami: " + this.ram + " fiyatı:  " + this.price + " ve ağırlığı "
                + this.weight + " kilogramdır";
    }

    @Override
    public String toString() {
        return "Tomografi machinesi{" +
                "ram='" + ram + '\'' +
                ", price=" + price +
                '}';
    }



}
