import java.util.Scanner;
public class Dicision {
    public static boolean validation1(String d){
        while(true){
            if(d=="Y"||d=="y"){
                return true;
            }
            else if(d=="N"||d=="n"){
                return false;
            }
            else{
                System.out.println("Please enter Y/N: ");
                String d1=input(); 
                boolean r=validation1(d1);
                return r;
            }
        }
    }
    public static String input(){
        Scanner input = new Scanner(System.in);
        String d=input.nextLine();
        return d;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the weekend advisor!");
        System.out.println("We would help you make decisions on what to do this weekend.");
        System.out.println("Would you cook at home tonight?(Y/N)");
        String d1=input();
        boolean r1=validation1(d1);

        
    }
}