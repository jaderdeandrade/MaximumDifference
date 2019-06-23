/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximumdifference;

/**
 *
 * @author Jader de Andrade
 */
public class MaximumDifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             MaximumDiff mxdif = new MaximumDiff(); 
             //passa os argumentos para o array
        int arr[] = {7,2,3,10,2,4,8,1}; 
        int size = arr.length; 
        System.out.println(mxdif.maxDiff(arr, size)); 
    }
    

    
}
