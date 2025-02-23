package com.restuarant.restuarant;

import com.restuarant.restuarant.userdetails.UserInformation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateConfig<T> {
    T obj;
    public void hibernateAdding(T obj){
        this.obj=obj;
        Configuration configuration=new Configuration();
        //configuration.configure("/hibernate.cfg.xml");//this is not cumpolsory becuase by deafault our application will search for this "hibernate.cfg.xml"
        configuration.configure();//this is not cumpolsory becuase by deafault our application will search for this "hibernate.cfg.xml"
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        // Session session=sessionFactory.getCurrentSession();//openSession always generates a new Session object, whereas getCurrentSession creates a new Session if one does not already exist, else, it utilizes the same session that is in the current hibernate context.
        Session session=sessionFactory.openSession();

        Transaction tx=session.beginTransaction();
        //student =(Student) session.get(Student.class,1);//to fetch the vale use get()
        //	session.save(student);
        session.save(obj);
        //System.out.println(student);

        tx.commit();
    }
    public UserInformation hibernateUserDataFetchById(int id){
        Configuration configuration=new Configuration();
        //configuration.configure("/hibernate.cfg.xml");//this is not cumpolsory becuase by deafault our application will search for this "hibernate.cfg.xml"
        configuration.configure();//this is not cumpolsory becuase by deafault our application will search for this "hibernate.cfg.xml"
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        // Session session=sessionFactory.getCurrentSession();//openSession always generates a new Session object, whereas getCurrentSession creates a new Session if one does not already exist, else, it utilizes the same session that is in the current hibernate context.
        Session session=sessionFactory.openSession();

        Transaction tx=session.beginTransaction();
        UserInformation userInformation =(UserInformation) session.get(UserInformation.class,id);//to fetch the vale use get()
        //	session.save(student);
       // session.save(obj);
        System.out.println(userInformation);
return userInformation;
       // tx.commit();
    }
}
