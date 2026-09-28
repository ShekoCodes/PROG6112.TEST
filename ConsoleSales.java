package com.mycompany.runapplication;

/**
 *
 * @author nna kopa
 */

public class ConsoleSales extends Consoles 
{

    // Constructor passing parameters to superclass constructor
    public ConsoleSales(String consoleType, String store, int totalSales) 
    {
        super(consoleType, store, totalSales);
    }

    // Print the formatted report matching the sample output
    public void printReport() 
    {
        System.out.println("\nCONSOLE SALES REPORT");
        System.out.println("******************************************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}