import java.util.*;


class java_vadlachary2002_WilliamButchersMission
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan= new Scanner(System.in);
		int testcases=scan.nextInt();
		while(testcases-- >0){
		    int n=scan.nextInt();// no of hexadecimal character 
		    String[] s= new String[n];
		    for(int i=0;i<n;i++){
		        s[i]=scan.next();
		    }
		    System.out.println(decode(s));
		    
		}
	}
	public static String decode(String[] s){
		String res="";
		for(int i=0;i<s.length;i++){
		    int x=Integer.parseInt(s[i],16);//inbuilt function in java can be used to convert hexadecimal to decimal
		    res+=(char)x;
		}
		return res;
    	}
}
