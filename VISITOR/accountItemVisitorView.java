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
public class accountItemVisitorView implements accountItemVisitor{

    @Override
    public String visitaccount(accounts accounts) {
          return"accounts";
    }

    @Override
    public String VisitChecking(Checking Checking) {
       return"Checking";
    }

    @Override
    public String VisitSaving(Saving Saving) {
      return"Saving";
    }

    @Override
    public String VisitMerchant(Merchant Merchant) {
        return"Merchant";
    }
    
}
