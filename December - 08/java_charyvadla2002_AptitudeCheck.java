import java.util.Scanner;

public class java_charyvadla2002_AptitudeCheck {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Input: ");
        String input=scan.next();
        StringBuilder output= new StringBuilder(input);
        for(int i=0;i<input.length()-1;i+=2){
            char x=output.charAt(i);
            output.setCharAt(i,output.charAt(i+1));
            output.setCharAt(i+1,x);
        }
        System.out.println("Output: "+output);
    }
}
