//Write a program to read text file & print the content of file using String Builder.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Ninthprogram {
    private void readfile(String p){
        StringBuilder c=new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(p)))
        {

            String s;
            while ((s = br.readLine()) != null)
            {
                c.append(s).append("\n");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println(c);
        }

    }

    public static void main(String[] args) {
       Ninthprogram nt=new Ninthprogram();
       nt.readfile("/home/sandeep/output.txt");

    }
}
