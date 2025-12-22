package org.example.entities;

public class patient {
    public patient(String patient_name, Integer patient_id, Integer patient_phone, Integer patient_weight){
        this.patient_name = patient_name;
        this.patient_id = patient_id;
        this.patient_phone = patient_phone;
        this.patient_weight = patient_weight;

    }
    private String patient_name;
    private Integer patient_id;
    private Integer patient_phone;
    private Integer patient_weight;

    public void setpatientName(String patientName){this.patient_name = patientName;}
    public void setpatientID(Integer patientID){this.patient_id = patientID;}
    public void setpatientPhone(Integer patientPhone){this.patient_phone = patientPhone;}
    public void setpatientWeight(Integer patientWeight){this.patient_weight = patientWeight;}

    public String getpatientName(){return patient_name;}
    public Integer getpatientID(){return patient_id;}
    public Integer getpatientPhone(){return patient_phone;}
    public Integer getpatientWeight(){return patient_weight;}

    public String getFullinfo(){
        return "the patient name is: " + this.patient_name + ". " + "the patient id is: " + this.patient_id.toString() + ". " + "the patient phone is: " + this.patient_phone.toString() + ". " + "the patient weight is: "
 + this.patient_weight.toString();   }
}
