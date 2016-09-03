/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HospitalOrderRole;
import Business.Role.PharmacyOrderRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
public class OrderOrganization extends Organization {

    public OrderOrganization() {
        super(Organization.Type.Order.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HospitalOrderRole());
        roles.add(new PharmacyOrderRole());
        return roles;
    }
}
