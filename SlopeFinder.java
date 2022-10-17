import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nafea8846
 */
public class SlopeFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int x1 = 0;
    int x2 = 0;
    int y1 = 0;
    int y2 = 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                
    System.out.println("Enter value of x1");
    x1 = input.nextInt();
    
    System.out.println("Enter value of y1");
    y1 = input.nextInt();
    
    System.out.println("Enter value of x2");
    x2 = input.nextInt();
    
    System.out.println("Enter value of y2");
    y2 = input.nextInt();
    int FinalY = (y2-y1);
    int FinalX = (x2-x1);
    
    if (x1 == x2)
    {
    System.out.println("The slope is undefined.");
    }
    else
    {
        int m = FinalY/FinalX;
    System.out.println("The slope if the line is " + m);
    }
    }
    
}
