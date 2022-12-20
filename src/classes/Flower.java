package classes;

import enums.Colorr;

public class Flower {
    private String manufacturerCountry;
    private int shelfLifeInDays;
    private Colorr color;
    private long price;

    public Flower(String manufacturerCountry, int shelfLifeInDays, Colorr color, long price) {
        this.manufacturerCountry = manufacturerCountry;
        this.shelfLifeInDays = shelfLifeInDays;
        this.color = color;
        this.price = price;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public int getShelfLifeInDays() {
        return shelfLifeInDays;
    }

    public void setShelfLifeInDays(int shelfLifeInDays) {
        this.shelfLifeInDays = shelfLifeInDays;
    }

    public Colorr getColor() {
        return color;
    }

    public void setColor(Colorr color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n        Flower" +
                "\nmanufacturerCountry='" + manufacturerCountry +
                "\nshelfLifeInDays=" + shelfLifeInDays +
                "\ncolor=" + color +
                "\nprice=" + price +
                "\n=======================\n";
    }
}
