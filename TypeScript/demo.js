// first code of TS here 
// TS itself a javascript & support all the Syntax of JS by Typescript 
console.log('my first typescript here');
// data type declaration in Typescript 
var myvar = 100;
console.log(typeof (myvar));
console.log('value of the myvar-->' + myvar);
var myvar1 = 'session is up';
console.log(typeof (myvar1));
console.log('value of string here-->' + myvar1);
// one more data type which is supe data type is called any 
// any
var test = 10;
console.log(typeof (test));
console.log("value of the prpoperty-->" + test);
// define methods in Typescript 
// Noraml Method 
function addValue(value1, value2) {
    console.log('addition of the value of both param');
    return value1 + value2;
}
console.log(addValue(45, 45));
// method with optional param which is representing by the ? 
// with Default param 
function details(id, name, mail_id) {
    console.log("ID-->" + id);
    console.log("Name-->" + name);
    if (mail_id != undefined) {
        console.log("Email-Id-->" + mail_id);
    }
}
details(123, "amit");
details(123, "vivek", "trainig@yahoo.com");
// default parameter in typescript 
// defual parameter in methods 
function discount(price, rate) {
    if (rate === void 0) { rate = 0.50; }
    var discount = price * rate;
    console.log("Discount AMount --->" + discount);
    return discount;
}
console.log(discount(1000));
console.log(discount(1000, 0.30));
// enum here 
var myConstants;
(function (myConstants) {
    myConstants[myConstants["pi"] = 3.14] = "pi";
    myConstants[myConstants["e"] = 2.73] = "e";
    myConstants[myConstants["log2"] = 0.3] = "log2";
    myConstants[myConstants["log3"] = 0.7] = "log3";
})(myConstants || (myConstants = {}));
console.log("finding the ENUM");
console.log(2 * myConstants.pi);
