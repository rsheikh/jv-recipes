package org.example;


import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        SessionFactory sessionFactory = Database.getSessionFactory();

        sessionFactory.getSchemaManager().exportMappedObjects(true);


    }
}