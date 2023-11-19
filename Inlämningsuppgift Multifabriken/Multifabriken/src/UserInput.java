import java.util.Scanner;

public class UserInput {
    static String userString;
    static double userDouble;
    static float userFloat;
    static int userInt;
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
      static int setValue7(Scanner input){
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
    static void failuremessage1(){
        System.out.println((char)27+"\t[01;31mFel! Inmatning måste ha textformat!"+(char)27+"[00;00m");
      }
        static void failuremessage2(){
        System.out.println((char)27+"\t[01;31mFel! Skriv in en siffra större än noll! Inga bokstäver eller tecken!"+(char)27+"[00;00m");
        
      }

    
}
