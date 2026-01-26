package org.example.entities;


public class nurse extends person {
    public nurse(String nurse_name, int nurse_id, int nurse_age, String nurse_sex, String do_action){
        super(nurse_name, nurse_sex, nurse_age, do_action);
        this.nurse_id = nurse_id;


    }

    private int nurse_id;


    public void setNurseId(int NurseId){this.nurse_id = NurseId;}


    public int getNurseId(){return nurse_id;}

    @Override
    public String doAction() {
        return "dispenses medication";
    }
}
