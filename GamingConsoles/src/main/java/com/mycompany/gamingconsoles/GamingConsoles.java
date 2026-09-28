/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gamingconsoles;

/**
 *
 * @author emeris
 */
public class GamingConsoles {

    public static void main(String[] args) {

        int[][] arrSpeed = {{1000, 2000, 3000}, {2000, 3000, 4000}, {1500, 1100, 1200}};

        System.out.println("-------------------------------------------");
        System.out.println("Gaming Console report");
        System.out.println("-------------------------------------------");
        System.out.println("  " + "PS5" + "   " + "XBOX" + "   " + "SWITCH");
        for (int i = 0; i < 3; i++) {
            switch (i ) {
                case 1:
                    System.out.println("Cape Town");
                    break;
                case 2:
                    System.out.println("Port Elizabeth");
                    break;
                case 3:
                    System.out.println("Pretoria");
                    break;
            }

            for (int j = 0; j < 3; j++) {
                System.out.print("  " + arrSpeed[i][j] + "  ");

            }
            System.out.print("Pretoria");
        }
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("Console sales total for each city");
        System.out.println("----------------------------------------");
        String highest = "";
        int highestnum = 0;
        for (int k = 0; k < 3; k++) {

           int count = 0;
            for (int h = 0; h < 3; h++) {
                
                count = count +  arrSpeed[k][h];
                if (highestnum < count) {

                   switch (k) {
                        case 1:
                            highest = "Cape Town";
                            break;
                        case 2:
                            highest = "Port Elizabeth";
                            break;
                        case 3:
                            highest = "Pretoria";
                            break;
                    } 
                   
                }

            }
            switch (k + 1) {
                case 1:
                    System.out.println("Cape Town" + "  " + count);
                    break;
                case 2:
                    System.out.println("Port Elizabeth" + "  " + count);
                    break;
                case 3:
                    System.out.println("Pretoria" + "  " + count);
                    break;

            }

        }
        System.out.println("Country with most sales: " +   highest );
    }

}
