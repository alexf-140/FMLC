import java.util.*;
import java.awt.*;

public class App{
        
    public static int multiply(int x , int y){
    int result = 0 ;
    while(y != 0){
        if((y & 1) != 0){
            result += x;
        }
        x <<= 1;
        y >>= 1;
    } 
    return result;       
    }
    public static void main(String[] args){
       int result =  multiply(8,120);
       System.out.println(result);

    }
}