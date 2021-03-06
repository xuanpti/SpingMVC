package com.github.truongbb.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class hibernateUtils {
  public static SessionFactory sessionFactory;
  public static SessionFactory getSessionFactory(){
    if(sessionFactory == null){
      StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
      Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
      return  metadata.getSessionFactoryBuilder().build();
    }
    return sessionFactory;
  }
}
