/*
 * GET home page.
 */

exports.index = function(req, res) {
	res.render('index', {
		title : 'MarketPlace'
	});
};

exports.renderAuthentication = function(req, res) {
	res.render('authentication', {});
};

exports.getItems = function(req, res) {
	var data = [ {
		id : 1,
		name : "iPhone6",
		price : 550,
		desc : "desc6"
	}, {
		id : 2,
		name : "iPhone7",
		price : 600,
		desc : "desc7"
	}, {
		id : 3,
		name : "iPhone8",
		price : 650,
		desc : "desc8"
	}, {
		id : 4,
		name : "iPhone9",
		price : 700,
		desc : "desc9"
	}, {
		id : 5,
		name : "iPhone10",
		price : 750,
		desc : "desc10"
	} ];
	res.send(data).end();
};