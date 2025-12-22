package org.example;

import org.example.entities.doctor;
import org.example.entities.hospital;
import org.example.entities.patient;

import java.io.Console;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        hospital h1 = new hospital(" Poliklinika ", " mangilik el 21 ", 9, 1000);
        hospital h2 = new hospital("mediker", "Buqar Jyrau 35", 14, 1500);

        patient p1 = new patient(" Batyr ", 102, 84248265, 68, "Male");
        patient p2 = new patient(" Nuray ", 245, 678529, 58, "Female");

        doctor d1 = new doctor(" Askhat", 407, 24, "Male");
        doctor d2 = new doctor(" Malika ", 503, 30, "Female");

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
            System.out.println("patient " + p2.getpatientName() + " весит больше");

        }
        else if (p1.getpatientWeight() > p2.getpatientWeight()){
            System.out.println("patient " + p1.getpatientName() + " весит больше чем " + p2.getpatientName());
        }
        else {System.out.println("весят одинакого");}

        System.out.println(p1.getFullinfo());

        System.out.println(d1.getDoctorSex());

        h1.setCapacity(2000);


        if (h1.getCapacity() > h2.getCapacity()){
            System.out.println(p2.getpatientName() + " пойдет в " + h1.gethospitalName());
        }
        else if (h1.getCapacity() < h2.getCapacity()){
            System.out.println(p2.getpatientName() + " пойдет в " + h2.gethospitalName());
        }
        else {
            System.out.println("they're equal");
        }


        if (d1.getDoctorAge() < 25){
            System.out.println(p1.getpatientName() + "пойдет к доктору " + d1.getDoctorName());
        }
        else {
            System.out.println(p1.getpatientName() + " не пойдет к " + d1.getDoctorName());
        }

        if (d2.getDoctorAge() > 30){
            System.out.println(p2.getpatientName() + " пойдет к доктору " + d2.getDoctorName());
        }
        else if(d2.getDoctorAge() == 30){
            System.out.println(p2.getpatientName() + " пойдет к доктору " + d2.getDoctorName());
        }
        else {
            System.out.println(p2.getpatientName() + " не пойдет к " + d2.getDoctorName());
        }









    }
}
