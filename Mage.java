/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author zied
 */
public class Mage extends Character{
    public Mage(){
        Warrior.RPGClass = "Mage";
        setLife(70);
        setAgility(10);
        setStrength(3);
        setWit(10);
    }
    
    public Mage(String name){
        super(name);
                System.out.println(name+" : May the gods be with me .");

    }
    

    @Override
    public void attack(String weapon) {
        if (weapon.equalsIgnoreCase("magic") || weapon.equalsIgnoreCase("wand") ) {
            super.attack(weapon);
            System.out.println(getName()+" : Feel the power of my "+weapon+" !"); 
                       
        }
         //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void moveRight() {
        System.out.println(getName()+" : moves right furtively .");
    }

    @Override
    public void moveBack() {
        System.out.println(getName()+" : moves back furtively .");
    }

    @Override
    public void moveForward() {
        System.out.println(getName()+" : moves forward furtively .");
    }

    @Override
    public void moveLeft() {
        System.out.println(getName()+" : moves left furtively .");
    }
    
}
