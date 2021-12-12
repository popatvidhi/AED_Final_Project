/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Provider.ProviderDirectory;
import Business.Role.ProviderRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vidhi
 */
public class ProviderOrganization extends Organization{
    ProviderDirectory providerList;

    //Supplier supplier;
    public ProviderOrganization(String name) {
        super(Organization.Type.Provider.getValue());
        providerList= new ProviderDirectory();
      
    }

    public ProviderDirectory getProviderList() {
        return providerList;
    }

    public void setProviderList(ProviderDirectory providerList) {
        this.providerList = providerList;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
       
        role.add(new ProviderRole());
        return role;
    }
}
