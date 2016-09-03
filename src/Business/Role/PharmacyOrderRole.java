/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Cdc;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Provider.PharmacyOrderWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Deepak
 */
public class PharmacyOrderRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Cdc ecoSystem, DB4OUtil db4o) {
        return new PharmacyOrderWorkAreaJPanel(userProcessContainer, account, organization, enterprise, ecoSystem, db4o);
    }

}
