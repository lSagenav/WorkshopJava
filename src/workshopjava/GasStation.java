/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopjava;

/**
 *
 * @author Scorpion
 */
public class GasStation {
    
    public String name;
    public int size;
    private String boss;
    protected String typeOfFuel;
    private int grossPrice;

    public GasStation(String name, int size, String boss, String typeOfFuel, int grossPrice) {
        this.name = name;
        this.size = size;
        this.boss = boss;
        this.typeOfFuel = typeOfFuel;
        this.grossPrice = grossPrice;
    }
    
    

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getBoss() {
        return boss;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public int getGrossPrice() {
        return grossPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public void setGrossPrice(int grossPrice) {
        this.grossPrice = grossPrice;
    }
    
    
    
}
