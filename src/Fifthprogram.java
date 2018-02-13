//Find common elements between two arrays.

public class Fifthprogram {
    private void common(){
        int a[]={1,2,3,4,5,6,7};
        int b[]={1,4,9,8,66,5,7};
        System.out.print("common elements are: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.print(a[i]+", ");
                }
            }
        }

    }

    public static void main(String[] args) {
        Fifthprogram fp=new Fifthprogram();
        fp.common();
    }
}
