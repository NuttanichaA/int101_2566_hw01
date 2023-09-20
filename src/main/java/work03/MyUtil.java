/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work03;

/**
 *
 * @author User
 */
public class MyUtil {
    
    /*method named "calculateBMI" in "MyUtil" class. 
       This method receives two parameters of type "double" 
       named "weight" and "height" and it returns a "double" 
       which is the result of "weight" divided by "height"^2.*/
    public static double calculateBMI(double weight, double height){
        return weight/(Math.pow(height, 2));
    }
    
    /*Create a method named "average" in "MyUtil" class.
       This method receives three parameters of type "int" named
       "v1", "v2", "v3" and it returns a "double" which is 
       the average values of the three parameters.*/
    public static double average(int v1, int v2, int v3){
        return (v1+v2+v3)/3;
    }
    
}
