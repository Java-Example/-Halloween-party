import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Halloweenparty{

    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int no_of_testcase=s.nextInt();
		long no_cut;
		String maximum_no_pieces="";
		long dObj;
		long x,y;
		for(int i=0;i<no_of_testcase;i++)
		{
			no_cut=s.nextLong();
			x=no_cut/2;
			y=no_cut-x;
			dObj=x*y;
			maximum_no_pieces+=x*y+"\n";
		}
		System.out.println(maximum_no_pieces);
	}
}