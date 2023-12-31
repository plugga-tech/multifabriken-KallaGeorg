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
            System.out.println("-----------------------------------------------------");
            System.out.println("Havredryck\n***********");
            if(oatmilk.getFettContend()> 0 && oatmilk.getFettContend()<20 && oatmilk.getLiter()>0){
            System.out.println("Fetthalt: "+oatmilk.getFettContend()+" % / "+oatmilk.getLiter()+" liter.");
            }
            else if(oatmilk.getFettContend()>19){
                System.out.println((char)27+"\t[01;31mInfo: Vi producera bara havredryck med upp till 19% fetthalt!\n\tAnpassa din beställning, tack!"+(char)27+"[00;00m");
                System.out.println((char)27+"\t[01;31mDin beställning: Fetthalt = "+oatmilk.getFettContend()+" % / Litermängd = "+oatmilk.getLiter()+" liter"+(char)27+"[00;00m");   
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

    public double getLiter() {
        return liter;
    }
    
}
