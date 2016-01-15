/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dequee;

/**
 *
 * @author ekozi
 */
import java.util.*;
import java.util.Scanner;
public class Dequee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
         
            int n = in.nextInt();
            int m = in.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                list.add(num);
            }
            Map<Integer,List<Integer>> map = new TreeMap<>();
            int difference = n-m+1;
            int j =0;
           List<Integer> dummy = new ArrayList<Integer>();
           
            for(int i=0;i<difference;i++){
             
               
                for(j=i ;j<m;){
                
                    dummy.add(list.get(j));
                    j++;
                }
              
                m++;
               
              
               
                map.put(i, dummy);
                
                dummy = new ArrayList<Integer>();
            
        }   
          
         Map<Integer,Integer> compar= new HashMap<Integer,Integer>();
         int counter=0;
           int max=0;
          for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()){
            HashSet<Integer> set = new HashSet<>(entry.getValue());
           if(max<set.size())
               max=set.size();
        }
          System.out.println(max);
          
       
        
   
                
    
}
}
