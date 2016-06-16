/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.angularrest.DaoActivity;
import com.mycompany.logic.Actividad;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author APR_Portatil
 */
@Path("/activitys")
public class ActivityService {
@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Actividad> getActivities(){
    return DaoActivity.queryAll();
} 
@GET
@Path("{id}")
@Produces(MediaType.APPLICATION_JSON)
public Actividad getActivityById(@PathParam("id") String id){
        return DaoActivity.getActivitById(Integer.valueOf(id));
        
                }
@POST 
@Produces(MediaType.APPLICATION_JSON)
public Actividad addActivity(Actividad act){
    return DaoActivity.addActivity(act);
}
@PUT
@Path("{id}")
@Produces(MediaType.APPLICATION_JSON)
public void updateActivity(Actividad act){
    DaoActivity.updateActivity(act);
}

@DELETE
@Path("{id}")
@Produces(MediaType.APPLICATION_JSON)
public void deleteActivity(@PathParam("id") String id){
    DaoActivity.deleteActivity(Integer.valueOf(id));
}


    
}

