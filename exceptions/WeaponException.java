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
public class WeaponException extends Exception{
    public WeaponException(){
        super();
    }
    
    public WeaponException(String s){
        super(s);
        /*if(s.equalsIgnoreCase("")){
            System.out.println(name+" I refuse to fight with my bare hands .");
        }*/
    }
}
