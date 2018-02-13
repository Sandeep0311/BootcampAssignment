//
//Write a program to print your Firstname,LastName & age using static block,static method
// & static variable respectively

public class Seventhprogram {
    static{
        System.out.println("Sandeep");
    }
    private static void lastname(){
        System.out.println("Raj");
    }
    static int age=23;
    public static void main(String[] args) {
        lastname();

        System.out.println(age);
    }
}
