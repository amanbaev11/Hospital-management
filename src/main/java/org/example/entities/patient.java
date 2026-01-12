package org.example.entities;

public class patient extends person {
    public patient(String patient_name, Integer patient_id, Integer patient_phone, Integer patient_weight, String patient_sex, int age, String do_action){
        super(patient_name, patient_sex, age, do_action);
        this.patient_id = patient_id;
        this.patient_phone = patient_phone;
        this.patient_weight = patient_weight;


    }

    private Integer patient_id;
    private Integer patient_phone;
    private Integer patient_weight;




    public void setpatientID(Integer patientID){this.patient_id = patientID;}
    public void setpatientPhone(Integer patientPhone){this.patient_phone = patientPhone;}
    public void setpatientWeight(Integer patientWeight){this.patient_weight = patientWeight;}



    public Integer getpatientID(){return patient_id;}
    public Integer getpatientPhone(){return patient_phone;}
    public Integer getpatientWeight(){return patient_weight;}



    public String getFullinfo(){
        return "the patient name is: " + this.name + ". " +
                "the patient id is: " + this.patient_id + ". " +
                "the patient phone is: " + this.patient_phone + ". " +
                "the patient weight is: " + this.patient_weight + ". " +
                "the patient sex is: " + this.sex + ". " +
                "the patient age is: " + this.age;
    }
    public String toString() {
        return "Patient{" + "id=" + patient_id + ", name='" + name + '\'' + ", weight=" + patient_weight + ", age=" + age + '}';
    }

    @Override
    public String doAction() {
        return "is being treated";
    }



}
