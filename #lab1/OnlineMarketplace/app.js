
/**
 * Module dependencies.
 */

var express = require('express')
  , routes = require('./routes')
  , user = require('./routes/user')
  , signin = require('./routes/authentication')
  , details = require('./routes/details')
  , index = require('./routes/index')
  , http = require('http')
  , path = require('path');

var app = express();

var favicon = require('serve-favicon');

// all environments
app.set('port', process.env.PORT || 3000);
app.set('views', __dirname + '/views');
app.set('view engine', 'ejs');
app.use(favicon(path.join(__dirname,'public','images','favicon.ico')));
app.use(express.logger('dev'));
app.use(express.bodyParser());
app.use(express.methodOverride());
app.use(app.router);
app.use(express.static(path.join(__dirname, 'public')));

// development only
if ('development' == app.get('env')) {
  app.use(express.errorHandler());
}

app.get('/', index.index);
app.get('/authentication', index.renderAuthentication);
app.get('/itemdetails', details.renderItemDetails);
app.get('/sell', index.renderAuthentication);
app.get('/signin', signin.renderSignin);
app.get('/register', signin.renderRegister);

app.post('/items', index.getItems);
app.post('/itemdetails', details.getItemDetails);
app.post('/signin', signin.signin);
app.post('/register', signin.register);
app.get('/users', user.list);

http.createServer(app).listen(app.get('port'), function(){
  console.log('Express server listening on port ' + app.get('port'));
});
