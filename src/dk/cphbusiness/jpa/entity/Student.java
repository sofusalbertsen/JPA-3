/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.jpa.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;

/**
 *
 * @author sofus
 */
@Entity
public class Student extends Person {

    private String className;
    @ElementCollection
    private List<String> hobbies = new ArrayList<>();

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> Hobbies) {
        this.hobbies = Hobbies;
    }

    public void setHobby(String hobby) {
        hobbies.add(hobby);
    }

    public Student() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
