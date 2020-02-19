package com.viram.JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	 Customer c2=new Customer();
    	 c2.setId(2);
    	 c2.setfName("viram");
    	 c2.setlName("sarvariya");
    	 c2.setEmail("xyz@peaas.co");
    			 
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("my-app");
    	EntityManager entity=emf.createEntityManager();  
    	Customer customer=entity.find(Customer.class, 1);
    	
    	entity.getTransaction().begin();
    	entity.persist(c2);
    	entity.getTransaction().commit();
    	System.out.println(customer);
    }
}
