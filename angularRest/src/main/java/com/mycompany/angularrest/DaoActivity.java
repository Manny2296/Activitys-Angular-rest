/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.angularrest;

import com.mycompany.logic.Actividad;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author APR_Portatil
 */
public class DaoActivity {
    public static int idSec = 1 ;
    private static List<Actividad> actividades;
    static{
        final Actividad act = new Actividad(){{
           setId(idSec++);
            setName("Firt Activity");
            setDescription("This activity is for learn english and practice this");
            setPriority("Hight");
          
           }};
         actividades = new   ArrayList<Actividad>(){{
               add(act);
        }};
    }
    public static List<Actividad> queryAll(){
        return actividades;
    }
    
    public static Actividad getActivitById(int id){
        for (Actividad actividade : actividades) {
            if(actividade.getId() == id){
                return actividade;
                
            }
        }
        return null;
    }
    
    public static Actividad addActivity(Actividad act){
        act.setId(idSec++);
        actividades.add(act);
        return act;
    }
   public static void updateActivity(Actividad act){
       Actividad resp = getActivitById(act.getId());
       resp.setName(act.getName());
       resp.setDescription(act.getDescription());
       resp.setPriority(act.getPriority());
   }
   public static void deleteActivity(Integer id){
       int index = 0;
       for (int i = 0; i < actividades.size(); i++) {
           if(actividades.get(i).getId() == id) index = i;
       }
       actividades.remove(index);
   }
    
    
}
