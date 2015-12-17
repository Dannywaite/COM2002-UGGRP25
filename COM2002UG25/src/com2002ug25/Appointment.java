package com2002ug25;

/**
 * Class for handling appointments
 * @author aca14jg
 */
public class Appointment {
    String date;
    String startTime;
    String duration;
    String treatment;
    String patientId;
    int day;

    public Appointment(String date, String startTime, String duration, String treatment, String patientId, int day) {
        this.date = date;
        this.startTime = startTime;
        this.duration = duration;
        this.treatment = treatment;
        this.patientId = patientId;
        this.day = day;
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


    public int getDay() {
        return day;
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

    public void setDay(int day) {
        this.day = day;
    }
         
    
}

      
    

