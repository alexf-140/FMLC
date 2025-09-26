import java.util.*;
import java.awt.*;
import java.util.scanner;
public class App{
           
    public static void main(String[] args){
       Scanner x = new Scanner(System.in);
        System.out.println("enter first number pls");
       int n1 = x.nextInt();
       System.out.println("enter second number pls");
       int n2 = x.nextInt();
       System.out.println("choose the operation you need to be done");
       String operation = x.next();
       int result;
       if(operation.equals( "+")){
        result =  n1 +n2;
       }
       else if(operation.equals( "-")){
        result = n1 - n2;
       }
       else if (operation.equals( "*")){
        result = n1 * n2;
       }
       else if (operation.equals( "/")){
        result = n1 / n2;
       }
       else{
        System.out.println("wrong operation");
        return;
       }
    System.out.println("The result: " + result);   
    }
}