/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISITOR;

/**
 *
 * @author hp
 */
public class accounts implements accountItem{
private accountItem accounts[];

    public accounts() {
         accounts = new accountItem[] {new Checking(), new Saving(),
                    new Merchant()};
    }
    



    @Override
    public String accept(accountItemVisitor accountItemVisitor) {
 String output ="";
        output+= accountItemVisitor.visitaccount(this)+"\n";
        for(accountItem accountItem: accounts)
            output+= accountItem.accept(accountItemVisitor)+"\n";
        
        return output;    }
    
}
