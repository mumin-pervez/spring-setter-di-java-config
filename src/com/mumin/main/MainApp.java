package com.mumin.main;

import com.mumin.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

  public static void main(String[] args) {
    // Load Spring context from Java config class
    ApplicationContext context = new AnnotationConfigApplicationContext(com.mumin.resources.SpringConfigFile.class);

    // Retrieve the Employee bean
    Employee emp = (Employee) context.getBean("createEmployee");
    emp.displayInfo();
  }
}
