/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.VictimRole;
import Business.Victim.VictimDirectory;
import java.util.HashSet;

/**
 *
 * @author vidhi
 */
public class VictimOrganization extends Organization{
    VictimDirectory victimList;
    public VictimOrganization()
    {
        super(Organization.Type.Victim.getValue());
        victimList=new VictimDirectory();
    }

    public VictimDirectory getChangeseekerlist() {
        return victimList;
    }

    public void setChangeseekerlist(VictimDirectory victimList) {
        this.victimList = victimList;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new VictimRole());
        return role;
        
    }
}
