package org.example.entities;

public class person {
    public String name;
    public String sex;
    public int age;


    public person(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void setName(String Name){this.name = Name;}
    public void setSex(String Sex){this.sex = Sex;}
    public void setAge(int Age){this.age = Age;}

    public String getName(){return name;}
    public String getSex(){return sex;}
    public int getAge(){return age;}

    public String toString() {
        return "Name: " + name + ", sex: " + sex + ", age: " + age;
    }
}
