/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author vidhi
 */
public abstract class Role {
    
    public enum RoleType{
        SystemAdmin("SystemAdmin"),
        VictimAdmin("VictimAdmin"),
        Victim("Victim"),
        ChangeMakerAdmin("ChangeMakerAdmin"),
        ChangeMaker("ChangeMaker"),
        EnterPriseAdmin("EnterpriseAdmin"),
        CommunityAdminRole("CommunityAdminRole"),
        NGOAdminRole("NGOAdminRole"),
        NGOManagerRole("NGOManagerRole"),
        SupplierAdminRole("SupplierAdminRole"),
        SupplierManagerRole("SupplierManagerRole"),
        VolunteerAdminRole("VolunteerAdminRole"),
        VolunteerRole("VolunteerRole"),
        SupplierRole("SupplierRole"),
        LawyerRole("LawyerRole"),
        LawyerAdminRole("LawyerAdminRole"),
        DoctorAdminRole("DoctorAdminRole"),
        Doctor("Doctor");
        
        
        private String value;
        private RoleType(String value){
            this.value=value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system);
    
    
    
}
