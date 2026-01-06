package org.example.entities;

public class doctor extends person{
    public doctor(String doctor_name, Integer doctor_id, int doctor_age, String doctor_sex){
        super(doctor_name, doctor_sex, doctor_age);
        this.doctor_id = doctor_id;


    }

    private Integer doctor_id;



    public void setDoctorID(Integer DoctorID){this.doctor_id = DoctorID;}



    public Integer getDoctorID(){return doctor_id;}

    public String toString() {
        return "Doctor{" + "id=" + doctor_id + ", name='" + name + '\'' + ", age=" + age + ", sex='" + sex + '\'' + '}';
    }

}
