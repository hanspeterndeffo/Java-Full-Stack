package com.hibernate.testing;

public class Employee {

    public int empID=000;
    public String empName;
    public String empAdd;

    public Employee(){
        getEmpID();
    }

    public Employee(int empID, String empName, String empAdd) {
        this.empID = empID;
        this.empName = empName;
        this.empAdd = empAdd;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAdd() {
        return empAdd;
    }

    public void setEmpAdd(String empAdd) {
        this.empAdd = empAdd;
    }

}
