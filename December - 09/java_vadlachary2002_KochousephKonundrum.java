import java.util.HashMap;
import java.util.Scanner;

public class java_vadlachary2002_KochousephKonundrum {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        HashMap<Integer,String> hash = new HashMap<>();
        for(int i=0;i<n;i++){
            String x=scan.next();
            int len=x.length();
            if(!hash.containsKey(len)){
                hash.put(len,x);
            }
        }
        int max=-1,ckey=-1;
        for(int key:hash.keySet()){
            if(key%2==1 && max<key){
                ckey=key;
                max=key;
            }
        }
        if(ckey==-1){
            System.out.println("Better luck next time");
        }else{
            System.out.println("Output: "+hash.get(ckey));
        }

    }
}
