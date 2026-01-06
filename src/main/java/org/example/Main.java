package org.example;

import org.example.entities.doctor;
import org.example.entities.hospital;
import org.example.entities.patient;
import org.example.entities.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.io.Console;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static void main(String[] args) {
        hospital h1 = new hospital(" Poliklinika ", " mangilik el 21 ", 9, 1000);
        hospital h2 = new hospital("mediker", "Buqar Jyrau 35", 14, 1500);

        patient p1 = new patient(" Batyr ", 102, 84248265, 68, "Male", 19);
        patient p2 = new patient(" Nuray ", 245, 678529, 58, "Female", 18);


        doctor d1 = new doctor(" Askhat", 407, 24, "Male");
        doctor d2 = new doctor(" Malika ", 503, 30, "Female");

        List<patient> patients = new ArrayList<>();
        patients.add(p1);
        patients.add(p2);

        List<doctor> doctors = new ArrayList<>();
        doctors.add(d1);
        doctors.add(d2);

        List<hospital> hospitals = new ArrayList<>();
        hospitals.add(h1);
        hospitals.add(h2);





        System.out.println(d1.getDoctorID());
        System.out.println(d2.getDoctorID());


        p1.setpatientWeight(90);
        p2.setpatientWeight(70);
        System.out.println(p1.getpatientWeight() + "  " + p2.getpatientWeight());

        if (d1.getDoctorID() > d2.getDoctorID()){
            System.out.println("у доктора 1 больше чем у доктора 2");}
        else if (d1.getDoctorID() < d2.getDoctorID()){
            System.out.println("у доктора 1 меньше чем у доктора 2");}
        else {
            System.out.println("они равны");
        }

        if (p1.getpatientWeight() < p2.getpatientWeight()){
            System.out.println("patient " + p2.getName() + " весит больше");

        }
        else if (p1.getpatientWeight() > p2.getpatientWeight()){
            System.out.println("patient " + p1.getName() + " весит больше чем " + p2.getName());
        }
        else {System.out.println("весят одинакого");}

        System.out.println(p1.getFullinfo());

        System.out.println(d1.getSex());

        h1.setCapacity(2000);


        if (h1.getCapacity() > h2.getCapacity()){
            System.out.println(p2.getName() + " пойдет в " + h1.gethospitalName());
        }
        else if (h1.getCapacity() < h2.getCapacity()){
            System.out.println(p2.getName() + " пойдет в " + h2.gethospitalName());
        }
        else {
            System.out.println("they're equal");
        }


        if (d1.getAge() < 25){
            System.out.println(p1.getName() + "пойдет к доктору " + d1.getName());
        }
        else {
            System.out.println(p1.getName() + " не пойдет к " + d1.getName());
        }

        if (d2.getAge() > 30){
            System.out.println(p2.getName() + " пойдет к доктору " + d2.getName());
        }
        else if(d2.getAge() == 30){
            System.out.println(p2.getName() + " пойдет к доктору " + d2.getName());
        }
        else {
            System.out.println(p2.getName() + " не пойдет к " + d2.getName());
        }



        System.out.println("searching");
        patient found = searchPatientById(patients, 245);
        if (found != null) {
            System.out.println("Нашли пациента: " + found);
        } else {
            System.out.println("Пациент с таким ID не найден");
        }

        System.out.println("filtering(patients havier than 70kg)");
        List<patient> heavyPatients = filterPatientsByMinWeight(patients, 75);
        for (patient p : heavyPatients) {
            System.out.println(p);
        }

        System.out.println("sorting(by names)");
        sortPatientsByName(patients);
        for (patient p : patients) {
            System.out.println(p);
        }

        System.out.println("sorting(heavier to lighter)");
        sortPatientsByWeightDesc(patients);
        for (patient p : patients) {
            System.out.println(p);
        }
        System.out.println("polymorphism(List<person>)");
        List<person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(d1);
        people.add(d2);

        for (person person : people) {
            System.out.println(person);
        }




    }
    public static patient searchPatientById(List<patient> patients, int id) {
        for (patient p : patients) {
            if (p.getpatientID() != null && p.getpatientID() == id) {
                return p;
            }
        }
        return null;
    }

    public static List<patient> filterPatientsByMinWeight(List<patient> patients, int minWeight) {
        List<patient> result = new ArrayList<>();
        for (patient p : patients) {
            if (p.getpatientWeight() != null && p.getpatientWeight() >= minWeight) {
                result.add(p);
            }
        }
        return result;
    }

    public static void sortPatientsByName(List<patient> patients) {
        patients.sort(Comparator.comparing(p -> p.getName().toLowerCase()));
    }

    public static void sortPatientsByWeightDesc(List<patient> patients) {
        patients.sort((pA, pB) -> Integer.compare(
                pB.getpatientWeight(),
                pA.getpatientWeight()
        ));
    }
}
