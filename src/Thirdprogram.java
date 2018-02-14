//Write a program to find the number of occurrences of a character in a string without using loop?
import java.util.Scanner;

public class Thirdprogram {
    private void occurance(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.next();
        System.out.println("Enter char to find: ");
        String c=sc.next();
       // String c1=System.console().readLine();//read from console*******
       // System.out.println(c1);
        int l=s.length();
        int la=s.replace(c,"").length();
        //System.out.println("total length: "+l);
        //System.out.println("char without "+la);
        System.out.println((l-la)+" times");
        occurance();
    }
    public static void main(String[] args) {
        Thirdprogram th=new Thirdprogram();
        th.occurance();

    }
}
