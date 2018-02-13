

public class Secondprogram {
    String s= " sandeep said sandeep is my name name only name";
    int  i,j;
    int count=1;
    int flag=0;
    private void occurance(){

        String []words=s.split(" ");
        for(i=0; i<words.length;i++){
            count=1;
            for(j=i+1; j<words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                    flag=1;

                    //System.out.println(words[i]);
                    if(flag ==1){
                        System.out.println(words[j]+" "+count);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
    Secondprogram sp=new Secondprogram();
        sp.occurance();
    }
}
