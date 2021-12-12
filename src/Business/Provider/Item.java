/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Provider;

/**
 *
 * @author vidhi
 */
public class Item {
    private String itemId;
    private static int sCount=0;
    private int quantity;
    private String requirementType;
    private String requirement;
   
    public Item(){
        itemId="Item"+(+sCount);        
    }



    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    
    public String getRequirementType() {
        return requirementType;
    }

    public void setRequirementType(String requirementType) {
        this.requirementType = requirementType;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }
    
    
    @Override
    public String toString(){
        return getRequirementType();
    }
    
}
