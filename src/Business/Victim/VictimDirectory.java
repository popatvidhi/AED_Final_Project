/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Victim;

import java.util.ArrayList;

/**
 *
 * @author vidhi
 */
public class VictimDirectory {
    private ArrayList<Victim> changeSeekerDirectory;

    public VictimDirectory() {
        changeSeekerDirectory=new ArrayList<>();
        
    }

    public ArrayList<Victim> getChangeSeekerDirectory() {
        return changeSeekerDirectory;
    }

    public void setChangeSeekerDirectory(ArrayList<Victim> changeSeekerDirectory) {
        this.changeSeekerDirectory = changeSeekerDirectory;
    }
    
    public Victim addChangeSeeker(){
        Victim cs= new Victim();
        changeSeekerDirectory.add(cs);
        return cs;
    }
    
    public void removeChangeSeeker(Victim cs){
        changeSeekerDirectory.remove(cs);
    }
    
}
