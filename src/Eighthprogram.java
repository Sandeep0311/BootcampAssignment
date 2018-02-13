//Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string
// using String Buffer.
import java.lang.String;

public class Eighthprogram {

    private void reverse() {
        String str = "Sandeep Raj";
        StringBuffer sb = new StringBuffer(str);
        System.out.println("original string: "+str);
        System.out.println("reverse: "+sb.reverse());
        System.out.println("after remove: "+sb.delete(4,10));
    }
    public static void main(String[] args) {
        Eighthprogram ep=new Eighthprogram();
        ep.reverse();

    }
}
