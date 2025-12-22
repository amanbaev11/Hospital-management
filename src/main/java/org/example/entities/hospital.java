package org.example.entities;

public class hospital {
    public hospital(String hospital_name, String location, Integer id){
        this.hospital_name = hospital_name;
        this.location = location;
        this.id = id;

    }
    private String hospital_name;
    private String location;
    private Integer id;


    public void setHospital_name(String hospitalName){hospital_name = hospitalName;}
    public void setLocation(String location){this.location = location;}
    public void setid(Integer id){this.id = id;}

    public String gethospitalName(){return hospital_name;}
    public String getlcoation(){return location;}
    public Integer getid(){return id;}

    public String getAllinfo(){
        return "the hospital_name is: " + this.hospital_name + "the hospitalLocation is: " + this.location + "the hospital_id is: " + this.id.toString();
    }

}

