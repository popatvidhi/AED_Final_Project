/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author vidhi
 */
public class ConfigureASystem {
    public static Ecosystem configure(){
   Ecosystem system= Ecosystem.getInstance();
   
//   Employee employee= system.getEmployeeDirectory().createEmployee("SYSTEM ADMIN");
//   UserAccount ua= system.getUserAccountDirectory().createUserAccount("admin","admin", employee, new SystemAdminRole());
    
    return system;
    }
}



