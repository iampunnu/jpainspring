package com.jpa.project.jpa;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jpa.project.jpa.dao.PraveenDao;
import com.jpa.project.jpa.dao.PraveenDaoImpl;
import com.jpa.project.jpa.entity.Praveen;


/**
 * Hello world!
 *
 */
public class App 
{   
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class);
    	PraveenDaoImpl praveenDaoImpl= 	container.getBean("praveenDaoImpl",PraveenDaoImpl.class);
    	Praveen praveen=new Praveen();
    	praveen.setAge("11");
    	praveen.setId(90);
    	praveen.setName("praveen");
        System.out.println( "Hello World!" );
       // PraveenDao dao=new PraveenDaoImpl();
      //  praveenDaoImpl.save(praveen);
        
        Praveen p=praveenDaoImpl.get(1);
        System.out.println(p.getAge());
    }
}
