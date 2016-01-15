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
             
               
                for( ;j<m;){
                    dummy.add(list.get(j));
                    j++;
                }
              
                m++;
                System.out.println(difference);
                j=i;
                map.put(i, dummy);
                if(dummy.size()>0)
                    dummy.remove(0);
        
            
    }
            System.out.println(map);
   
                
    
}
}
