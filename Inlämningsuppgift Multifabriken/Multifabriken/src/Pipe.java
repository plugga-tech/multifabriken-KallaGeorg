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
        System.out.println("------------------------------------------------------");
        System.out.println("Rör\n***");
        if(pipe.getDiameter()>0 && pipe.getLength()>0){
        System.out.println("Rör diameter: "+pipe.getDiameter()+" cm / Rör längd: "+pipe.getLength()+" cm.");
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
