import java.util.ArrayList;
import java.util.List;

public class Candy {
  private String taste;
  private int pieces;

  List <Candy> candies = new ArrayList<>();

  public void candiesAdder(){
    candies.add(new Candy(taste,pieces));
  }
  public void candiesPrint(){
    for(Candy candy : candies){
        System.out.println("---------------------------------------------------");
        System.out.println("Godies\n******");
        System.out.println("Smak:"+candy.getTaste()+"/ Antal per påse: "+candy.getPieces()+".");
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

