package com.mumin.beans;

public class Employee {

  private int empId;
  private String empName;
  private Role role;

  public int getEmpId() {
    return empId;
  }

  public void setEmpId(int empId) {
    this.empId = empId;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public void displayInfo(){
    System.out.println("Id : "+empId);
    System.out.println("Name : "+empName);
    System.out.println("Role : "+role);
  }
}
