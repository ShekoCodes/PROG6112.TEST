package com.mycompany.runapplication;

/**
 *
 * @author nna kopa
 */

import java.util.Scanner;

public class RunApplication 
{

    public static void main(String[] args) 
    {
        // Declare and initialising 
        
        Scanner scanner = new Scanner(System.in);
        String store,consoleType;
        int totalSales,choice;

        // Display console selection menu to the user 
        
        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");

        // Prompting the user 
        
        System.out.print("Enter choice: ");
        choice = Integer.parseInt(scanner.nextLine().trim());

        consoleType = " ";
        
        switch (choice) 
        {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
            default:
                consoleType = "UNKNOWN";
                break;
        }

        // Prompt the user inputs for store name and total sales
        
        System.out.print("Enter the store name: ");
        store = scanner.nextLine().trim();

        System.out.print("Enter the total sales of " + consoleType + " consoles for " + store + ": ");
        totalSales = Integer.parseInt(scanner.nextLine().trim());

        // Instantiate ConsoleSales object and then print report
        
        ConsoleSales salesReport = new ConsoleSales(consoleType, store, totalSales);
        salesReport.printReport();

        scanner.close();
    }
}
