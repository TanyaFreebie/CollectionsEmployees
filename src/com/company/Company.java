package com.company;

import java.util.ArrayList;
import java.util.List;



public class Company {
    private String companyName;
    private List<Employee> employeeList;


    //add an constructor
    public Company(String companyName, List<Employee> employeeList){
        this.companyName = companyName;
        this.employeeList = employeeList;
    }

    public float getAverage(){
        float sum = 0;
        for (int i = 0; i < this.employeeList.size(); i++) {
            sum += this.employeeList.get(i).getAge();
        }
        return sum / this.employeeList.size();
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

}
