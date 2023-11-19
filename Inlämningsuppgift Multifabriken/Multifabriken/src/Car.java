import java.util.ArrayList;
import java.util.List;

public class Car {
    private String color;
    private String brand;
    private String licensePlate;
    List<Car> cars = new ArrayList<>();

     public Car(String brand, String color, String licensePlate){
        this.brand = brand;
        this.color = color;
        this.licensePlate = licensePlate;
    }

    
    public void adder(String brand, String color, String licensePlate){
        cars.add(new Car(brand,color,licensePlate));
    }
    public void printer(){
        for(Car car : cars){
            System.out.println("-----------------------------------------------------");
            System.out.println("Bilar\n*******");
            System.out.println("Bilmärke: "+car.getBrand()+" / Önskad färg: "+car.getColor()+" / \nÖnskad registreringsskylt: "+car.getLicensePlate());
        }
        
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

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    } 
    
}
