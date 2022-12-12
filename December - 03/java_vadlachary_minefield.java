import java.util.Scanner;

class SolutionDec3{
    public void makefield(char[][] minefield){
        for(int i=0;i<minefield.length;i++) {
            for (int j = 0; j < minefield[i].length; j++) {
                if (minefield[i][j] == '#') {
                    increment(minefield, i, j);
                }
            }
        }
    }
    public void inc(char[][] mf,int i,int j){
        if(i>=0  && j>=0 && i<mf.length && j<mf[0].length) {
            if (mf[i ][j] == '-') {
                mf[i ][j]= '1';
            } else if(mf[i][j]!='#'){
                mf[i][j]++;
            }
        }
    }
    public void increment(char[][] mf,int i,int j){
        inc(mf,i-1,j-1);
        inc(mf,i-1,j);
        inc(mf,i-1,j+1);
        inc(mf,i,j-1);
        inc(mf,i,j+1);
        inc(mf,i+1,j-1);
        inc(mf,i+1,j);
        inc(mf,i+1,j+1);
    }
}
public class java_vadlachary_minefield {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        char[][] minefield = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = scan.next();
            for (int j = 0; j < m; j++) {
                minefield[i][j] = line.charAt(j);
            }
        }
        SolutionDec3 sol= new SolutionDec3();
        sol.makefield(minefield);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(minefield[i][j] + " ");
            }
            System.out.println();
        }
    }
}
