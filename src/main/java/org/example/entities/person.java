package org.example.entities;

public class person {
    public String name;
    public String sex;
    public int age;
    public String do_action;


    public person(String name, String sex, int age, String do_action){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.do_action = do_action;
    }

    public void setName(String Name){this.name = Name;}
    public void setSex(String Sex){this.sex = Sex;}
    public void setAge(int Age){this.age = Age;}
    public void setDoAction(String DoAction){this.do_action = DoAction;}

    public String getName(){return name;}
    public String getSex(){return sex;}
    public int getAge(){return age;}
    public String getDoAction(){return do_action;}

    public String toString() {
        return "Name: " + name + ", sex: " + sex + ", age: " + age;
    }

    public String doAction() {
        return do_action; // по умолчанию возвращает поле
    }
}
