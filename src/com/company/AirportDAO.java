package com.company;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class AirportDAO {
    public static void insert(Airport airport){
        //susikurimas entity managerio kad galetume atlikti transakcijas(uzklausos duomenu bazei)
        EntityManager entityManager = JPAUtils.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        //paruosiama uzklausa
        entityManager.persist(airport);

        //ivygdoma uzklausa
        entityManager.getTransaction().commit();
        //uzdaromi prisijungimai
        entityManager.close();
    }
}
