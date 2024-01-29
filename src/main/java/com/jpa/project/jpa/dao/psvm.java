package com.jpa.project.jpa.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jpa.project.jpa.entity.Praveen;

public class psvm {
	public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(PraveenDaoImpl.class);
    	Jpa praveenDaoImpl= 	container.getBean(Jpa.class);
    //	Praveen praveen=new Praveen();
    //	praveen.setAge("11");
    //	praveen.setId(90);
    //	praveen.setName("praveen");
      //  System.out.println( "Hello World!" );
       // PraveenDao dao=new PraveenDaoImpl();
      //  praveenDaoImpl.save(praveen);
        
        //Praveen p=praveenDaoImpl.get(11);
       // System.out.println(praveenDaoImpl.p);
    }

}
