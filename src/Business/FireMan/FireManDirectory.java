/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FireMan;

import Business.Police.*;
import java.util.ArrayList;

/**
 *
 * @author vidhi
 */
public class FireManDirectory {
    private ArrayList<FireMan> fireManList;

    public FireManDirectory() {
        fireManList=new ArrayList();
        
    }

    public ArrayList<FireMan> getFireManList() {
        return fireManList;
    }

    public void setPoliceList(ArrayList<FireMan> fireManList) {
        this.fireManList = fireManList;
    }
    
    
        public FireMan addFireMan(){
        FireMan l= new FireMan();
        fireManList.add(l);
        return l;
    }
    
    public void removePolice(FireMan l){
        fireManList.remove(l);
    }
}
