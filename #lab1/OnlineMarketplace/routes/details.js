/*
 * GET home page.
 */

exports.renderItemDetails = function(req, res) {
	res.render('itemdetails', {
		item_id : req.query.item_id
	});
};

exports.getItemDetails = function(req, res) {
	var data = {
		id : req.query.item_id,
		name : "iPhone6",
		price : 550,
		desc : "It is very cool cell phone you will ever get to use"
	};
	res.send(data).end();
};