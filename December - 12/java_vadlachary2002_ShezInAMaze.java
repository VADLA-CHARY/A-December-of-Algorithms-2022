import java.util.ArrayList;
import java.util.Collections;

public class java_vadlachary2002_ShezInAMaze {
    public static ArrayList<Integer> list;
    public static int min=Integer.MAX_VALUE;
    public static void main(String[] args) {
        int[][] grid={ {9,4,9,9}, {6,7,6,4}, {8,3,3,7}, {7,4,9,10} };
        solve(grid,grid.length-1,grid[0].length-1,new ArrayList<Integer>() ,0);
        Collections.reverse(list);
        System.out.println(list+" "+min);
    }
    public static void solve(int[][] grid,int i,int j,ArrayList<Integer> a,int val){
        if(i<0 || j<0){
            return ;
        }
        if(i==0 && j==0){
            if(min>val+grid[i][j]) {
                min = val + grid[i][j];
                a.add(grid[i][j]);
                list = new ArrayList<>(a);
                a.remove(a.size()-1);
            }
            return ;
        }
        a.add(grid[i][j]);
        solve(grid,i,j-1,a,val+grid[i][j]);
        solve(grid,i-1,j,a,val+grid[i][j]);
        a.remove(a.size()-1);

    }
}
