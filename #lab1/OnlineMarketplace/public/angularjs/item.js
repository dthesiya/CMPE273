//loading the 'login' angularJS module
var item = angular.module('item', [ 'ngRoute' ]);

item.controller('itemController', function($scope, $http) {
	$scope.result = "";
	$scope.getItemDetails = function(item_id) {
		$http({
			method : "POST",
			url : '/itemDetails?item_id=' + item_id,
			data : {}
		}).success(function(data, status) {
			$scope.details = data;
			document.title = data.name + " | MarketPlace";
		}).error(function(error) {
		});
	};
	$scope.getDetails = function() {
		alert("hello");
	};
});