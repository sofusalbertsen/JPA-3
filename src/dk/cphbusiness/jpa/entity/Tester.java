/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.jpa.entity;

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
//        try(){}
//        finally{}
        Persistence.generateSchema("PU", null);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Student> tq = em.createQuery("select s from Student s where s.firstName = :firstName", Student.class);
        tq.setParameter("firstName", "Bente");
        System.out.println(tq.getSingleResult().getAddress().getCountry());
//        Student s = new Student();
//        s.setUsername("cphsm145");
//        s.setFirstName("Sehumbing");
//        s.setLastName("Mangaze");
//        s.setMobilePhone("12345678");
//        s.setClassName("3A");
//        s.setHobby("Gaming");
//        
//        Teacher t = new Teacher();
//        t.setFirstName("Sofus");
//        t.setLastName("Albertsen");
//        Address a = new Address();
//        
//        a.setStreetName("Nørrebrogade");
//        a.setStreetNumber("132");
//        a.setCity("København N");
//        a.setCountry("Denmark");
//        a.setZipCode("2200");
//        t.setAddress(a);
//        t.setEmail("sal@cphbusiness.dk");
//        t.setUsername("sal");
//        t.setFaculty("Computer Science");
//        em.getTransaction().begin();
//        em.persist(t);
//        em.persist(a);
//        em.persist(s);
//        em.getTransaction().commit();
        
//        TypedQuery<Student> qu = em.createQuery("select s from Student s where s.firstName = :firstname", Student.class);
//        qu.setMaxResults(1);
//        qu.setParameter("firstname", "Sehumbing");
//        Student sOut =qu.getSingleResult();
//        
//        em.getTransaction().begin();
//        s.setHobby("Programming");
//        em.persist(s);
//        em.getTransaction().commit();
//        System.out.println(s.getLastName());
//        
        
    }
    
}
