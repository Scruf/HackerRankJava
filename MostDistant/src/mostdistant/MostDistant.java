/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostdistant;

/**
 *
 * @author ekozi
 */

import java.util.*;
public class MostDistant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Map<Integer,List<String>> map = new TreeMap<>();
        for(int i=0;i<=t;i++){
           String coor = scan.nextLine();
           map.put(i, Arrays.asList(coor.split(" ")));
       
        }
        for(Map.Entry<Integer,List<String>>entry : map.entrySet()){
          List<Integer> list = new ArrayList<>();
        
        }
            
    }
    
}
