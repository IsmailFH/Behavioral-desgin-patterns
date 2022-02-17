/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STRATEGY;

/**
 *
 * @author hp
 */
public class context {
  private balance balance;

    public context(balance balance) {
        this.balance = balance;
    }
  
    public  double getBalance(double a){
    
    return this.balance.doAction(a);
    
    }
}
