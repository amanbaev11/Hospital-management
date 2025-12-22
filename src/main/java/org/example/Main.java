package org.example;

import org.example.entities.doctor;
import org.example.entities.hospital;
import org.example.entities.patient;

import java.io.Console;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        hospital h1 = new hospital(" Poliklinika ", " mangilik el 21 ", 502);

        patient p1 = new patient(" Beiba ", 102, 84248265, 68);
        patient p2 = new patient(" Batyr ", 245, 678529, 78);

        doctor d1 = new doctor(" Askhat", 407, 665371);
        doctor d2 = new doctor(" Miras ", 503, 165829);

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




    }
}
