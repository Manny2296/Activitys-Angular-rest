'use strict';
angular.module("ActividadApp.services",["ngResource"]).factory("Actividad", function($resource){
    return $resource('rest/activitys/:id',{id:'@id'},{
    update:{
        method: 'PUT'
    }
    });  
});


