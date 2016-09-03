/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.ManufacturerAdminRole;
import java.util.ArrayList;
import Business.Role.Role;

/**
 *
 * @author Deepak
 */
public class ManufacturerEnterprise extends Enterprise {

    public ManufacturerEnterprise(String name) {
        super(name, EnterpriseType.Manufactures);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ManufacturerAdminRole());
        return roles;
    }
}
