package com.NIT;

public class EmployeeSalary {
    Float empBSal;
    void Calculate(){
        float empTotSal= empBSal+(.93F*empBSal)+(.63F*empBSal);
        System.out.println("=====EmployeeSalary=====");
        System.out.println("EmpBSal:"+empBSal);
        System.out.println("EmpTotSal:"+empTotSal);
    }
}
