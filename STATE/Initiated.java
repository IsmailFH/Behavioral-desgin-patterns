/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STATE;

/**
 *
 * @author hp
 */
public class Initiated implements State{

    @Override
    public String doAction(Context context) {
        context.setState(this);
        return "Processing Initiated State ...";
    }

    @Override
    public String toString() {
        return "Initiated State";
    }
    
    
}