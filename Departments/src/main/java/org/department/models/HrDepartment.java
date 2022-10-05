package org.department.models;

public class HrDepartment extends SuperDepartment {
    @Override
    public String departmentName() {
        return "HR Department";
    }

    @Override
    public String getTodaysWork() {
        return "Fill today’s timesheet and mark your attendance";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String doActivity() {
        return "team Lunch";
    }

    @Override
    public String toString() {
        return "Welcome to " + departmentName() + "\n" + doActivity() + "\n" + getTodaysWork() + "\n" + getWorkDeadline() + "\n" + isTodayAHoliday();
    }

}
