var exec = require('cordova/exec');

function getReferrer(success, error) {

	if(!success) {
		return new Promise(function(resolve, reject) {
			getReferrer(resolve, reject);
		});
	}

	exec(function(ref) {
		if(ref) {
			success(ref);
		} else {
			setTimeout(function() {
				getReferrer(success, error)
			}, 500);
		}
	}, error, 'referrer');
}

exports.getReferrer = getReferrer;
exports.get = getReferrer;
