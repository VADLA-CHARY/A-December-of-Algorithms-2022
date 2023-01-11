import java.util.Scanner;

public class java_vadlachary2002_MonkeyJump {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        char[] place={'_','~','_','~','_','_','~','_','_','~','_','~'};
        int[] jumps={2,2,1,1,1,1,2,1,1};

        if(place[0]=='~'){
            System.out.println("Score ="+0);
        }else{
            int v=jumps[0];
            int count=0;
            for(int  i=1;i<jumps.length;i++){
                if(place[v]=='~'){
                    break;
                }
                v+=jumps[i];
                count++;
            }
            System.out.println("Score ="+count);

        }

    }
}
