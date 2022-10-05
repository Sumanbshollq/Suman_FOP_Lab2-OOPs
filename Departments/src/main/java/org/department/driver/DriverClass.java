package org.department.driver;

import org.department.models.AdminDepartment;
import org.department.models.HrDepartment;
import org.department.models.TechDepartment;

public class DriverClass {
    public static void main(String[] args) {
        AdminDepartment adminDepartment = new AdminDepartment();
        HrDepartment hrDepartment = new HrDepartment();
        TechDepartment techDepartment = new TechDepartment();
        System.out.println(adminDepartment);
        System.out.println();
        System.out.println(hrDepartment);
        System.out.println();
        System.out.println(techDepartment);
    }
}
