import java.util.ArrayList;
import java.util.List;

public class Oatmilk{
    private double fettContend;
    private double liter;

    List<Oatmilk> oatmilks = new ArrayList<>();

    public void oatmilksAdder(){
        oatmilks.add(new Oatmilk(fettContend, liter));
    }
    public void oatmilksPrint(){
        for(Oatmilk oatmilk: oatmilks){
            System.out.println("---------------------------------------------------");
            System.out.println("Havredryck\n***********");
            System.out.println("Fetthalt: "+oatmilk.getFettContend()+" % / "+oatmilk.getLiter()+" liter.");
        }
    }

    public Oatmilk(double fettContend, double liter){
        this.fettContend = fettContend;
        this.liter = liter;
    }

    public double getFettContend() {
        return fettContend;
    }

    public void setFettContend(double fettContend) {
        this.fettContend = fettContend;
    }

    public double getLiter() {
        return liter;
    }

    public void setLiter(double liter) {
        this.liter = liter;
    }

  
    
}
