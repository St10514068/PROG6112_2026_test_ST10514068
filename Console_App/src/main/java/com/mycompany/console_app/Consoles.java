/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.console_app;

/**
 *
 * @author emeris
 */
public class Consoles {

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }
    private String DeviceType;
      private String Storename;
     protected int totalSales;

    public Consoles(String DeviceType, String Storename) {
        this.DeviceType = DeviceType;
        this.Storename = Storename;
      
    }

    
    public class ConsoleSales extends Consoles  {
    int totalSales;
    // Child Constructor
  ConsoleSales (String DeviceType ,String Storename) {
        super(DeviceType , Storename);
        this.totalSales = totalSales;
    }
}
 

    public String getDeviceType() {
        return DeviceType;
    }

    public String getStorename() {
        return Storename;
    }

    public int getTotalSales() {
        return totalSales;
    }
      
    public void printReport(){
    
        System.out.println("Console sales report");   
        System.out.println("********************");
        System.out.println("Console type: " +  DeviceType);
        System.out.println("Store: " + Storename );
        System.out.println("Total sales: " + totalSales );
        
    }
    
}
