/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Admin.getValue())) {
            organization = new AdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Finance.getValue())) {
            organization = new FinanceOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Order.getValue())) {
            organization = new OrderOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Clinic.getValue())) {
            organization = new ClinicOrganization();
            organizationList.add(organization);
        }

        return organization;
    }
}
