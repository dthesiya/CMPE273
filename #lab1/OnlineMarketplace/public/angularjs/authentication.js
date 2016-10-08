//loading the 'login' angularJS module
var authentication = angular.module('authentication', [ 'ngRoute' ]);

authentication.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when("/", {
		controller : 'signinController',
		templateUrl : "signin"
	}).when("/signin", {
		controller : 'signinController',
		templateUrl : "signin"
	}).when("/register", {
		controller : 'registerController',
		templateUrl : "register"
	});
} ]);

// defining the login controller
authentication.controller('signinController', function($scope, $http) {
	$scope.username = "";
	$scope.password = "";
	$scope.result = "";
	$scope.signin = function() {
		$http({
			method : "POST",
			url : '/signin',
			data : {
				"username" : $scope.username,
				"password" : $scope.password
			}
		}).success(function(data, status) {
			if (status == 201) {
				$scope.result = data.result;
			} else if (status == 206) {
				$scope.result = data.result;
			}
		}).error(function(error) {
			$scope.result = "Error Occured";
		});
	};

});
authentication.controller('registerController', function($scope, $http) {
	$scope.result = "";
	$scope.register = function() {
		$http({
			method : "POST",
			url : '/register',
			data : {
				"username" : $scope.username,
				"password" : $scope.password,
				"fname" : $scope.fname,
				"lname" : $scope.lname,
				"phone" : $scope.phone,
				"bdate" : $scope.bdate
			}
		}).success(function(data, status) {
			if (status == 201) {
				$scope.result = data.result;
			} else if (status == 206) {
				$scope.result = data.result;
			}
		}).error(function(error) {
			$scope.result = "Error Occured";
		});
	};
});

authentication.controller('forgotPasswordController', function($scope, $http) {
	$scope.result = "";
	$scope.forgotPassword = function() {
		$http({
			method : "POST",
			url : '/forgotPassword',
			data : {
				"x" : $scope.x,
				"y" : $scope.y
			}
		}).success(function(data, status) {
			if (status == 201) {
				$scope.result = data.result;
			} else if (status == 206) {
				$scope.result = data.result;
			}
		}).error(function(error) {
			$scope.result = "Error Occured";
		});
	};
});