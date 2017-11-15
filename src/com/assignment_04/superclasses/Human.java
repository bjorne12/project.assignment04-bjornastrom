/**
 * Assignment 04
 * @author Björn Åström
 * @version 1
 **/

package com.assignment_04.superclasses;

/** 
 * Skapar två attributs, string name och int age
*/
public class Human {

    protected String name;
    protected int age;

    
    public Human(String name, int age) {
        this.name = name;
        this.age = age;

    }

    /** 
     * Skapar sedan getters och setters för name samt age
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}