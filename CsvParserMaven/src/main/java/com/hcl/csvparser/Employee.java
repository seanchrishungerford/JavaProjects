package com.hcl.csvparser;

public class Employee {
    private int empId;
    private String empName;
    private String empPhone;

    public Employee() {
    }

    public Employee(int empId, String empName, String empPhone) {
        this.empId = empId;
        this.empName = empName;
        this.empPhone = empPhone;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return this.empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpPhone() {
        return this.empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public String toString() {
        return "Employee [empName=" + this.empName + ", empId=" + this.empId + ", empPhone=" + this.empPhone + "]";
    }
}