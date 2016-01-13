/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastack;

/**
 *
 * @author Egot Kozitski
 */
import java.util.Scanner;
public class JavaStack {

    /**
     * @param args the command line arguments
     */
    static String balanced = "{},[],()";
   static boolean isBalanced(String str){
      
       if(str.length()%2==0)
       {
             boolean flag =false;
         
             //check if they are separated
        
              String compare = String.valueOf(str.charAt(0))+String.valueOf(str.charAt(1));  
              for(String s : balanced.split(",")){
                  if(compare.equals(s)){
                    int left=0;
                    int right=1;
                    while(left<right){
                       String toCompare = String.valueOf(str.charAt(left))+String.valueOf(str.charAt(right));
                  
                    for(String z : balanced.split(","))
                        if(toCompare.equals(z))
                            return true;
                    left+=2;
                    right+=2;
                  }
              }
              
                }
            
           
            
           //nested check
           int leftEnd=0;
           int rightEnd = str.length()-1;
         
           while(leftEnd<rightEnd){
               String toCompare = String.valueOf(str.charAt(leftEnd))+String.valueOf(str.charAt(rightEnd));
            
               for(String s : balanced.split(","))
                   if(toCompare.equals(s)){
                       flag=true;
                   }
               leftEnd++;
               rightEnd--;
           }
           return flag;
         
       }
       if(str.length()%3==0)
           return false;
       for(String s : balanced.split(",")){
           if(str.equals(s))
               return true;
       }
       return false;
       
   }
   public static void main(String []argh)
   {
       
      Scanner sc = new Scanner(System.in);
     
       while (sc.hasNext()) {
         String input=sc.next();
         System.out.println(isBalanced(input));
      }
      
   }
    
}
