// https://www.codechef.com/problems/GENE01
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		    char p1 = s.next().charAt(0);
		    char p2 = s.next().charAt(0);
		    if(p1=='R' || p2=='R'){
		        System.out.println('R');
		    }else if(p1=='B' || p2=='B'){
		        System.out.println('B');
		    }else{
		        System.out.println('G');
		    }
	}
}
