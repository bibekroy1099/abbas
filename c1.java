package medium;

import java.util.*;
class c1{
  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		String x=new String("abc");
		String y=new String("abc");
		String z=new String("abc");
		System.out.println(x.equals(y));         //returns true
		System.out.println(y.equals(x));         //symmetric
		System.out.println(y.equals(z));        //transitive  *x.y = true, y.z=true then x.z=true*
        System.out.println(x.equals(z)); 		
		System.out.println(x.equals(null));      //x.null must return false
    }
}