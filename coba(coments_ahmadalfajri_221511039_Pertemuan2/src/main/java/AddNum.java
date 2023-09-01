import java.io.*;
/* <h1>add to number</h1>
 * the addnum program implements an application that
 * simply adds two given integer numbers and prints
 * the output on the screen
 * <p>
 * <b>Note:</b>giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 */

/**
 *
 * @author ahmad al fajri
 */
public class AddNum {
    
    
    
    public int addNum(int numA, int numB){
        return numA + numB;
    }
   public static void main(String args[]) throws IOException{
       
        AddNum obj = new AddNum();
        int sum = obj.addNum(10,20);
        
        System.out.println("sum of 10 and 20 is :" +sum);
    }
   
    
}
