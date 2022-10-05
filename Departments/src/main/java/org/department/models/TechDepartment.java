package org.department.models;

public class TechDepartment extends SuperDepartment {
    @Override
    public String departmentName() {
        return "Tech Department";
    }

    @Override
    public String getTodaysWork() {
        return "Complete coding of Module 1";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String getTechStackInformation() {
        return "Core Java";
    }

    @Override
    public String toString() {
        return "Welcome to " + departmentName() + "\n" + getTodaysWork() + "\n" + getWorkDeadline() + "\n" + getTechStackInformation() + "\n" + isTodayAHoliday();
    }
}
