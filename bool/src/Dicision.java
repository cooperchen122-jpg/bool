import java.util.Scanner;
public class Dicision {
    public static boolean validation(String d){
        while(true){
            if(d.equals("Y")||d.equals("y")){
                return true;
            }
            else if(d.equals("N")||d.equals("n")){
                return false;
            }
            else{
                System.out.println("Please enter Y/N: ");
                String d1=input(); 
                boolean r1=validation(d1);
                return r1;
            }
        }
    }
    public static String input(){
        Scanner input = new Scanner(System.in);
        String d=input.nextLine();
        return d;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the food advisor!");
        System.out.println("We would help you make decisions on what food to eat next.");
        System.out.println("Are you healthy and away from diseases?(Y/N)");
        String d1=input();
        boolean r1=validation(d1);
        System.out.println("Would you like to eat cheap food or expensive food?(Y/N)");
        String d2=input();
        boolean r2=validation(d2);
        System.out.println("Would you like to eat ?(Y/N)");
        String d3=input();
        boolean r3=validation(d3);
        System.out.println("Are you healthy and away from diseases?(Y/N)");
        String d4=input();
        boolean r4=validation(d4);
        
    }
}