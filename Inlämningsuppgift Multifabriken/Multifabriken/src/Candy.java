public class Candy implements Product{
    private String taste;
    private int pieces;

    public void getAmmount(int ammount){
        int sum = 0;
        sum = sum += ammount;
        System.out.println("Du har beställt "+sum+" påsar godis.");
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
