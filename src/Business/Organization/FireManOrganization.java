/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.FireMan.FireManDirectory;
import Business.Police.PoliceDirectory;
import Business.Role.FireManRole;
import Business.Role.PoliceRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vidhi
 */
public class FireManOrganization extends Organization{
    FireManDirectory fireManlist;
    
    public FireManOrganization(String name)
    {
        super(Organization.Type.FireMan.getValue());
        fireManlist=new FireManDirectory();
    }


    public FireManDirectory getFireManlist() {
        return fireManlist;
    }

    public void setFireManlist(FireManDirectory fireManlist) {
        this.fireManlist = fireManlist;
    }
 
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new FireManRole());
       return role;
       
    } 
}
