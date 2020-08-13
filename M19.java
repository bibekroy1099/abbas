package medium;

import java.util.ArrayList;
import java.util.Arrays;

class m19 
{ 
  public static void main(String args[]) 
  { 
  
    // create a list of integers 
   ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(10000,60000,30000,70000,50000));
         
  numberList.stream()
    .filter(i -> i>=50000)
    .forEach(System.out::println);
	
    
  } 
} 