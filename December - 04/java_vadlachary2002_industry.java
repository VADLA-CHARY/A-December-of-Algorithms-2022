import java.util.Scanner;

public class java_vadlachary2002_industry {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        int[] array= new int[n];
        for(int i=0;i<n;i++){
            array[i]=scan.nextInt();
        }
        int sum=0,pi=0,pj=0,max=0;
        for(int i=0;i<n;i++){
            sum+=array[i];
            if(sum<0){
                sum=0;
                pi=i+1;
            }
            if(sum>=max){
                max=sum;
                pj=i;
            }

        }
        System.out.println("Profit Value: "+max);
        System.out.println("Proposed days to sell: Day: "+(pi+1)+" to Day: "+(pj+1));
        System.out.print("Stock market Change Values: {");
        for(int i=pi;i<=pj;i++){
            System.out.print(array[i]);
            if(i!=pj){
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

}
