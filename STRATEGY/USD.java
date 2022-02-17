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
public class USD implements balance{
    
     @Override
    public double doAction(double Currencies) {
        return Currencies/3.3 ;
    }
}
