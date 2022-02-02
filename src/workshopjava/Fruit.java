/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopjava;

import java.util.ArrayList;

/**
 *
 * @author Scorpion
 */
public class Fruit {

    public String name;
    private float averageWeight;
    public ArrayList<String>  colors = new ArrayList();

    public Fruit(String name, float averageWeight) {
        this.name = name;
        this.averageWeight = averageWeight;
        
    }

    public String getName() {
        return name;
    }

    public float getAverageWeight() {
        return averageWeight;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}


    
    

    
