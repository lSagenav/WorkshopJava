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

    private int accountNumber;
    protected boolean activated;

    public AccountBank(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    
    

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
