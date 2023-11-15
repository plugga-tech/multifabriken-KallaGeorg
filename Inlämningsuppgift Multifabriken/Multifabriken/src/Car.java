import java.util.ArrayList;
import java.util.List;

public class Car extends Product {
    private String color;
    private String brand;
    private String licensePlate;

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

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    List<Car> cars = new ArrayList<>();
    
    public void carsAdder(String color, String brand, String licensePlate){
        cars.add(new Car(color, brand, licensePlate));
    }
    public void carsPrint(){
        for(Car car : cars){
            System.out.println("---------------------------------------------------");
            System.out.println("Bilar\n*******");
            System.out.println("Bilmärke: "+car.getBrand()+" / Önskad färg: "+car.getColor()+" / Önskad regestreringsskylt: "+car.getLicensePlate());
        }
        
    }

    public Car(String color, String brand, String licensePlate){
        this.color = color;
        this.brand = brand;
        this.licensePlate = licensePlate;
    }

    
}
