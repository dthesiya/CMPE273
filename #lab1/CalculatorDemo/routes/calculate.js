
/*
 * GET home page.
 */
//var express = require('express');
//var router = express.Router();
//'0.0[0000]
var numeral = require('numeral');

exports.add = function(req, res) {
	var x = req.body.x;
	var y = req.body.y;
	if (!isNaN(x) && !isNaN(y)) {
		var response = {result : numeral(Number(x) + Number(y)).format('0[.]0[00]')};
		res.send(response);
	} else {
		var response = {result : "Please Enter valid inputs"};
		res.send(response);
	}
};

exports.subtract = function(req, res) {
	var x = req.body.x;
	var y = req.body.y;
	if (!isNaN(x) && !isNaN(y)) {
		var response = {result : numeral(Number(x) - Number(y)).format('0[.]0[00]')};
		res.send(response);
	} else {
		var response = {result : "Please Enter valid inputs"};
		res.send(response);
	}
};

exports.multiply = function(req, res) {
	var x = req.body.x;
	var y = req.body.y;
	if (!isNaN(x) && !isNaN(y)) {
		var response = {result : numeral(Number(x) * Number(y)).format('0[.]0[00]')};
		res.send(response);
	} else {
		var response = {result : "Please Enter valid inputs"};
		res.send(response);
	}
};

exports.divide = function(req, res) {
	var x = req.body.x;
	var y = req.body.y;
	if (!isNaN(x) && !isNaN(y)) {
		if(Number(y) !== 0){
			var response = {result : numeral(Number(x) / Number(y)).format('0[.]0[00]')};
			res.send(response);
		}else{
			var response = {result : "Please Enter non-zero value for denominator"};
			res.send(response);
		}
	} else {
		var response = {result : "Please Enter valid inputs"};
		res.send(response);
	}
};