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
    public static String validation2(String d){
        while(true){
            if(d=="A"||d=="a"||d=="B"||d=="b"||d=="C"||d=="c"||d=="D"||d=="d"){
                return d;
            }
            else{
                System.out.println("Please enter A/B/C/D: ");
                String d1=input(); 
                String r=validation2(d1);
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
        System.out.println("What is your vibe this weekend? (A/B/C/D) \nA. Chill \nB. Social \nC. Productive \nD. IDK");
        String d2=input();
        String r2=validation2(d2);
        
    }
}