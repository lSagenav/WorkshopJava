/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopjava;

/**
 *
 * @author Scorpion
 */
public class SuperMarket {
    
    public String name;
    private String inventory;
    protected int homeemployees; 
    public int openingHours;
    public int address;
    private String warehouse;

    public SuperMarket(String name, String inventory, int homeemployees, int openingHours, int address, String warehouse) {
        this.name = name;
        this.inventory = inventory;
        this.homeemployees = homeemployees;
        this.openingHours = openingHours;
        this.address = address;
        this.warehouse = warehouse;
    }

    public String getName() {
        return name;
    }

    public String getInventory() {
        return inventory;
    }

    public int getHomeemployees() {
        return homeemployees;
    }

    public int getOpeningHours() {
        return openingHours;
    }

    public int getAddress() {
        return address;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public void setHomeemployees(int homeemployees) {
        this.homeemployees = homeemployees;
    }

    public void setOpeningHours(int openingHours) {
        this.openingHours = openingHours;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }
    
    
    
    

}
    
       
    