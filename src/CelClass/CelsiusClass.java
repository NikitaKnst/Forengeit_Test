/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CelClass;

/**
 *
 * @author pupil
 */
public class CelsiusClass {
    
    //Из цельсия в форенгейт
     public double celsiusFarengeit(float celsius1, double Formula){
         
 return celsius1* (9.0 / 5.0) + 32;
 }
     //Обратное из форенгейта в цельсию
          public double ForengeitCelsius(float forengeit1, double Formula1){
             return (forengeit1-32)* (5.0 / 9.0); 
          }

}
