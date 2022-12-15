package December_algorithms;

import java.util.Scanner;

public class java_vadlachary2002_Playwithwords {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String vowel=new String("aeiou");
        int testcases=scan.nextInt();
        while(testcases-- >0){
            int len=scan.nextInt();
            String word=scan.next();
            int count=0,mcount=0;
            for(int i=0;i<word.length();i++){
                if(vowel.indexOf(word.charAt(i))==-1){
                    count++;
                }else{
                    mcount=Math.max(mcount,count);
                    count=0;
                }
            }
            mcount=Math.max(mcount,count);
            if(mcount>=4){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
