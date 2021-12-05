/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author ymayank97
 */
public class EnterpriseDirectory {
    
private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory()
    {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
//        if(type == Enterprise.EnterpriseType.Community){
//            enterprise = new CommunityEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
//        else if(type == Enterprise.EnterpriseType.Supplier){
//            enterprise= new SupplierEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
//         else if(type == Enterprise.EnterpriseType.NGO){
//            enterprise= new NGOEnterprise(name);
//            enterpriseList.add(enterprise);
//         }
//            else if(type == Enterprise.EnterpriseType.LegalAdviser){
//            enterprise= new LegalAdviserEnterprise(name);
//            enterpriseList.add(enterprise);
//         }
//            else if(type == Enterprise.EnterpriseType.Healthcare){
//            enterprise= new HealthcareEnterprise(name);
//            enterpriseList.add(enterprise);
//         }
        return enterprise;
        
    }
   
    
}


