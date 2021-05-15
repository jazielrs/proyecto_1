/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author Cristopher.za
 */
public class DeEnrollment {
    private static int id;
    private Date date;
    private String studentID, schedule, remark;

    public DeEnrollment(Date date, String studentID, String schedule, String remark) {
        this.id = ++id;
        this.date = date;
        this.studentID = studentID;
        this.schedule = schedule;
        this.remark = remark;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        DeEnrollment.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    
}
