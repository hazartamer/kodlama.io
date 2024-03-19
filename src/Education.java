public class Education {
    private String name;
    private boolean priceStatus;
    private int price;

    public Education(String name, boolean priceStatus, int price) {
        this.name = name;
        this.priceStatus = priceStatus;
        this.price = price;
    }

    public Education(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPriceStatus() {
        return priceStatus;
    }

    public void setPriceStatus(boolean priceStatus) {
        this.priceStatus = priceStatus;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
