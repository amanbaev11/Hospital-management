package org.example.entities;

public class doctor {
    public doctor(String doctor_name, Integer doctor_id, Integer doctor_age){
        this.doctor_name = doctor_name;
        this.doctor_id = doctor_id;
        this.doctor_age = doctor_age;

    }
    private String doctor_name;
    private Integer doctor_id;
    private Integer doctor_age;

    public void setDoctorName(String DoctorName){doctor_name = DoctorName;}
    public void setDoctorID(Integer DoctorID){doctor_id = DoctorID;}
    public void setDoctorAge(Integer DoctorAge){doctor_age = DoctorAge;}

    public String getDoctorName(){return doctor_name;}
    public Integer getDoctorID(){return doctor_id;}
    public Integer getDoctorAge(){return doctor_age;}
}
