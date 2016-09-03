/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.PHDAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
public class PHDEnterprise extends Enterprise {

    private ProvidersEnterprise providersEnterprise;
    String name1;

    public PHDEnterprise(String name) {

        super(name, EnterpriseType.PHD);
        providersEnterprise = new ProvidersEnterprise(name1);
    }

    public ProvidersEnterprise getProvidersEnterprise() {
        return providersEnterprise;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PHDAdminRole());
        return roles;
    }
}
