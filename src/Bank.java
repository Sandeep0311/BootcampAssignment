//Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific
// details like rateofinterest etc,print details of every banks.
class SBI{
    protected void getDetails(){
        System.out.println("SBI bank");
        System.out.println("rate of ineterest: 13%");
        System.out.println();
    }
}
class BOI{
    protected void getDetails(){
        System.out.println("BOI Bank");
        System.out.println("rate of interest: 12%");
        System.out.println();
    }
}
class ICICI{
    protected void getDetails(){
        System.out.println("ICICI Bank");
        System.out.println("rate of interest: 11.5%");
        System.out.println();
    }
}
public class Bank {
    protected void getDetails(){
        new SBI().getDetails();
        new BOI().getDetails();
        new ICICI().getDetails();
    }
    public static void main(String[] args) {
        new Bank().getDetails();
    }
}
