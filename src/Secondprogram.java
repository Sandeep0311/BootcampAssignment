public class Secondprogram {
    String s= " sandeep said sandeep is my name ...only name";
    private void occurance(){
        int count=0;
        int  i,j;
        String []words=s.split(" ");
        for(String w: words){
            //System.out.println(w);
        }
        for(i=0; i<words.length;i++){
            for(j=1; j<words.length;j++){
                if(words[j]==words[i]){
                    count++;
                }
                System.out.println(words[j] +" "+ count);
            }

            count=0;

        }


    }
    public static void main(String[] args) {
    Secondprogram s=new Secondprogram();
        s.occurance();


    }
}
