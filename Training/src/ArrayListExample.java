import java.util.*;  
class TestCollection1{  
 public static void main(String args[]){  
   
  ArrayList<String> al=new ArrayList<String>();//creating arraylist  
  al.add("Ravi");//adding object in arraylist  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
 
  System.out.println("Printing zero"+al.get(0));
  System.out.println(al.size());
  
  System.out.println(al.indexOf("Vijay"));
  
  Iterator itr=al.iterator();//getting Iterator from arraylist to traverse elements  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  