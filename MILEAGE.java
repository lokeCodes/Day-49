// https://www.codechef.com/problems/MILEAGE
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
		    float n = s.nextInt();
		    float cp = s.nextInt();
		    float cd = s.nextInt();
		    float pd = s.nextInt();
		    float dd = s.nextInt();
		    float p1 = n/pd ;
		    float d1 = n/dd ;
		    float p2 = p1*cp;
		    float d2 = d1*cd;
		    if(p2==d2){
		        System.out.println("ANY");
		    }else if(p2>d2){
		        System.out.println("DIESEL");
		    }else{
		        System.out.println("PETROL");
		    }
		    
		}
	}
}
