package com.mumin.resources;

import com.mumin.beans.Employee;
import com.mumin.beans.Role;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {

  @Bean
  public Role createRole() {
    Role role = new Role();
    role.setRoleId(11);
    role.setRoleName("Developer");
    return role;
  }

  @Bean
  public Employee createEmployee() {
    Employee emp = new Employee();
    emp.setEmpId(87);
    emp.setEmpName("Firoz Ahmed");
    emp.setRole(createRole());  // Setter Injection of Role
    return emp;
  }
}
