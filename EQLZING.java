// https://www.codechef.com/problems/EQLZING
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int a = s.nextInt();
		    int b = s.nextInt();
		    if((a-b)%2==0){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}
}
