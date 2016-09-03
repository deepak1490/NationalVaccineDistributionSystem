/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HospitalFinanceRole;
import Business.Role.PharmacyFinanceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
public class FinanceOrganization extends Organization {

    public FinanceOrganization() {
        super(Organization.Type.Finance.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HospitalFinanceRole());
        roles.add(new PharmacyFinanceRole());
        return roles;
    }
}
