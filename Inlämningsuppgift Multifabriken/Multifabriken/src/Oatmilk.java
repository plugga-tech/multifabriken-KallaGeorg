import java.util.ArrayList;
import java.util.List;

public class Oatmilk{
    private double fettContend;
    private double liter;

    List<Oatmilk> oatmilks = new ArrayList<>();

    public void adder(double fettContend, double liter){
        oatmilks.add(new Oatmilk(fettContend, liter));
    }
    public void printer(){
        for(Oatmilk oatmilk: oatmilks){
            System.out.println("------------------------------------------------------");
            System.out.println("Havredryck\n***********");
            if(oatmilk.getFettContend()> 0 && oatmilk.getLiter()>0){
            System.out.println("Fetthalt: "+oatmilk.getFettContend()+" % / "+oatmilk.getLiter()+" liter.");
            }
            else{
                System.out.println((char)27+"\t[01;31mFel inmatning vid beställning!"+(char)27+"[00;00m");
            }
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
