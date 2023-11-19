import java.util.ArrayList;
import java.util.List;

public class Candy {
  private String taste;
  private int pieces;

  List <Candy> candies = new ArrayList<>();

  public void adder(String taste, int pieces){
    candies.add(new Candy(taste, pieces));
  }
  public void printer(){
    for(Candy candy : candies){
        System.out.println("-----------------------------------------------------");
        System.out.println("Godies\n******");
        if(candy.getPieces()>0 && candy.getPieces()<5001){
        System.out.println("Smak:"+candy.getTaste()+"/ Antal: "+candy.getPieces()+" styck");
      }
        else if(candy.getPieces()>5000){
          System.out.println((char)27+"\t[01;31mMaximal beställmängd för varje sort godies är 5000 styck,\n\tkontaktera kundtjänsten för större beställningar, tack!"+(char)27+"[00;00m");
          System.out.println((char)27+"\t[01;31mDin beställning: Smak = "+candy.getTaste()+"/ Antal = "+candy.getPieces()+" styck" +(char)27+"[00;00m");
        }
        else{
        System.out.println((char)27+"\t[01;31mFel inmatning vid beställning!"+(char)27+"[00;00m");
      }
    }
  }
  
  public Candy(String taste, int pieces){
    this.taste = taste;
    this.pieces = pieces;

  }

public String getTaste() {
    return taste;
}

public void setTaste(String taste) {
    this.taste = taste;
}

public int getPieces() {
    return pieces;
}

public void setPieces(int pieces) {
    this.pieces = pieces;
}


}

