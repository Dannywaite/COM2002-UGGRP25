/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com2002ug25;

/**
 *
 * @author aca14jg
 */
public class Appointment {
    String date;
    String startTime;
    String duration;
    String treatment;
    String patientId;

    public Appointment(String date, String startTime, String duration, String treatment, String patientId) {
        this.date = date;
        this.startTime = startTime;
        this.duration = duration;
        this.treatment = treatment;
        this.patientId = patientId;
    }

    public String getDate() {
        return date;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getDuration() {
        return duration;
    }

    public String getTreatment() {
        return treatment;
    }

    public String getPatientId() {
        return patientId;
    }
    
    public void setDate(String date) {
        this.date = date;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    
      
    
}
