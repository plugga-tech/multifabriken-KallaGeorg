public class Pipe implements Product{
    private double diameter;
    private double length;

    public void getAmmount(int ammount){
        int sum = 0;
        sum = sum+=ammount;
        System.out.println("Du har beställt "+sum+" rör.");
    }

    public Pipe(double diameter, double length){
        this.diameter = diameter;
        this.length = length;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
}
