//Write a program to find the number of occurrences of the duplicate words in a string and print them ?

import java.util.Arrays;

public class Secondprogram {

    int  i,j;
    int count=1;
    int flag=0;
    private void occurance(){
        String s= "sandeep said sandeep is my name name only name";
        String []words=s.split(" ");
        for(String w: words)
        System.out.println(w);
        Arrays.sort(words);
//        String []words=s.split(" ");
        for(String w: words)
        System.out.println(w);
        //int[] c=new int[words.length]
        for(i=0; i<words.length;i++){
            if(i==words.length-1){
                System.out.println(words[i]+ " is "+ count+" times");

            }
            if(words[i].equals(words[i+1])){
             count++;
         }
         else{
             System.out.println(words[i]+ " is "+ count+" times");
             count=1;
         }
        }
    }
    public static void main(String[] args) {
    Secondprogram sp=new Secondprogram();
        sp.occurance();
    }
}
