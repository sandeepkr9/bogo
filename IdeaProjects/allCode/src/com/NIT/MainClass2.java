package com.NIT;

public class MainClass2 {
    public static void main(String[] args){
        EmployeeData ed = new EmployeeData();
        EmployeeAddress ea = new EmployeeAddress();
        EmpContact ec = new EmpContact();
        ed.empId = "A2424";
        ed.empName = "xyz";
        ed.empDegn = "ME";
        ed.empBsal = 45_000;
        ea.hNo = "Q-12/34";
        ea.sName = "CEERI road";
        ea.pinCode = 333_031;
        ec.pNo = 7503210521L;
        ec.mailId = "xyz@gmail.com";
        ed.getEmpData();
        ea.getEmployeeAddress();
        ec.getEmpContact();
    }
}
