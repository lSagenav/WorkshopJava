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
// Variables nativas de la clase 
    public String name;
    private float averageWeight;
    public ArrayList<String>  colors = new ArrayList();
    
    
// aqui contrui los contructores de las variables de la clase
    public Fruit(String name, float averageWeight) {
        this.name = name;
        this.averageWeight = averageWeight;
        
    }
    // 
    // en esta parte inicie los get y set de las variables de la clase 
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


    
    

    
