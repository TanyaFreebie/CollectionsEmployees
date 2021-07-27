package com.company.company;

import java.util.List;



public class Company {
    private String companyName;
    private List<Employee> employeeList;


    //add an constructor
    public Company(String companyName, List<Employee> employeeList){
        this.companyName = companyName;
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public float getAverage(){
        float sum = 0;
        for (Employee employee: this.employeeList) {
            sum += employee.getAge();
        }
        return sum / this.employeeList.size();
    }

}
