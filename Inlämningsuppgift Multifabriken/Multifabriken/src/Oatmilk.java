public class Oatmilk implements Product{
    private double fettContent;
    private double liters;

    public void getAmmount(int ammount){
        int sum = 0;
        sum = sum+=ammount;
        System.out.println("Du har beställt "+sum+" förpackningar havremjölk.");
    }
    public Oatmilk(double fettContent, double liters){
        this.fettContent = fettContent;
        this.liters = liters;
    }
    public double getFettContent() {
        return fettContent;
    }
    public void setFettContent(double fettContent) {
        this.fettContent = fettContent;
    }
    public double getLiters() {
        return liters;
    }
    public void setLiters(double liters) {
        this.liters = liters;
    }
    
}
