Android Install Referrer
========================

This plugin captures the referrer value passed when an android app is installed from a webpage. 

## Install

`cordova plugins add https://github.com/sDofeen/cordova-plugin-install-referrer.git`

## Usage

To use this plugin, add `&referrer=xyz` to app install links on your webpages. For example: 
```
https://play.google.com/store/apps/details?id=your.package.id&referrer=referrer-value
```

## API

```javascript
// Callback style
cordova.plugins.referrer.get(success, error);

// Promise style
let promise = cordova.plugins.referrer.get();
```

## Example
```javascript
// Callback style
cordova.plugins.referrer.get((referrer) => {
    console.log(referrer);
}, (error) => {
    console.error(error);
});

// Promise style
cordova.plugins.referrer.get().then((referrer) => {
    console.log(referrer);
}).catch((error) => {
    console.error(error);
});
```

## Testing

To test that the install referrer event is received by the plugin in your emulator:

run `adb shell` and then 

```
am broadcast -a com.android.vending.INSTALL_REFERRER \
-n <your.package.id>/cordova-plugin-install-referrer.receiver \
--es "referrer" "referrer-value"
```
