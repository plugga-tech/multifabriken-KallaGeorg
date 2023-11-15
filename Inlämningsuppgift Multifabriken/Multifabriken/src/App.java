
import java.util.Scanner;

public class App {
     
    public static void main(String[] args) throws Exception {
        
        
        
        
        Scanner input = new Scanner(System.in);
        boolean run=true;
        String val;
        while(run){
            //System.out.print("\033[2J\033[1;1H");
            System.out.print("Multifabriken\n***************\nVälkommen till Multifabrikens online-shop!\nVälj vilka produkter du vill köpa!\n[1]Bilar\n[2]Rör\n[3]Godis\n[4]Havremjölk\n[5]Visa varukorgen\n[6]Avsluta programmet\nVälj mellan 1-6 : ");
            val = input.next();
            if(val.equals("1") ||val.equals("2")||val.equals("3") || val.equals("4") || val.equals("5")||val.equals("6")){
             switch(val){
                case "1" :
                      
                      System.out.print("\033[2J\033[1;1H");
                      System.out.println("Bilar\n*****");
                     

                break;
                case "2":
                     
                      System.out.print("\033[2J\033[1;1H");  
                      System.out.println("Rör\n****");
                    
                break;
                case "3" :
                  
                      System.out.print("\033[2J\033[1;1H");
                      System.out.println("Godis\n******");
                     ;

                break;
                case "4" :
                      
                      System.out.print("\033[2J\033[1;1H");
                      System.out.println("Havremjölk\n***********");
                      
                     
                break;
                case "5" :
                     
                      System.out.print("\033[2J\033[1;1H");
                      System.out.println("Din varukorg\n*************");
                    
                     
                break;
                case "6" :
                      System.out.print("\033[2J\033[1;1H");
                      System.out.println("Du slutade av programmet! Välkommen åter!");
                      run = false;
                break;
                default :
                      System.out.println((char)27+"[01;31mFel!"+(char)27+"[00;00m");
                break;

             }
            }
            else{
             System.out.print("\033[2J\033[1;1H");
             System.out.println((char)27+"[01;31mDu måste välja mellan siffra 1 - 5 i menyn!\nInga bokstäver eller andra siffror!"+(char)27+"[00;00m");
            }
              
           
            

        }
        input.close();
    }
}
