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
public class view {
    public  String show(String name,String address, String date_of_birth, String account_number ){
    
    return (
            "name : "+name+"\n address : "+ address
            + "\n date of birth : "+date_of_birth 
            +"\n account number : "+account_number
            );
    }
}
