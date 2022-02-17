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
public interface accountItemVisitor {
      public String visitaccount(accounts accounts);
      public String VisitChecking(Checking Checking);
      public String VisitSaving(Saving Saving);
      public String VisitMerchant(Merchant Merchant);
       
}
