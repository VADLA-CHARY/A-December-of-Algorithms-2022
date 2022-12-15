import java.util.Scanner;

public class java_charyvadla2002_MASON {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int price=scan.nextInt();
        int income=50000;
        int sum=0;
        for(int i=1;i<=31;i++) {
            if (i % 3 == 0 &&  i % 5 != 0) {
                sum += 2 * (price + 3);
            } else if (i % 5 == 0 && i % 3 != 0) {
                sum += 2 * (price - 2);
            }
            else if(i % 3 == 0 && i % 5 == 0){
                sum+= 2*(price+1);
            }
            else {
                sum += 2 * price;
            }

        }
        System.out.println("Expenditure="+sum+"\n");
        if(income/10<sum) {
            System.out.println("EXPENDITURE EXCEEDING LIMIT");
        }else{
            System.out.println("EXPENDITURE WITHIN LIMIT");
        }
    }
}
