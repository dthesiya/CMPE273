/*
 * GET home page.
 */

exports.index = function(req, res) {
	res.render('index', {
		title : 'Express'
	});
};

exports.renderAuthentication = function(req, res) {
	res.render('authentication', {});
};

exports.getItems = function(req, res) {
	var data = [ {
		id : 1,
		name : "iPhone6",
		desc : "desc6"
	}, {
		id : 2,
		name : "iPhone7",
		desc : "desc7"
	}, {
		id : 3,
		name : "iPhone8",
		desc : "desc8"
	}, {
		id : 4,
		name : "iPhone9",
		desc : "desc9"
	}, {
		id : 5,
		name : "iPhone10",
		desc : "desc10"
	} ];
	res.send(data).end();
};