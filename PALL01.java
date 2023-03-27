// https://www.codechef.com/problems/PALL01
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
		    int n = s.nextInt();
		    int rev =0;
		    int rn = n;
		    while(n>0){
		        int temp = n%10;
		        rev = (rev*10) + temp;
		        n = n/10;
		    }
		    if(rev == rn){
		        System.out.println("wins");
		    }else{
		        System.out.println("loses");
		    }
		}
	}
}
