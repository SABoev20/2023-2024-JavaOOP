public class Car {
    private String brand;
    private String model;
    private int hs;

    public String getCarInfo()
    {
        return "The car is: " + brand + " " + model + " – " + hs + " HP.";
    }

    public Car(String brand, String model, int hs) {
        this.brand = brand;
        this.model = model;
        this.hs = hs;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHs() {
        return hs;
    }

    public void setHs(int hs) {
        this.hs = hs;
    }
}
