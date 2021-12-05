/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.UserAccount.UserAccountDirectory;
import com.sun.corba.se.spi.orbutil.threadpool.WorkQueue;
import java.util.HashSet;
import javax.management.relation.Role;

/**
 *
 * @author ymayank97
 */


public abstract class Organization {
    
    private String name;
    private String orgName;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationCode;
    private static int count=0;
    public HashSet<Role> role;
    
    public enum Type {
        Victim("Victim Organization"),
        ChangeMaker("ChangeMaker Organization"),
        Volunteer("Volunteer Organization"),
        NGO("NGO Organization"),
        Supplier("Supplier"),
        Doctor("Doctor"),
        LegalFirm("LegalFirm");
        
        private String value;
        private Type(String value){
            this.value = value;
        }
        public String getValue(){
            return value;
        }
    }
    
    public Organization (String name)
    {
      this.name = name;
//      workQueue = new WorkQueue();
      employeeDirectory = new EmployeeDirectory();
      userAccountDirectory = new UserAccountDirectory();
     
      organizationCode = count;
      role = new HashSet<>();
      ++count;        
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    
    public abstract HashSet<Role> getSupportedRole();

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationCode() {
        return organizationCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    @Override
    public String toString()
    {
        return name;
    }
}











