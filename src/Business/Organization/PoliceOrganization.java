/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Police.PoliceDirectory;
import Business.Role.PoliceRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vidhi
 */
public class PoliceOrganization extends Organization{
    PoliceDirectory policelist;
    
    public PoliceOrganization(String name)
    {
        super(Organization.Type.Police.getValue());
        policelist=new PoliceDirectory();
    }


    public PoliceDirectory getPolicelist() {
        return policelist;
    }

    public void setPolicelist(PoliceDirectory policelist) {
        this.policelist = policelist;
    }
 
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new PoliceRole());
       return role;
       
    } 
}
