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
public class Euro implements balance{
    
     @Override
    public double doAction(double Currencies) {
        return Currencies/2.8 ;
    }
}
