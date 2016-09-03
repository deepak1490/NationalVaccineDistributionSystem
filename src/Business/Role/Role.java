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
import javax.swing.JPanel;

/**
 *
 * @author Deepak
 */
public abstract class Role {

    public enum RoleType {

        CDCSystemAdmin("CDC Admin"),
        PHDAdmin("PHD Admin"),
        ProviderAdmin("Provider Admin"),
        HospitalAdmin("Hospital Admin"),
        HospitalOrderRole("Hospital Order"),
        HospitalInventoryRole("Hospital Inventory"),
        HospitalFinanceRole("Hospital Finance"),
        PharmacyAdmin("Pharmacy Admin"),
        PharmacyOrderRole("Pharmacy Order"),
        PharmacyInventoryRole("Pharmacy Inventory"),
        PharmacyFinanceRole("Pharmacy Finance"),
        ManufacturerAdminRole("Manufacturer Admin");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account, Organization organization,
            Enterprise enterprise, Cdc ecoSystem, DB4OUtil db4o);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
