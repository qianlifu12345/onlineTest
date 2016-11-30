package project3;
import java.util.ArrayList;  
import java.util.Iterator;
import java.util.List;  
public class Combination {  
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
  
            List s=new ArrayList();  
            List reverseString=new ArrayList();
            String input="abc";
            char[] inputArray = input.toCharArray();
            for (int i = 0; i < inputArray.length; i++) {
				s.add(inputArray[i]);
			}
            combination(s,reverseString);  
           
  
    }  
    public static void combination(List s,List reverseString){  
          if(s.size()==1)  
          {
        	  reverseString.add(s.get(0));  
              System.out.println(reverseString.toString());  
              reverseString.remove(reverseString.size()-1);        
          }else{  
        	  //get the every element pair with each other 
              for(int i=0;i<s.size();i++){  
                  reverseString.add(s.get(i));   
                  List temp=new ArrayList(); 
                  for (int j = 0; j < s.size(); j++) {
					temp.add(s.get(j));
				}
                  temp.remove(i); 
                  //recursive invoke the combination
                  combination(temp,reverseString);  
                  reverseString.remove(reverseString.size()-1);         
              }  
          }                     
     }  
}  