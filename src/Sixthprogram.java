//There is an array with every element repeated twice except one. Find that element?

import java.util.Arrays;

public class Sixthprogram {
    int flag=0;
    int i;
    private void find() {
    int[] a = {1, 6, 4, 4, 6, 6, 1,5};
    Arrays.sort(a);
    for (int v : a)
       System.out.print(v+", ");
        System.out.println();

    for (i = 0; i < a.length; i++) {
        if (a[i] == a[i + 1]) {
            continue;
        }
        if (a[i] != a[i + 1] && a[i] != a[i - 1]) {
             System.out.println("single digit is:  "+a[i]);
            break;
        }
    }

    }
    public static void main(String[] args) {
    Sixthprogram sp=new Sixthprogram();
    sp.find();
    }
}