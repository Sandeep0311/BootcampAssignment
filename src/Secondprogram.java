public class Secondprogram {
    String s= " sandeep said sandeep is my name ...only name";
    private void occurance(){
        int count=0;
        String []words=s.split(" ");
        for(String w: words){
            System.out.println(w);
        }
        for(int i=0; i<words.length;i++){
            for(int j=1; j<words.length;j++){
                if(words[i]==words[j]){

                    System.out.println(words[j] +" "+ count++);
                }

            }

        }


    }
    public static void main(String[] args) {
    Secondprogram s=new Secondprogram();
        s.occurance();


    }
}
