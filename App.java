import java.util.*;

public class App{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x =0 ,y = 0;
        System.out.println("Enter the first number: ");
        boolean validInput = false;
        while(!validInput){
        if(input.hasNextInt()){
              x = input.nextInt();
              validInput = true;
        }
        else{
            System.err.println("Error, only integers are allowed !");
            input.next();
        }
    }
        System.out.println("Enter the second number: ");
        validInput = false;
        while(!validInput){
        if(input.hasNextInt()){
              y = input.nextInt();
              validInput = true;
        }
        else{
            System.err.println("Error, only integers are allowed !");
            input.next();
        }
    }
        input.close();
        System.out.println("The sum : " + add(x,y));
        
    }
    public static int add(int x, int y){
        return x + y;
    }
}