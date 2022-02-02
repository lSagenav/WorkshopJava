/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopjava;

import java.util.Date;

/**
 *
 * @author Scorpion
 */
public class Person {

    public String name;
    public String lasName1;
    public String lasName2;
    public Date dateBirth;
    public float height;

    public Person(String name, String lasName1, String lasName2, Date dateBirth, float height) {
        this.name = name;
        this.lasName1 = lasName1;
        this.lasName2 = lasName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }
    
    

    public String getName() {
        return name;
    }

    public String getLasName1() {
        return lasName1;
    }

    public String getLasName2() {
        return lasName2;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public float getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLasName1(String lasName1) {
        this.lasName1 = lasName1;
    }

    public void setLasName2(String lasName2) {
        this.lasName2 = lasName2;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    

}
