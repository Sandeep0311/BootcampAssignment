import java.text.DecimalFormat;

public class Fourthprogram {
    private void percentage(){
        String str="aAbBcCddE123@#%*";
        int length=str.length();
        System.out.println("length of string "+length);
        int uc=0;
        int lc=0;
        int dg=0;
        int others=0;
        for(int i=0; i<length;i++){
            char ch=str.charAt(i);
            if (Character.isUpperCase(ch)) {
                uc++;

            }
            else if (Character.isLowerCase(ch)) {
               lc++;

            }
            else if (Character.isDigit(ch)) {
               dg++;

            }
            else {
                others++;

            }
        }

        double ucp=(uc*100)/length;
        double lcp=(lc*100)/length;
        double dgp=(dg*100)/length;
        double othersp=(others*100)/length;

        DecimalFormat df=new DecimalFormat("#.00");
        System.out.println(str+"  =100%");
        System.out.println("UpperCase letters are: "+df.format(ucp)+"%");
        System.out.println("LowerCase letters are: "+df.format(lcp)+"%");
        System.out.println("digits are: "+df.format(dgp)+"%");
        System.out.println("other special characters are: "+df.format(othersp)+"%");




    }
    public static void main(String[] args) {
    Fourthprogram fp=new Fourthprogram();
    fp.percentage();
    }
}
