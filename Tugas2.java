/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author DeviKhanthi
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=5;
        for (int i=1; i<=n; i++){
            for (int d=1; d<=n; d++){
               if (i==1|| i == n || d == 1 || d==n){
                System.out.print("#");
               }
               else {
               System.out.print("*");
               }
               }
            System.out.println();
        }
    }
    
}
