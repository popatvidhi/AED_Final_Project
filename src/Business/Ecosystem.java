/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author lzy_1
 */
public class Ecosystem{
    
    private static Ecosystem business;

    
    
    public static Ecosystem getInstance()
    {
     if(business == null)
     {
         business = new Ecosystem();
     }
     return business;
    }




    public static void setInstance(Ecosystem system)
    {
        business = system;
    }
    
    
}



