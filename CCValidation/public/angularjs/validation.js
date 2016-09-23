//loading the 'validation' angularJS module
var validation = angular.module('validation', []);
// defining the validation controller
validation.controller('validation', function($scope, $http) {
	$scope.validate = function() {
		$http({
			method : "POST",
			url : '/validate',
			data : {
				"ccnumber" : $scope.CCNumber,
				"month" : $scope.month,
				"year" : $scope.year,
				"cvv" : $scope.cvv
			}
		}).success(function(data) {
			var isccnumber = data.isccnumber;
			var ismonth = data.ismonth;
			var iscvv = data.iscvv;
			console.log(isccnumber + ":" + isccnumber + ":" + iscvv);
			var resultStr = "";
			if (isccnumber === true) {
				resultStr = resultStr + "Invalid Card Number";
			}
			console.log(resultStr);
			if (ismonth === true) {
				if (resultStr.length > 0) {
					resultStr = resultStr + ", ";
				}
				resultStr = resultStr + "Invalid Validity Period";
			}
			console.log(resultStr);
			if (iscvv === true) {
				if (resultStr.length > 0) {
					resultStr = resultStr + ", ";
				}
				resultStr = resultStr + "Invalid CVV number";
			}
			console.log(resultStr);
			if (resultStr.length > 0) {
				$scope.result = resultStr;
			} else {
				$scope.result = "Validation Successful";
			}
		}).error(function(error) {
			$scope.result = "Request failure";
		});
	};
})
