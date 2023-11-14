public class Car implements Product {
    private String licensePlate;
    private String color;
    private String brand;

    public void getAmmount(int ammount){
        int sum = 0;
        sum = sum+=ammount;
        System.out.println("Du har beställt "+sum+" bilar.");
    }
    public Car(String licensePlate, String color, String brand){
        this.licensePlate = licensePlate;
        this.color = color;
        this.brand = brand;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
}
