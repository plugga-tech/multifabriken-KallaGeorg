
import java.util.Scanner;

public class App {
     
    public static void main(String[] args) throws Exception {
        
        
        
         
         Car car = new Car("","","");
         Pipe pipe = new Pipe(0,0);
         Candy candy = new Candy("",0);
         Oatmilk oatmilk = new Oatmilk(0, 0);
        Scanner input = new Scanner(System.in);
        boolean run=true;
        String val;
        while(run){
            System.out.println("--------------------------------------------\n--------------------------------------------");
            System.out.print("Multifabriken\n***************\nVälkommen till Multifabrikens online-shop!\nVälj vilka produkter du vill köpa!\n[1]Bilar\n[2]Rör\n[3]Godis\n[4]Havremjölk\n[5]Visa varukorgen\n[6]Avsluta programmet\nVälj mellan 1-6 : ");
                        
            val = input.next();
            if(val.equals("1") ||val.equals("2")||val.equals("3") || val.equals("4") || val.equals("5")||val.equals("6")){
             switch(val){
                case "1" :
                      
                      System.out.print("\033[2J\033[1;1H");
                      System.out.println("Bilar\n*****");
                      System.out.print("Bilmärke:");
                      input.nextLine();
                      String brand = input.nextLine();
                      car.setBrand(brand);
                      System.out.print("Bilens önskade färg:");
                     
                      String color = input.nextLine();
                      car.setColor(color);
                      System.out.print("Önskad skrift på registreingsskyltet:");
                     
                      String licensePlate = input.nextLine();
                      car.setLicensePlate(licensePlate);
                      car.carsAdder(car.getColor(),car.getBrand(),car.getLicensePlate());
                     

                break;
                case "2":
                     
                      System.out.print("\033[2J\033[1;1H");  
                      System.out.println("Rör\n****");
                      System.out.print("Skriv önskad diameter: ");
                      input.nextLine();
                      double diameter = input.nextDouble();
                      pipe.setDiameter(diameter);
                      System.out.print("Skriv önskad längd: ");
                      input.nextLine();
                      float length = input.nextFloat();
                      pipe.setLength(length);
                      pipe.pipesAdder(diameter, length);
                    
                break;
                case "3" :
                     
                      System.out.print("\033[2J\033[1;1H");
                      System.out.println("Godis\n******");
                      System.out.println("Vilken smak ska dina godis ha?");
                      System.out.print("Varsågod: ");
                      input.nextLine();
                      String taste = input.nextLine();
                      candy.setTaste(taste);
                      
                      System.out.println("Hur många godies vill du ha?");
                      System.out.print("Varsågod: ");
                      int pieces = input.nextInt();
                      candy.setPieces(pieces);
                      input.nextLine();
                      candy.candiesAdder(candy.getTaste(),candy.getPieces());
                      //candy.candiesPrint();
                     

                break;
                case "4" :
                      
                      System.out.print("\033[2J\033[1;1H");
                      System.out.println("Havremjölk\n***********");
                      System.out.print("Skriv in önskad fetthalt: ");
                      input.nextLine();
                      double fettContend = input.nextDouble();
                      oatmilk.setFettContend(fettContend);
                      System.out.print("Skriv in önskad mängd i liter: ");
                      input.nextLine();
                      double liter = input.nextDouble();
                      oatmilk.setLiter(liter);
                      oatmilk.oatmilksAdder();
                break;
                case "5" :
                     
                      System.out.print("\033[2J\033[1;1H");
                      System.out.println("Din varukorg\n*************");
                      candy.candiesPrint();
                      car.carsPrint();
                      pipe.pipesPrint();
                      oatmilk.oatmilksPrint();
                      input.nextLine();

                      
                     
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
