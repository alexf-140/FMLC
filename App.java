import java.util.*;
import java.awt.*;

public class App{
    
    }
    public static void maskify(String a){
        int masklength = a.length();
        String maskpart = "#".repeat(masklength - 4);
        String unmaskedPart = a.substring(a.length()-4);
        String masked = maskpart + unmaskedPart;
            
        System.out.println(maskpart);
        System.out.println(unmaskedPart);
        System.out.println(masked);
    }
    public static void main(String[] args){
       
       maskify("alid fullaout");
    }
