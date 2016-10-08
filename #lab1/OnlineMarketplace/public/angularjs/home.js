//loading the 'login' angularJS module
var app = angular.module('app', [ 'ngRoute' ]);

app.controller('appController', function($scope, $http) {
	$scope.result = "";
	$scope.getItems = function() {
		$http({
			method : "POST",
			url : '/items',
			data : {

			}
		}).success(function(data, status) {
			$scope.items = data;
		}).error(function(error) {
			$scope.items = [];
		});
	};
	$scope.getDetails = function() {
		alert("hello");
	};
});