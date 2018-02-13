public class Firstprogram {
    String s1="sandeep";
    private void replace(){
        System.out.println("old string: "+s1);
    String s2= s1.replace(s1,"naman");
        System.out.println("replaced with: "+s2);
    }

    public static void main(String[] args) {

        new Firstprogram().replace();
    }
}
