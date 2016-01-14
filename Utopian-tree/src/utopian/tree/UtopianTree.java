/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utopian.tree;

/**
 *
 * @author ekozi
 */
import java.util.Scanner;
public class UtopianTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int height=1;
        int []arr = new int [t];
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            arr[a0]=n;
        }
       
            
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                System.out.println(1);
            if(arr[i]==1)
                System.out.println(2);
            else{
                if(arr[i]%2==0)
                {
                    for(int j=0;j<arr[i]/2;j++){
                        height*=2;
                        height+=1;
                    }
                    System.out.println(height);
                    height=1;
                }
                else{
                    for(int x=0;x<arr[i];x++){
                        if(x%2==0)
                            height*=2;
                        else
                            height+=1;
                    }
                    System.out.println(height);
                    height=1;
                }
            }
        }
    }
}
