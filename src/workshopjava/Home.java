/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopjava;

/**
 *
 * @author Scorpion
 */
public class Home {
    
    //desde este punto de la clase creamos lo que son las variables nativas de la clase Home
    public int numberPhone;
    private String rooms;
    protected String bathrooms;
    public int adress;
    public String color;
    private double zise;

    
    // aprtir de este punto vamos a crear los contructores de las variables implemetadas en la clase Home
    public Home(int numberPhone, String rooms, String bathrooms, int adress, String color, double zise) {
        this.numberPhone = numberPhone;
        this.rooms = rooms;
        this.bathrooms = bathrooms;
        this.adress = adress;
        this.color = color;
        this.zise = zise;
    }

    // desde este punto del codigo estamos creando todos los get y set de las variables implementadas en la clase
    public int getNumberPhone() {
        return numberPhone;
    }

    public String getRooms() {
        return rooms;
    }

    public String getBathrooms() {
        return bathrooms;
    }

    public int getAdress() {
        return adress;
    }

    public String getColor() {
        return color;
    }

    public double getZise() {
        return zise;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public void setBathrooms(String bathrooms) {
        this.bathrooms = bathrooms;
    }

    public void setAdress(int adress) {
        this.adress = adress;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setZise(double zise) {
        this.zise = zise;
    }

    
    
    
    
    
}
