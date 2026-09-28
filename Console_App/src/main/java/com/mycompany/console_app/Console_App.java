/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.console_app;


import java.util.Scanner;
/**
 *
 * @author emeris
 */
public class Console_App {

    public static void main(String[] args) {
        
        
        System.out.println("Select the beverage type");
        System.out.println("1) PS5");
        System.out.println("2) Xbox");
        System.out.println("3) Switch");
             Scanner scanner = new Scanner(System.in);
        int awnser = Integer.parseInt(scanner.nextLine());
        String consoleName = "";
        switch (awnser) {
                        case 1:
                            consoleName = "PS5";
                            break;
                        case 2:
                            consoleName = "Xbox";
                            break;
                        case 3:
                            consoleName = "Switch";
                            break;
                    } 
        
        System.out.println("Enter the Store: ");
        String Storename = scanner.nextLine();
        System.out.println("Enter the total sales of ps5 consoles for " + Storename + ": ");
        int totalSales = Integer.parseInt(scanner.nextLine());
        
  
         //ConsoleSales  consoles1 = new ConsoleSales (consoleName, Storename, totalSales);
        Consoles consoles = new Consoles(consoleName, Storename);
            consoles.setTotalSales(totalSales);
          consoles.printReport();
          
       
    }
}
