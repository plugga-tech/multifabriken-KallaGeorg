
import java.util.Scanner;

public class App {
      static Scanner input = new Scanner(System.in);
      static String choiche;
    
       
      static Car car = new Car("","","");
      static Pipe pipe = new Pipe(0,0);
      static Candy candy = new Candy("",0);
      static Oatmilk oatmilk = new Oatmilk(0, 0);
    public static void main(String[] args) throws Exception {
               
        boolean run=true;
       
        while(run){
            menu(); 
                     
           if(choiche.equals("1")||choiche.equals("2")||choiche.equals("3")||choiche.equals("4")||choiche.equals("5")|| choiche.equals("6"))
            {System.out.println((char)27+"[01;32m\tMenyval: "+choiche+" korrekt! Tryck [enter]!"+(char)27+"[00;00m"); input.nextLine();}
            else{
                  System.out.print("\033[2J\033[1;1H");
                  System.out.println((char)27+"\t[01;31mOgiltigt menyval välj mellan 1-6!\n\t Inga bokstäver eller tecken!"+(char)27+"[00;00m");
                  continue;
            }
             switch(choiche){
                case "1" :
                     car();
                break;

                case "2" :
                    pipe();
                break;

                case "3" :
                    candy();
                break;

                case "4" :
                    oatmilk();
                break;

                case "5" :
                     orderlist();
                break;

                case "6" :
                      run = run();
                break;

                default :
                     System.out.println((char)27+"\t[01;31mFel!"+(char)27+"[00;00m");
                break;
             }
            
      }
                    
        input.close();
}

    static void menu(){
       System.out.println("----- ----- ----- ----- ----- ----- ----- ----- -----\n----- ----- ----- ----- ----- ----- ----- ----- -----");
       System.out.print("\tMultifabriken\n\t***************\n\tVälkommen till Multifabrikens online-shop!\n\tVälj vilka produkter du vill köpa!\n\t[1]Bilar\n\t[2]Rör\n\t[3]Godis\n\t[4]Havredryck\n\t[5]Visa varukorgen\n\t[6]Avsluta programmet\n\tVälj mellan 1-6 : ");
       choiche = input.nextLine();
    }
    static void car(){
       System.out.print("\033[2J\033[1;1H");
       System.out.println("\tBilar\n\t*****");
       car.adder(UserInput.setValue1(input),UserInput.setValue2(input),UserInput.setValue3(input));
       
    }
    static void pipe(){
      System.out.print("\033[2J\033[1;1H");  
       System.out.println("\tRör\n\t****");
       pipe.adder(UserInput.setValue4(input),UserInput.setValue5(input));
       

    }
    static void candy(){
       System.out.print("\033[2J\033[1;1H");
       System.out.println("\tGodis\n\t******");
       candy.adder(UserInput.setValue6(input),UserInput.setValue7(input));
       
    }
     static void oatmilk(){
       System.out.print("\033[2J\033[1;1H");
       System.out.println("\tHavredryck\n\t******");
       oatmilk.adder(UserInput.setValue8(input),UserInput.setValue9(input));
       
    }

   
    static void orderlist(){
      System.out.print("\033[2J\033[1;1H");
      System.out.println("\tDin varukorg\n\t*************");
      car.printer();
      pipe.printer();
      candy.printer();
      oatmilk.printer();

    }
    static boolean run(){
      System.out.print("\033[2J\033[1;1H");
      System.out.println("\tDu lämnar nu programmet! Välkommen åter!");
      return false;
    }
   

}

