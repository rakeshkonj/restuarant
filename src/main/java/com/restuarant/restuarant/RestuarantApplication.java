package com.restuarant.restuarant;

import com.restuarant.restuarant.userdetails.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"com.restuarant.*"})
@SpringBootApplication
public class RestuarantApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext a=SpringApplication.run(RestuarantApplication.class, args);
//		AdminCredential aa=new AdminCredential();
//		aa.setPassword("aman@1");
	/*	UserInformation userInformation =new UserInformation();
		userInformation.setUserID(123L);
		userInformation.setEmailID("aman@gmail.com");
		Address address=new Address();
		address.setAddressLine1("Hanumanpura");
		address.setAddressLine2("bhelupur");
		address.setAddressLine3("varanasi");
		userInformation.setAddress(address);
		UserNames userNames = new UserNames();
		userNames.setFirstName("aman");
		userNames.setMiddleName("kumar");
		userNames.setLastName("sahani");
        userInformation.setUserNames(userNames);
		AdditionalUserDetails additionalUserDetails=new AdditionalUserDetails();
		additionalUserDetails.setPromoCode("abc");
		additionalUserDetails.setRefferalCode("xyz");
		userInformation.setAdditionalUserDetails(additionalUserDetails);
		System.out.println(userInformation.toString());
		//aa.setUserID("Admin-");
		Configuration configuration=new Configuration();
		//configuration.configure("/hibernate.cfg.xml");//this is not cumpolsory becuase by deafault our application will search for this "hibernate.cfg.xml"
		configuration.configure();//this is not cumpolsory becuase by deafault our application will search for this "hibernate.cfg.xml"
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		// Session session=sessionFactory.getCurrentSession();//openSession always generates a new Session object, whereas getCurrentSession creates a new Session if one does not already exist, else, it utilizes the same session that is in the current hibernate context.
		Session session=sessionFactory.openSession();

		Transaction tx=session.beginTransaction();
		//student =(Student) session.get(Student.class,1);//to fetch the vale use get()
		//	session.save(student);
		session.save(userInformation);
		//System.out.println(student);

		tx.commit();*/
	}

}
