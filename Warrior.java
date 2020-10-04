/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author zied
 */
public class Warrior extends Character {
    public Warrior(){
        Warrior.RPGClass = "Warrior";
        setLife(100);
        setAgility(8);
        setStrength(10);
        setWit(3);
    }

    @Override
    public void attack(String weapon) {
        if (weapon.equalsIgnoreCase("hammer") || weapon.equalsIgnoreCase("sword") ) {
            super.attack(weapon);
            System.out.println(getName()+" : I'll crush you with my"+weapon+" !"); 
                   
                    
                  
        }
         //To change body of generated methods, choose Tools | Templates.
    }
    
     public Warrior(String name){
        super(name);
                System.out.println(name+" :  My name will go down in history !");
    }

    @Override
    public void moveRight() {
        System.out.println(getName()+" : moves right like a bad boy");
    }

    @Override
    public void moveBack() {
        System.out.println(getName()+" : moves back like a bad boy");
    }

    @Override
    public void moveForward() {
        System.out.println(getName()+" : moves forward like a bad boy");
    }

    @Override
    public void moveLeft() {
        System.out.println(getName()+" : moves left like a bad boy");
    }
    
    
    
    
    
}
