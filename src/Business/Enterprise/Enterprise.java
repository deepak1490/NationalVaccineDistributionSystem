/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author Deepak
 */
public abstract class Enterprise extends Organization {

    private OrganizationDirectory organizationList;
    private EnterpriseType enterpriseType;

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationList = new OrganizationDirectory();
    }

    public enum EnterpriseType {

        Distributor("Distributor"), PHD("Public Health Department"),
        Providers("Providers"), Manufactures("Manufactures");
        private String value;

        private EnterpriseType(String value) {
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

    public OrganizationDirectory getOrganizationList() {
        return organizationList;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }
}
