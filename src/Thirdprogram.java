import java.util.Scanner;

public class Thirdprogram {
    private void occurance(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.next();
        System.out.println("Enter char to find: ");
        char c=sc.next().charAt(0);
        String c1=System.console().readLine();//read from console*******
        System.out.println(c1);
        int l=s.length();
        int la=s.replace("a","").length();
        System.out.println(l);
        System.out.println("char a : "+ (l-la));
        occurance();
    }
    public static void main(String[] args) {
        Thirdprogram th=new Thirdprogram();
        th.occurance();

    }
}
