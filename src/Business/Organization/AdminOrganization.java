/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ClinicAdminRole;
import Business.Role.HospitalAdminRole;
import Business.Role.ManufacturerAdminRole;
import Business.Role.PHDAdminRole;
import Business.Role.PharmacyAdminRole;
import Business.Role.ProviderAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
public class AdminOrganization extends Organization {

    public AdminOrganization() {
        super(Organization.Type.Admin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProviderAdminRole());
        roles.add(new ManufacturerAdminRole());
        roles.add(new PHDAdminRole());
        roles.add(new HospitalAdminRole());
        roles.add(new PharmacyAdminRole());
        roles.add(new ClinicAdminRole());
        return roles;
    }
}
