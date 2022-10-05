package org.department.models;

public class AdminDepartment extends SuperDepartment {

    @Override
    public String departmentName() {
        return "Admin Department";
    }

    @Override
    public String getTodaysWork() {
        return "Complete your documents Submission";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    @Override
    public String toString() {
        return "Welcome to " + departmentName() + "\n" + getTodaysWork() + "\n" + getWorkDeadline() + "\n" + isTodayAHoliday();
    }
}
