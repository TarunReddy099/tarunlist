package com.collection.coll;

import java.util.ArrayList;
import java.util.Scanner;

class collections{
collections(){
	ArrayList<Integer> arrlist=new ArrayList<Integer>();  
      arrlist.add(1);
      arrlist.add(2);
      arrlist.add(3);
      arrlist.add(4);
      arrlist.add(5);
      arrlist.add(6);
      arrlist.add(7);
      arrlist.add(8);
      arrlist.add(9);
      arrlist.add(10);
      
  

      System.out.println(arrlist);
      
     System.out.println("Select any one of the operation\n1.Add\n2.Delete");
     Scanner sc = new Scanner(System.in);
     Integer scan = sc.nextInt();
     
  if(scan==1) {
	  add(arrlist);
	  System.out.println(arrlist);
	  
  }else if(scan==2) {
	  delete(arrlist);
	  System.out.println(arrlist);
	  
  }else {
	  System.out.println("Invalid operator selected");
  }
 
  
     
 

}

 private ArrayList<Integer> delete(ArrayList<Integer> arrlist) {
	 System.out.println("Enter the position of the  element to be deleted");
	  Scanner s = new Scanner(System.in);
	  Integer scan1 = s.nextInt();
	  arrlist.remove(scan1);
	  return arrlist;
}

 private ArrayList<Integer> add(ArrayList<Integer> arrlist) {
	System.out.println("How many elements do you want to add");
	  Scanner scc = new Scanner(System.in);
	     Integer sss = scc.nextInt();
	     int t;
	     for(t=1;t<=sss;t++) {
	  System.out.println("Enter the value of the new element");
	  Scanner s = new Scanner(System.in);
	  Integer scan1 = s.nextInt();
	  arrlist.add(scan1);}
	  return arrlist;
	
}
}
