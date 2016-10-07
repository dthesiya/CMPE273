/**
 * http://usejsdoc.org/
 */
exports.renderSignin = function(req, res) {
	res.render('signin', {});
};

exports.renderRegister = function(req, res) {
	res.render('register', {});
};

exports.signin = function(req, res) {
	var username = req.body.username;
	var password = req.body.password;
	if (username && password) {
		//fetch data from mysql using username and compare encrypted password
		//if yes return redirect, else return incorrect
		/*var response = {
			result : "true"
		};
		res.status(201).send(response);*/
		res.redirect("register", {"username" : username});
	} else {
		var response = {
			result : "Please Enter valid credentials"
		};
		res.status(206).send(response);
	}
};

exports.register = function(req, res) {
	var username = req.body.username;
	var password = req.body.password;
	var fname = req.body.fname;
	var lname = req.body.lname;
	var phone = req.body.phone;
	var bdate = req.body.bdate;
	if (username && password && fname && lname && phone && bdate) {
		var response = {
			result : "true"
		};
		res.status(201).send(response);
	} else {
		var response = {
			result : "Please Enter valid credentials"
		};
		res.status(206).send(response);
	}
};