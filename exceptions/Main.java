/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author zied
 */
public class Main {
     public static void main(String[] args) {
   
Character warrior = new Warrior("Jean -Luc") ;
Character mage = new Mage("Robert") ;
warrior . tryToAttack ("screwdriver") ;
mage . tryToAttack ("hammer") ;
warrior . tryToAttack ("hammer") ;
try {
mage . attack ("") ;
} catch ( WeaponException e ) {
System . out . println ( e . getMessage () ) ;

}




    
    }
}
