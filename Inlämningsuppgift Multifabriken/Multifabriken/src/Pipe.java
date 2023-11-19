import java.util.ArrayList;
import java.util.List;

public class Pipe {
   private double diameter;
   private float length;
   List<Pipe> pipes = new ArrayList<>();

   public void adder(double diameter, float length){
    pipes.add(new Pipe(diameter, length));
   }
   public void printer(){
    for(Pipe pipe:pipes){
        System.out.println("-----------------------------------------------------");
        System.out.println("Rör\n***");
        if(pipe.getDiameter() > 0 && pipe.getDiameter() < 1001 && pipe.getLength() > 0 && pipe.getLength() < 4001){
        System.out.println("Rör diameter: "+pipe.getDiameter()+" cm / Rör längd: "+pipe.getLength()+" cm.");
        }
        else if(pipe.getDiameter() > 1000 || pipe.getLength() > 4000){
             System.out.println((char)27+"\t[01;31mAntingen önskad rördiameter eller önskad rörlängd är för stort för webbshoppen!\n\tKontaktera kundtjänsten, tack!"+(char)27+"[00;00m");  
             System.out.println((char)27+"\t[01;31mDin beställning: Diameter = "+pipe.getDiameter()+" cm / Längd = "+pipe.getLength()+" cm"+(char)27+"[00;00m");
        }
        else{
            System.out.println((char)27+"\t[01;31mFel inmatning vid beställning!"+(char)27+"[00;00m");
        }
    }
   }
   
    public Pipe(double diameter, float length){
        this.diameter = diameter;
        this.length = length;
    }
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    
    
}
