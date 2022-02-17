/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBSERVER;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class Subject {
        private List<Observer> observers =
            new ArrayList<Observer>();
    private double balance;
    
    
        public double getbalance() {
        return balance;
    }

    public void setbalance(double balance) {
        this.balance = balance;
        notifyAllObsevers();
    }
    public void attach(Observer observer){
        observers.add(observer);
    }
    public void notifyAllObsevers(){
        for(Observer c: observers){
            c.update();
        }
    }
    
    
    
    
    
    
}
