//Write a single program for following operation using overloading
// A) Adding 2 integer number
// B) Adding 2 double
// C) Multipling 2 float
// d) Multipling 2 int
// E) concate 2 string
// F) Concate 3 String

public class Eleventhprogram {
    private static int add(int a, int b){
        return a+b;
    }
    private static double add(double a, double b){
        return a+b;
    }
    private static float mul(float a, float b){
        return a*b;
    }
    private static int mul(int a, int b){
        return a*b;
    }
    private static String concate(String a, String b){
        return a+b;
    }
    private static String concate(String a, String b, String c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(add(2.1,3.1));
        System.out.println(mul(1,5));
        System.out.println(mul(0.2f,3.1f));
        System.out.println(concate("sandeep","raj"));
        System.out.println(concate("sandeep", "hans", "raj"));
    }
}
