/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.jpa.entity;

import javax.persistence.Entity;

/**
 *
 * @author sofus
 */
@Entity
public class Teacher extends Person{
    private String faculty;

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Teacher() {
    }
    
}
