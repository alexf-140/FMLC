import java.util.*;
public class SubstractionTwoIntegers{
    public static int subs(int x, int y){
         int result = x + (~y) + 1;

         return result;
    }
    public static void main(String[] args){
        System.out.println(subs(1954, 1548));
    }
}