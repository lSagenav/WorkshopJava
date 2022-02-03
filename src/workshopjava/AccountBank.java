/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopjava;

/**
 *
 * @author Scorpion
 */
public class AccountBank {
    // aqui iniciamos creando las variables nativas de la clase
    private int accountNumber;
    protected boolean activated;

    // en esta parte estanos creando los contructores de las variables de la clase 
    public AccountBank(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    
    
    // apartir de este parte estamos crenado los set y get de las variables empleadoas en esta clase 
    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

}
