package org.example.entities;
import java.util.Objects;

public class hospital {
    public hospital(String hospital_name, String location, Integer id, Integer capacity){
        this.hospital_name = hospital_name;
        this.location = location;
        this.id = id;
        this.capacity = capacity;

    }
    private String hospital_name;
    private String location;
    private Integer id;
    private Integer capacity;


    public void sethospitalName(String hospitalName){this.hospital_name = hospitalName;}
    public void setLocation(String location){this.location = location;}
    public void setid(Integer id){this.id = id;}
    public void setCapacity(Integer Capacity){this.capacity = Capacity;}

    public String gethospitalName(){return hospital_name;}
    public String getlcoation(){return location;}
    public Integer getid(){return id;}
    public Integer getCapacity(){return capacity;}

    public String getAllinfo(){
        return "the hospital_name is: " + this.hospital_name + "the hospitalLocation is: " + this.location + "the hospital_id is: " + this.id.toString();
    }
    public String toString() {
        return "Hospital{" + "id=" + id + ", name='" + hospital_name + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        hospital other = (hospital) o;
        return Objects.equals(id, other.id);

    }

}

