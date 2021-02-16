/*
 * This program prints all the even numbers from 0 to 100
 */
package assignment01;

/**
 *
 * @author jaani
 */
public class Assignment01 {
    
    public static void main(String[] args) {
        // Running loop to print all the even numbers from 0 to 100
        for (int i=0; i< 100; i++){
            
            if(i%2 ==0){
                System.out.println(i);
            }
        }     
    }
}
