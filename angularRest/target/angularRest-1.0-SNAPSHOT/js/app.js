'use strict';
angular.module('ActividadApp',['ngRoute','ActividadApp.services','ActividadApp.controllers']).config(
 function($routeProvider){
   $routeProvider.when('/',{templateUrl:'views/list.html', controller: 'ActivityList'}); 
   $routeProvider.when('/activityDetail/:actId', {templateUrl: 'views/detalle.html' , controller:'ActDtlleController'});
   $routeProvider.when('/activityUpdate/:actId',{templateUrl:'views/update.html',controller:'ActUpdtController'});
   $routeProvider.otherwise({redirectTo: '/'});
 });
        

