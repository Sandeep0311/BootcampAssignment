//Write a program to display values of enums using a constructor & getPrice() method(Example display
// house & their prices ).

public class Tenthprogram {
    enum House{
        flats(25000),duplex(35000),builderflats(20000),Hig(19000),Mig(15000),Lig(10000);
        private int p;
        House(int p){
            this.p=p;
        }
        int getPrice(){
            return p;
        }
    }
    public class EnumExample {
        EnumExample(){
            System.out.println("House type Flats has value"+House.flats.values());
        }
    }
        public static void main(String[] args) {
            System.out.println("Price of houses are ");
            for(House h:House.values()){
// new House(25000,35000,20000,19000,15000,10000);
                System.out.println(
                        h + " costs " + h.getPrice() + " Rupees.");
            }
        }
    }


