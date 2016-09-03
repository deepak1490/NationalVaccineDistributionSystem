/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Inventory.InventoryDirectory;
import Business.NationalDistributor.NationalDistributor;
import Business.Network.Network;
import Business.Network.NetworkDirectory;
import Business.Order.Order;
import Business.Organization.Organization;
import Business.Role.CdcSystemAdminRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.Vaccine.VaccineCatalog;
import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
public class Cdc extends Enterprise {

    private static Cdc business;
    private NetworkDirectory networkDirectory;
    private VaccineCatalog vaccineCatalog;
    private NationalDistributor nationalDistributor;
    private InventoryDirectory inventoryDirectory;
    private float ratio = (float) 0.6;

    public static Cdc getInstance() {
        if (business == null) {
            business = new Cdc();
        }
        return business;
    }

    private Cdc() {
        super(null, null);
        networkDirectory = new NetworkDirectory();
        vaccineCatalog = new VaccineCatalog();
        nationalDistributor = new NationalDistributor();
        inventoryDirectory = new InventoryDirectory();
    }

    public NationalDistributor getNationalDistributor() {
        return nationalDistributor;
    }

    public float getRatio() {
        return ratio;
    }

    public NetworkDirectory getNetworkDirectory() {
        return networkDirectory;
    }

    public VaccineCatalog getVaccineCatalog() {
        return vaccineCatalog;
    }

    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CdcSystemAdminRole());
        return roles;
    }

    public int getQuantity() {
        int count = 0;
        for (Network network : getNetworkDirectory().getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationList().getOrganizationList()) {
                    for (UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()) {
                        Employee employee = userAccount.getEmployee();
                        for (Order order : employee.getMasterOrderCatalog().getOrderCatalog()) {
                            System.out.println(order.getOrderNumber());
                            if (order != null) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
