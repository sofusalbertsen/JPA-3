/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.jpa.tester;

import dk.cphbusiness.jpa.entity.Student;
import dk.cphbusiness.jpa.entity.Teacher;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author sofus
 */
public class Tester {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();
//        Student s = new Student();
//        s.setUsername("UniqueName");
//        s.setFirstName("Lille");
//        s.setLastName("Ole");
//        s.setMobilePhone("12345678");
//        s.setClassName("3A");
        Teacher t = new Teacher();
        t.setFirstName("Sofus");
        t.setLastName("Albertsen");
        t.setAddress("Nørrebrogade 132");
        t.setCity("København N");
        t.setEmail("sal@cphbusiness.dk");
        t.setPostalCode("2000");
        t.setUsername("sal");
        t.setFaculty("Computer Science");
        em.getTransaction().begin();
        em.persist(t);
//        em.persist(s);
        em.getTransaction().commit();
        TypedQuery<Student> qu = em.createQuery("select s from Student s where s.firstName = :firstname", Student.class);
        qu.setMaxResults(1);
        qu.setParameter("firstname", "Bente");
        Student s =qu.getSingleResult();
        
        em.getTransaction().begin();
        s.setHobby("Programming");
        em.persist(s);
        em.getTransaction().commit();
        System.out.println(s.getLastName());
        
        
    }
    
}
