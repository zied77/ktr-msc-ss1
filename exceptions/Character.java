/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import javaapplication2.*;

/**
 *
 * @author zied
 */
abstract class Character implements Movable{

    /**
     * @return the name
     */
 
    protected String name;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;
    protected static String RPGClass;
    public void attack(String a) throws WeaponException{
        System.out.println(this.getName()+": Rrrrrrrrr ....");
    }
    
    public void tryToAttack(String a){
        try{
            attack(a);
        }catch(WeaponException e){
            System.out.println(e.getMessage());
        }
    };
     Character(String name){
        this.name = name;
    }
     Character(String name, String b){
        this.name = name;
        RPGClass = b;
        
    }
     Character(String rp, int life,int strength, int agility, int wit ){
         RPGClass = rp;
         this.life = life;
         this.agility = agility;
         this.strength = strength;
         this.wit = wit;
     }

    public Character() {
    }
     
    
     
        public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the life
     */
    public int getLife() {
        return life;
    }

    /**
     * @param life the life to set
     */
    public void setLife(int life) {
        this.life = life;
    }

    /**
     * @return the agility
     */
    public int getAgility() {
        return agility;
    }

    /**
     * @param agility the agility to set
     */
    public void setAgility(int agility) {
        this.agility = agility;
    }

    /**
     * @return the strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * @param strength the strength to set
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * @return the wit
     */
    public int getWit() {
        return wit;
    }

    /**
     * @param wit the wit to set
     */
    public void setWit(int wit) {
        this.wit = wit;
    }

    @Override
    public void moveRight() {
           System.out.println(getName()+" Moves right");
    }

    @Override
    public void moveLeft() {
           System.out.println(getName()+" Moves left");
    }

    @Override
    public void moveForward() {
           System.out.println(getName()+" Moves forward");
    }

    @Override
    public void moveBack() {
           System.out.println(getName()+" Moves back");
    }
    
    public void unsheathe(){
        System.out.println(getName()+" : unsheathes his weapon .");
    }
    
    
}
