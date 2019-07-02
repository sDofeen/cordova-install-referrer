var exec = require('cordova/exec');

function getReferrer(success, error) {
    if (!success) {
        return new Promise(function (resolve, reject) {
            getReferrer(resolve, reject);
        });
    }

    exec(function (result) {
        if (result) {
            success(result);
        } else {
            setTimeout(function () {
                getReferrer(success, error)
            }, 500);
        }
    }, error, 'referrer');
}

exports.getReferrer = getReferrer;
exports.get = getReferrer;