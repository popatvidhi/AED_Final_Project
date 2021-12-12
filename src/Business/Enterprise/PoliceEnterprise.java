/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.PoliceRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vidhi
 */
public class PoliceEnterprise extends Enterprise{
    public PoliceEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Police);
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new PoliceRole());
        return role;
    }
}
