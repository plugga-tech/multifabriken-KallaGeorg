
import java.util.Scanner;

public class App {
      static Scanner input = new Scanner(System.in);
      static String val;
      static String userString;
      static double userDouble;
      static float userFloat;
      static int userInt;
       
      static Car car = new Car("","","");
      static Pipe pipe = new Pipe(0,0);
      static Candy candy = new Candy("",0);
      static Oatmilk oatmilk = new Oatmilk(0, 0);
    public static void main(String[] args) throws Exception {
               
        boolean run=true;
       
        while(run){
            meny(); 
                     
           if(val.equals("1")||val.equals("2")||val.equals("3")||val.equals("4")||val.equals("5")|| val.equals("6"))
            {System.out.println((char)27+"[01;32m\tMenyval: "+val+" korrekt! Tryck [enter]!"+(char)27+"[00;00m"); input.nextLine();}
            else{
                  System.out.print("\033[2J\033[1;1H");
                  System.out.println((char)27+"\t[01;31mOgiltigt menyval välj mellan 1-6!\n\t Inga bokstäver eller tecken!"+(char)27+"[00;00m");
                  continue;
            }
             switch(val){
                case "1" :
                     bil();
                break;

                case "2" :
                    rör();
                break;

                case "3" :
                    godis();
                break;

                case "4" :
                    havredryck();
                break;

                case "5" :
                     varukorg();
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
      static String taEmot1(Scanner input){
      System.out.print("\tÖnskad bilmärke: ");
      if(input.hasNextLine()){
       userString = input.nextLine();
      }else{
       felmeddelande1();
      }
      return userString;
    }
      static String taEmot2(Scanner input){
      System.out.print("\tBilens önskad färg: ");
      if(input.hasNextLine()){
       userString = input.nextLine();
      }else{
       felmeddelande1();
      }
      return userString;
    }
      static String taEmot3(Scanner input){
      System.out.print("\tÖnskad skrift på registreringsskylt: ");
      if(input.hasNextLine()){
       userString = input.nextLine();
      }else{
       felmeddelande1();
      }
      return userString;
    }
     static double taEmot4(Scanner input){
      System.out.print("\tÖnskad diameter: ");
      if(input.hasNextDouble())
      userDouble = input.nextDouble();
      input.nextLine();
      if(userDouble <= 0){felmeddelande2();}
      return userDouble;
    }

      static float taEmot5(Scanner input){
      System.out.print("\tÖnskad längd: ");
      if(input.hasNextFloat())
       userFloat = input.nextFloat();
       input.nextLine();
       if (userFloat<=0){felmeddelande2();}
       return userFloat;
    }
      
    
      static String taEmot6(Scanner input){
      System.out.print("\tÖnskad smak: ");
      if(input.hasNextLine())
      userString = input.nextLine();
      else
      felmeddelande1();
      return userString;
    }
      static int taEmot7(Scanner input){
      System.out.print("\tÖnskad antal: ");
      if(input.hasNextInt())
       userInt = input.nextInt();
       input.nextLine();
       if(userInt<=0){ felmeddelande2();}
       return userInt;
    }
      static double taEmot8(Scanner input){
      System.out.print("\tÖnskad fetthalt [%]: ");
      if(input.hasNextDouble())
       userDouble = input.nextDouble();
       input.nextLine();
      if(userDouble <= 0){ felmeddelande2();}
      return userDouble;
    }
      static double taEmot9(Scanner input){
      System.out.print("\tÖnskad litermängd: ");
      if(input.hasNextDouble())
       userDouble = input.nextDouble();
       input.nextLine();
       if(userDouble <= 0){felmeddelande2();}
       return userDouble;
    }
    static void meny(){
       System.out.println("----- ----- ----- ----- ----- ----- ----- ----- -----\n----- ----- ----- ----- ----- ----- ----- ----- -----");
       System.out.print("\tMultifabriken\n\t***************\n\tVälkommen till Multifabrikens online-shop!\n\tVälj vilka produkter du vill köpa!\n\t[1]Bilar\n\t[2]Rör\n\t[3]Godis\n\t[4]Havredryck\n\t[5]Visa varukorgen\n\t[6]Avsluta programmet\n\tVälj mellan 1-6 : ");
       val = input.nextLine();
    }
    static void bil(){
       System.out.print("\033[2J\033[1;1H");
       System.out.println("\tBilar\n\t*****");
       car.adder(taEmot1(input),taEmot2(input),taEmot3(input));
    }
    static void rör(){
      System.out.print("\033[2J\033[1;1H");  
       System.out.println("\tRör\n\t****");
       pipe.adder(taEmot4(input),taEmot5(input));

    }
    static void godis(){
       System.out.print("\033[2J\033[1;1H");
       System.out.println("\tGodis\n\t******");
       candy.adder(taEmot6(input),taEmot7(input));
    }
     static void havredryck(){
       System.out.print("\033[2J\033[1;1H");
       System.out.println("\tHavredryck\n\t******");
       oatmilk.adder(taEmot8(input),taEmot9(input));
    }

   
    static void varukorg(){
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
      static void felmeddelande1(){
      System.out.println((char)27+"\t[01;31mFel! Inmatning måste ha textformat!"+(char)27+"[00;00m");
    }
      static void felmeddelande2(){
      System.out.println((char)27+"\t[01;31mFel! Skriv in en siffra större än noll! Inga bokstäver eller tecken!"+(char)27+"[00;00m");
      
    }

}

