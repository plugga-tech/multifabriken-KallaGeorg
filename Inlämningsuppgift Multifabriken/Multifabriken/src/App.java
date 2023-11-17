
import java.util.Scanner;

public class App {
      static String userString;
      static double userDouble;
      static float userFloat;
      static int userInt;
    public static void main(String[] args) throws Exception {
       
        
        
         
         Car car = new Car("","","");
         Pipe pipe = new Pipe(0,0);
         Candy candy = new Candy("",0);
         Oatmilk oatmilk = new Oatmilk(0, 0);
        Scanner input = new Scanner(System.in);
        boolean run=true;
        String val;
        while(run){
            System.out.println("----- ----- ----- ----- ----- ----- ----- ----- -----\n----- ----- ----- ----- ----- ----- ----- ----- -----");
            System.out.print("\tMultifabriken\n\t***************\n\tVälkommen till Multifabrikens online-shop!\n\tVälj vilka produkter du vill köpa!\n\t[1]Bilar\n\t[2]Rör\n\t[3]Godis\n\t[4]Havremjölk\n\t[5]Visa varukorgen\n\t[6]Avsluta programmet\n\tVälj mellan 1-6 : ");
                        
            val = input.next();
            if(val.equals("1") ||val.equals("2")||val.equals("3") || val.equals("4") || val.equals("5")||val.equals("6")){
             switch(val){
                case "1" :
                      
                      System.out.print("\033[2J\033[1;1H");
                      System.out.println("\tBilar\n\t*****");
                      System.out.print("\tÖnskad bilmärke: ");
                      input.nextLine();
                      String brand = input.nextLine();
                      car.setBrand(brand);
                      System.out.print("\tBilens önskade färg: ");
                      String color = input.nextLine();
                      car.setColor(color);
                      System.out.print("\tÖnskad skrift på registreringsskyltet: ");
                      String licensePlate = input.nextLine();
                      car.setLicensePlate(licensePlate);
                      car.carsAdder();
                     

                break;
                case "2":
                     
                      System.out.print("\033[2J\033[1;1H");  
                      System.out.println("\tRör\n\t****");
                      System.out.print("\tSkriv önskad diameter: ");
                      input.nextLine();
                      double diameter = input.nextDouble();
                      pipe.setDiameter(diameter);
                      System.out.print("\tSkriv önskad längd: ");
                      input.nextLine();
                      float length = input.nextFloat();
                      pipe.setLength(length);
                      pipe.pipesAdder();
                    
                break;
                case "3" :
                     
                      System.out.print("\033[2J\033[1;1H");
                      System.out.println("\tGodis\n\t******");
                      System.out.println("\tVilken smak ska dina godis ha?");
                      System.out.print("\tVarsågod: ");
                      input.nextLine();
                      String taste = input.nextLine();
                      candy.setTaste(taste);
                      System.out.println("\tHur många godies vill du ha?");
                      System.out.print("\tVarsågod: ");
                      int pieces = input.nextInt();
                      candy.setPieces(pieces);
                      input.nextLine();
                      candy.candiesAdder();
                      
                     

                break;
                case "4" :
                      
                      System.out.print("\033[2J\033[1;1H");
                      System.out.println("\tHavremjölk\n\t***********");
                      System.out.print("\tSkriv in önskad fetthalt: ");
                      input.nextLine();
                      double fettContend = input.nextDouble();
                      oatmilk.setFettContend(fettContend);
                      System.out.print("\tSkriv in önskad mängd i liter: ");
                      input.nextLine();
                      double liter = input.nextDouble();
                      oatmilk.setLiter(liter);
                      oatmilk.oatmilksAdder();
                break;
                case "5" :
                     
                      System.out.print("\033[2J\033[1;1H");
                      System.out.println("\tDin varukorg\n\t*************");
                      
                      car.carsPrint();
                      pipe.pipesPrint();
                      candy.candiesPrint();
                      oatmilk.oatmilksPrint();
                      input.nextLine();

                      
                     
                break;
                case "6" :
                      System.out.print("\033[2J\033[1;1H");
                      System.out.println("\tDu lämnar nu programmet! Välkommen åter!");
                      run = false;
                break;
                default :
                      System.out.println((char)27+"\t[01;31mFel!"+(char)27+"[00;00m");
                break;

             }
            }
            else{
             System.out.print("\033[2J\033[1;1H");
             System.out.println((char)27+"\t[01;31mDu måste välja mellan siffra 1 - 5 i menyn!\n\tInga bokstäver eller andra siffror!"+(char)27+"[00;00m");
            }
              
           
            

        }
        input.close();
    }
    public static String taEmot1(Scanner input){
      System.out.print("\tÖnskad bilmärke: ");
      if(input.hasNextLine()){
       userString = input.nextLine();
      }else{
       felmeddelande1();
      }
      return userString;
    }
     public static String taEmot2(Scanner input){
      System.out.print("\tBilens önskad färg: ");
      if(input.hasNextLine()){
       userString = input.nextLine();
      }else{
       felmeddelande1();
      }
      return userString;
    }
     public static String taEmot3(Scanner input){
      System.out.print("\tÖnskad skrift på registreringsskylt: ");
      if(input.hasNextLine()){
       userString = input.nextLine();
      }else{
       felmeddelande1();
      }
      return userString;
    }
     public static double taEmot4(Scanner input){
      System.out.print("\tÖnskad diameter: ");
      if(input.hasNextDouble() && input.nextDouble() > 0){
       userDouble = input.nextDouble();
       
      }else{
       felmeddelande2();
      }
      return userDouble;
    }
     public static double taEmot5(Scanner input){
      System.out.print("\tÖnskad längd: ");
      if(input.hasNextFloat() && input.nextFloat() > 0){
       userFloat = input.nextFloat();
       
      }else{
       felmeddelande2();
      }
      return userFloat;
    }
    public static String taEmot6(Scanner input){
      System.out.print("\tÖnskad smak: ");
      if(input.hasNextLine()){
       userString = input.nextLine();
      }else{
       felmeddelande1();
      }
      return userString;
    }
    public static int taEmot7(Scanner input){
      System.out.print("\tÖnskad antal godis per påse: ");
      if(input.hasNextInt() && input.nextInt() > 0){
       userInt = input.nextInt();
      }else{
       felmeddelande2();
      }
      return userInt;
    }
     public static double taEmot8(Scanner input){
      System.out.print("\tÖnskad fetthalt [%]: ");
      if(input.hasNextDouble() && input.nextDouble() > 0){
       userDouble = input.nextDouble();
       
      }else{
       felmeddelande2();
      }
      return userDouble;
    }
     public static double taEmot9(Scanner input){
      System.out.print("\tÖnskad litermängd: ");
      if(input.hasNextDouble() && input.nextDouble() > 0){
       userDouble = input.nextDouble();
       
      }else{
       felmeddelande2();
      }
      return userDouble;
    }


    public static void felmeddelande1(){
      System.out.println((char)27+"\t[01;31mFel! Inmatning måste ha textformat!"+(char)27+"[00;00m");
    }
    public static void felmeddelande2(){
      System.out.println((char)27+"\t[01;31mFel! Skriv in en siffra större än noll!"+(char)27+"[00;00m");
    }
}
