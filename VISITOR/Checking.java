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
public class Checking  implements accountItem{

    @Override
    public String accept(accountItemVisitor accountItemVisitor) {
        return accountItemVisitor.VisitChecking(this);
    }
    
}
