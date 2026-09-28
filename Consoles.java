package com.mycompany.runapplication;

/**
 *
 * @author nna kopa
 */

public abstract class Consoles implements IConsoles 
{
    // Encapsulating 
    private String consoleType;
    private String store;
    private int totalSales;

    // Constructor accepting console type, store name, and total sales
    public Consoles(String consoleType, String store, int totalSales) 
    {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // Getter methods required by IConsoles interface
    
    @Override
    public String getConsoleType() 
    {
        return consoleType;
    }

    @Override
    public String getStore() 
    {
        return store;
    }

    @Override
    public int getTotalSales() 
    {
        return totalSales;
    }
}