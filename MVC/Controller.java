/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author hp
 */
public class Controller {
    Stor stor;
    view View;

    public Controller(Stor stor, view View) {
        this.stor = stor;
        this.View = View;
    }

  

    public void setView(view View) {
        this.View = View;
    }
    
    public String updateView() {
        return this.View.show(
                this.stor.getName(),
                this.stor.getAddress(),
                this.stor.getDate_of_birth(),
                this.stor.getAccount_number()
                );
    }
    
}
