package com.NIT;

import java.util.Scanner;

public class MainClass2_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        EmployeeData ed = new EmployeeData();
        EmployeeAddress ea = new EmployeeAddress();
        EmpContact ec = new EmpContact();
        EmployeeSalary es = new EmployeeSalary();
        System.out.println("Enter EmpName:");
        ed.empName = s.nextLine();
        System.out.println("Enter EmpId:");
        ed.empId = s.nextLine();
        System.out.println("Enter EmpDesg:");
        ed.empDegn = s.nextLine();
        System.out.println("Enter EmpHNo:");
        ea.hNo = s.nextLine();
        System.out.println("Enter EmpSName:");
        ea.sName = s.nextLine();
        System.out.println("Enter EmpCity:");
        ea.city = s.nextLine();
        System.out.println("Enter PinCode:");
        ea.pinCode = Integer.parseInt(s.nextLine());
        System.out.println("Enter EmpPhNo:");
        ec.pNo = Long.parseLong(s.nextLine());
        System.out.println("Enter EmpMail:");
        ec.mailId = s.nextLine();
        System.out.println("Enter EmpBSal:");
        es.empBSal = Float.parseFloat(s.nextLine());

        if(es.empBSal >= 10000){
            ed.getEmpData();
            ea.getEmployeeAddress();
            ec.getEmpContact();
            es.Calculate();
        }
        else{
            System.out.println("Invalid EmpSal");
        }
    }
}
