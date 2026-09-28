/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author nna kopa
 */

public class GamingConsoleReport 
{

    public static void main(String[] args) 
    {
        // Single-dimensional arrays for cities and consoles
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Two-dimensional array representing sales data: [City][Console]
        int[][] salesData = {{1000, 2000, 3000}, {2000, 3000, 4000}, {1500, 1100, 1200}};

        // Print Main Report Table
        System.out.println("GAMING CONSOLE REPORT");
        
        // Print column headers
        System.out.printf("%-18s", "");
        
        for (String console : consoles) 
        {
            System.out.printf("%-12s", console);
        }
        
        System.out.println();

        // Print rows of city sales data
        for (int i = 0; i < cities.length; i++) 
        {
            System.out.printf("%-18s", cities[i]);
            for (int j = 0; j < consoles.length; j++) 
            {
                System.out.printf("%-12d", salesData[i][j]);
            }
            
            System.out.println();
        }

        // Calculate total sales for each city and determine city with highest sales
        int[] totalCities= new int[cities.length];
        int maxSales = -1;
        String topCity = "";
        
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        
        for (int i = 0; i < cities.length; i++) 
        {
            int currentCityTotal = 0;
            
            for (int j = 0; j < consoles.length; j++) 
            {
                currentCityTotal += salesData[i][j];
            }
            totalCities[i] = currentCityTotal;

            // Check for city with the most sales
            if (currentCityTotal > maxSales) 
            {
                maxSales = currentCityTotal;
                topCity = cities[i];
            }

            System.out.printf("%-18s %d%n", cities[i], currentCityTotal);
        }

        // Print the city with the most sales
    
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        
    }
}