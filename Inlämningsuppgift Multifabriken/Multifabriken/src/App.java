
import java.util.Scanner;

public class App {
      static Scanner input = new Scanner(System.in);
      static String choiche;
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
      static String setValue1(Scanner input){
      System.out.print("\tÖnskad bilmärke: ");
      if(input.hasNextLine()){
       userString = input.nextLine();
      }else{
       failuremessage1();
      }
      return userString;
    }
      static String setValue2(Scanner input){
      System.out.print("\tBilens önskad färg: ");
      if(input.hasNextLine()){
       userString = input.nextLine();
      }else{
       failuremessage1();
      }
      return userString;
    }
      static String setValue3(Scanner input){
      System.out.print("\tÖnskad skrift på registreringsskylt: ");
      if(input.hasNextLine()){
       userString = input.nextLine();
      }else{
       failuremessage1();
      }
      return userString;
    }
     static double setValue4(Scanner input){
      System.out.print("\tÖnskad diameter: ");
      if(input.hasNextDouble())
      userDouble = input.nextDouble();
      input.nextLine();
      if(userDouble <= 0){failuremessage2();}
      return userDouble;
    }

      static float setValue5(Scanner input){
      System.out.print("\tÖnskad längd: ");
      if(input.hasNextFloat())
       userFloat = input.nextFloat();
       input.nextLine();
       if (userFloat<=0){failuremessage2();}
       return userFloat;
    }
      
    
      static String setValue6(Scanner input){
      System.out.print("\tÖnskad smak: ");
      if(input.hasNextLine())
      userString = input.nextLine();
      else
      failuremessage1();
      return userString;
    }
      static int setvalue7(Scanner input){
      System.out.print("\tÖnskad antal: ");
      if(input.hasNextInt())
       userInt = input.nextInt();
       input.nextLine();
       if(userInt<=0){ failuremessage2();}
       return userInt;
    }
      static double setValue8(Scanner input){
      System.out.print("\tÖnskad fetthalt [%]: ");
      if(input.hasNextDouble())
       userDouble = input.nextDouble();
       input.nextLine();
      if(userDouble <= 0){ failuremessage2();}
      return userDouble;
    }
      static double setValue9(Scanner input){
      System.out.print("\tÖnskad litermängd: ");
      if(input.hasNextDouble())
       userDouble = input.nextDouble();
       input.nextLine();
       if(userDouble <= 0){failuremessage2();}
       return userDouble;
    }
    static void menu(){
       System.out.println("----- ----- ----- ----- ----- ----- ----- ----- -----\n----- ----- ----- ----- ----- ----- ----- ----- -----");
       System.out.print("\tMultifabriken\n\t***************\n\tVälkommen till Multifabrikens online-shop!\n\tVälj vilka produkter du vill köpa!\n\t[1]Bilar\n\t[2]Rör\n\t[3]Godis\n\t[4]Havredryck\n\t[5]Visa varukorgen\n\t[6]Avsluta programmet\n\tVälj mellan 1-6 : ");
       choiche = input.nextLine();
    }
    static void car(){
       System.out.print("\033[2J\033[1;1H");
       System.out.println("\tBilar\n\t*****");
       car.adder(setValue1(input),setValue2(input),setValue3(input));
    }
    static void pipe(){
      System.out.print("\033[2J\033[1;1H");  
       System.out.println("\tRör\n\t****");
       pipe.adder(setValue4(input),setValue5(input));

    }
    static void candy(){
       System.out.print("\033[2J\033[1;1H");
       System.out.println("\tGodis\n\t******");
       candy.adder(setValue6(input),setvalue7(input));
    }
     static void oatmilk(){
       System.out.print("\033[2J\033[1;1H");
       System.out.println("\tHavredryck\n\t******");
       oatmilk.adder(setValue8(input),setValue9(input));
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
      static void failuremessage1(){
      System.out.println((char)27+"\t[01;31mFel! Inmatning måste ha textformat!"+(char)27+"[00;00m");
    }
      static void failuremessage2(){
      System.out.println((char)27+"\t[01;31mFel! Skriv in en siffra större än noll! Inga bokstäver eller tecken!"+(char)27+"[00;00m");
      
    }

}

