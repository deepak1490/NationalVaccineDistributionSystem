/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NationalDistributor;

import Business.Enterprise.Enterprise;
import Business.Role.NationalDistributorAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
public class NationalDistributor extends Enterprise {

    public NationalDistributor() {
        super("Deepak", EnterpriseType.Distributor);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new NationalDistributorAdminRole());
        return roles;
    }

}
