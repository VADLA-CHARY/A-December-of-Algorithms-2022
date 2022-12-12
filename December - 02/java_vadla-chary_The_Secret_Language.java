import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan= new Scanner(System.in);
		
		String string= scan.next();
		int l=string.length();
		
		StringBuilder sb= new StringBuilder(string);
		sb.delete(l-2,l);
		
		String prefix=sb.substring(l-4,l-2);
		sb.delete(l-4,l-2);
		
		StringBuilder xy=new StringBuilder(prefix);
		xy.append(sb);
		
		System.out.println(xy);
	
	}
}
