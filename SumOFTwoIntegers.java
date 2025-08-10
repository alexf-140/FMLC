import java.util.*;
public class SumOFTwoIntegers {
    public static int add(int x, int y){
        int carry = x & y;
        x = x ^ y;
        y = carry << 1;
        return x;
    }
    public static void main(String[] args){
        int result = add(20, 1);
        System.out.println(result);
    }
}
