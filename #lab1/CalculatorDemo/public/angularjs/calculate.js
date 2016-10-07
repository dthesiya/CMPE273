//loading the 'login' angularJS module
var calculate = angular.module('calculator', [ 'ngRoute' ]);
// defining the login controller
calculate.controller('calculatorController', function($scope, $http) {
	$scope.x = $scope.y = 0;
	$scope.result = "";
	$scope.add = function() {
		$http({
			method : "POST",
			url : '/add',
			data : {
				"x" : $scope.x,
				"y" : $scope.y
			}
		}).success(function(data) {
			// checking the response data for statusCode
			// if (data.statusCode == 201) {
			$scope.result = data.result;
			// } else {
			// $scope.result = "Invalid Selections";
			// }
			// Making a get call to the '/redirectToHomepage' API
			// window.location.assign("/homepage");
		}).error(function(error) {
			$scope.result = "Error Occured";
		});
	};
	$scope.subtract = function() {
		$http({
			method : "POST",
			url : '/subtract',
			data : {
				"x" : $scope.x,
				"y" : $scope.y
			}
		}).success(function(data) {
			// checking the response data for statusCode
			// if (data.statusCode == 201) {
			$scope.result = data.result;
			// } else {
			// $scope.result = "Invalid Selections";
			// }
			// Making a get call to the '/redirectToHomepage' API
			// window.location.assign("/homepage");
		}).error(function(error) {
			$scope.result = "Error Occured";
		});
	};
	$scope.multiply = function() {
		$http({
			method : "POST",
			url : '/multiply',
			data : {
				"x" : $scope.x,
				"y" : $scope.y
			}
		}).success(function(data) {
			// checking the response data for statusCode
			// if (data.statusCode == 201) {
			$scope.result = data.result;
			// } else {
			// $scope.result = "Invalid Selections";
			// }
			// Making a get call to the '/redirectToHomepage' API
			// window.location.assign("/homepage");
		}).error(function(error) {
			$scope.result = "Error Occured";
		});
	};
	$scope.divide = function() {
		$http({
			method : "POST",
			url : '/divide',
			data : {
				"x" : $scope.x,
				"y" : $scope.y
			}
		}).success(function(data) {
			// checking the response data for statusCode
			// if (data.statusCode == 201) {
			$scope.result = data.result;
			// } else {
			// $scope.result = "Invalid Selections";
			// }
			// Making a get call to the '/redirectToHomepage' API
			// window.location.assign("/homepage");
		}).error(function(error) {
			$scope.result = "Error Occured";
		});
	};
})
