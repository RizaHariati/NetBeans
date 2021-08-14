/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_registration;

/**
 *
 * @author Riza Hariati
 */
public class Login_Registration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Registration rg = new Registration();
       rg.setVisible(true);
       rg.pack();
       rg.setLocationRelativeTo(null);
       rg.setDefaultCloseOperation(Registration.EXIT_ON_CLOSE);
    }
    
}
