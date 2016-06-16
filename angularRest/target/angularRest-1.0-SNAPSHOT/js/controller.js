'use strict';
angular.module("ActividadApp.controllers",[]).controller("ActivityList", function($scope,Actividad){
   $scope.name = "Manuel";
   $scope.actividades = Actividad.query();
   $scope.$on("updateActivity", function(event,act){
      $scope.actividades.push(act);
   });
   $scope.remove = function(inx){
    $scope.actividades[inx].$remove(function(res){
     $scope.actividades.forEach(function(p,index){
       if(index===inx) $scope.actividades.splice(index,1); 
     }) ;
    });
   };
}).controller("ActDtlleController",function($scope, $routeParams , Actividad){
    $scope.act = Actividad.get({id : $routeParams.actId});
}).controller("ActAddCtrl", function($rootScope, $scope , Actividad){
$scope.name ="";
$scope.description ="";
$scope.priority = "Low";
$scope.add = function()
{
  var act = new Actividad();  
  act.name = $scope.name;
  act.description = $scope.description;
  act.priority = $scope.priority;
  act.$save(function(){
      $rootScope.$broadcast("updateActivity" , act);
  });
};
        
}).controller("ActUpdtController", function($scope,$routeParams, $location, Actividad){
$scope.act = Actividad.get({id: $routeParams.actId});
$scope.update = function(){
 $scope.act.$update(function(){
   $location.path("/activityDetail/"+ $scope.act.id);  
 });  

};
});
function clearTextbox(){


}