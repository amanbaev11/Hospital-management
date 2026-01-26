package org.example.entities;
import java.util.Objects;

public class doctor extends person{
    public doctor(String doctor_name, Integer doctor_id, int doctor_age, String doctor_sex, String do_action){
        super(doctor_name, doctor_sex, doctor_age, do_action);
        this.doctor_id = doctor_id;


    }

    private Integer doctor_id;



    public void setDoctorID(Integer DoctorID){this.doctor_id = DoctorID;}



    public Integer getDoctorID(){return doctor_id;}

    public String toString() {
        return "Doctor{" + "id=" + doctor_id + ", name='" + name + '\'' + ", age=" + age + ", sex='" + sex + '\'' + '}';
    }

    @Override
    public String doAction() {
        return "treats patients";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        doctor other = (doctor) o;
        return Objects.equals(doctor_id, other.doctor_id);
    }


}
