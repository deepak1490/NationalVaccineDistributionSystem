/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
public class HospitalDirectory {

    private ArrayList<Hospital> hospitalList;

    public HospitalDirectory() {
        hospitalList = new ArrayList<>();
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public Hospital addHospital() {
        Hospital h = new Hospital();
        hospitalList.add(h);
        return h;
    }

    public void removeHospital(Hospital h) {
        hospitalList.remove(h);
    }

    public Hospital searchHospital(String name) {

        for (Hospital h : hospitalList) {
            if (h.getHospitalName().equals(name)) {
                return h;
            }
        }
        return null;
    }
}
