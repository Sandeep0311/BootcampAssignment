//There is an array with every element repeated twice except one. Find that element?

public class Sixthprogram {
    int flag=0;
    int i,j;
    private void find(){
        int []a={1,1,2,2,3,3,4,6,6,};
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i]!=a[j]){
                 flag=1;
                 break;
                }
            }
            if(flag==1){
                System.out.println(a[j]);
            }

        }
    }
    public static void main(String[] args) {
    Sixthprogram sp=new Sixthprogram();
    sp.find();
    }
}
