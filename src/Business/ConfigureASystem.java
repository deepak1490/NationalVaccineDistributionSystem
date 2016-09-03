/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ProvidersEnterprise;
import Business.Inventory.InventoryItem;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.CdcSystemAdminRole;
import Business.Role.ManufacturerAdminRole;
import Business.Role.NationalDistributorAdminRole;
import Business.Role.PHDAdminRole;
import Business.Role.ProviderAdminRole;
import Business.UserAccount.UserAccount;
import Business.Vaccine.Vaccine;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Deepak
 */
public class ConfigureASystem {

    public static Cdc configure() {
        Cdc system = Cdc.getInstance();

        //Create a network
        //Create an enterprise5
        //Initialize some organization
        //Have Some Employess
        //Create UserAccount for the emoloyees
        Employee employee1 = system.getEmployeeDirectory().createEmployee();
        employee1.setFname("Vinay");
        employee1.setLname("Limbare");
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("na", "na", employee1, new NationalDistributorAdminRole());
        
        Network network = system.getNetworkDirectory().addNetwork("Massuchusetts");
        network.setPopulation(20000);
        Network network1 = system.getNetworkDirectory().addNetwork("Newyork");
        network1.setPopulation(10000);

        //PHD for Network1
        Enterprise enterprise = network.getEnterpriseDirectory().addEnterprise("Public Health Dept", Enterprise.EnterpriseType.PHD);
        Organization org = enterprise.getOrganizationList().createOrganization(Organization.Type.Admin);
        Employee emp = enterprise.getEmployeeDirectory().createEmployee();
        emp.setFname("PH");
        emp.setLname("PH");
        enterprise.getUserAccountDirectory().createUserAccount("ph", "ph", emp, new PHDAdminRole());

        //Provider for Network1
        ProvidersEnterprise enterprise1 = (ProvidersEnterprise) network.getEnterpriseDirectory().addEnterprise("Providers", Enterprise.EnterpriseType.Providers);
        Organization org1 = enterprise1.getOrganizationList().createOrganization(Organization.Type.Admin);
        Organization org2 = enterprise1.getOrganizationList().createOrganization(Organization.Type.Finance);
        Organization org3 = enterprise1.getOrganizationList().createOrganization(Organization.Type.Order);
        Organization org4 = enterprise1.getOrganizationList().createOrganization(Organization.Type.Patient);
        Organization org5 = enterprise1.getOrganizationList().createOrganization(Organization.Type.Clinic);
        Employee emp1 = enterprise.getEmployeeDirectory().createEmployee();
        emp1.setFname("P");
        emp1.setLname("P");
        enterprise1.getUserAccountDirectory().createUserAccount("p", "p", emp1, new ProviderAdminRole());

        //Manufacturer for Network 1
        Enterprise enterprise3 = network.getEnterpriseDirectory().addEnterprise("Manufacturer", Enterprise.EnterpriseType.Manufactures);
        Organization org6 = enterprise3.getOrganizationList().createOrganization(Organization.Type.Admin);
        Employee emp2 = enterprise3.getEmployeeDirectory().createEmployee();
        emp2.setFname("Ma");
        emp2.setLname("Ma");
        enterprise3.getUserAccountDirectory().createUserAccount("m", "m", emp2, new ManufacturerAdminRole());

        //PHD for Network2
        Enterprise enterprise2 = network1.getEnterpriseDirectory().addEnterprise("Public Health Dept", Enterprise.EnterpriseType.PHD);
        Organization org7 = enterprise2.getOrganizationList().createOrganization(Organization.Type.Admin);
        Employee emp3 = enterprise2.getEmployeeDirectory().createEmployee();
        emp3.setFname("Ny");
        emp3.setLname("Ny");
        enterprise2.getUserAccountDirectory().createUserAccount("ph1", "ph1", emp3, new PHDAdminRole());

        //Provider for Network2
        Enterprise enterprise4 = network1.getEnterpriseDirectory().addEnterprise("Providers", Enterprise.EnterpriseType.Providers);
        Organization org8 = enterprise4.getOrganizationList().createOrganization(Organization.Type.Admin);
        Organization org9 = enterprise4.getOrganizationList().createOrganization(Organization.Type.Finance);
        Organization org10 = enterprise4.getOrganizationList().createOrganization(Organization.Type.Order);
        Organization org11 = enterprise4.getOrganizationList().createOrganization(Organization.Type.Patient);
        Organization org12 = enterprise4.getOrganizationList().createOrganization(Organization.Type.Clinic);
        Employee emp4 = enterprise4.getEmployeeDirectory().createEmployee();
        emp4.setFname("P");
        emp4.setLname("P");
        enterprise4.getUserAccountDirectory().createUserAccount("p1", "p1", emp4, new ProviderAdminRole());

        //Manufacturer for Network 1
        Enterprise enterprise5 = network1.getEnterpriseDirectory().addEnterprise("Manufacturer", Enterprise.EnterpriseType.Manufactures);
        Organization org13 = enterprise5.getOrganizationList().createOrganization(Organization.Type.Admin);
        Employee emp5 = enterprise3.getEmployeeDirectory().createEmployee();
        emp5.setFname("Ma");
        emp5.setLname("Ma");
        enterprise3.getUserAccountDirectory().createUserAccount("m1", "m1", emp5, new ManufacturerAdminRole());

        //NAtional Distributor
        Employee employee = system.getEmployeeDirectory().createEmployee();
        employee.setFname("Deepak");
        employee.setLname("VijayaKumar");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new CdcSystemAdminRole());

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE, 5);

        Calendar c1 = Calendar.getInstance();
        c1.setTime(new Date());
        c1.add(Calendar.DATE, 365);

        Vaccine vaccine = system.getVaccineCatalog().addVaccine();
        vaccine.setVaccineName("Influenza");
        vaccine.setDiseaseName("Flu");
        vaccine.setManufactureDate(sdf.format(c.getTime()));
        vaccine.setExpiryDate(sdf.format(c1.getTime()));
        vaccine.setPrice((float) 12.99);
        vaccine.setManufacturer(emp5.getFname());

        Vaccine vaccine1 = system.getVaccineCatalog().addVaccine();
        vaccine1.setVaccineName("Varicella");
        vaccine1.setDiseaseName("Chicken Pox");
        vaccine1.setManufactureDate(sdf.format(c.getTime()));
        vaccine1.setExpiryDate(sdf.format(c1.getTime()));
        vaccine1.setPrice((float) 13.99);
        vaccine.setManufacturer(emp5.getFname());

        Network n = null;

        InventoryItem item = network.getInventoryDirectory().addInventory(network, vaccine, 20);

        InventoryItem item1 = network.getInventoryDirectory().addInventory(network, vaccine1, 20);

        InventoryItem item2 = network1.getInventoryDirectory().addInventory(network1, vaccine, 10);

        InventoryItem item3 = network1.getInventoryDirectory().addInventory(network1, vaccine1, 10);

        return system;
    }

}
