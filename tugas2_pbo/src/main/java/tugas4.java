/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmad al fajri
 */
public class tugas4 {
    static short methodOne(long l)
 {
 int i = (int) l;
 return (short)i; 
 }
 public static final double CM_PER_INCH = 2.54; 
 public static void main(String[] args) {
 double paperWidth = 8.5; 
 double paperHeight = 11; 
 System.out.println("Paper size in centimeters: " + paperWidth *
 CM_PER_INCH + " by " + paperHeight * CM_PER_INCH); 
 }
}
