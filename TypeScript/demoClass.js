// 70 % code is same for ES6 Impl in Typescript 
var Person = /** @class */ (function () {
    function Person(a) {
        this.personId = a;
        this.orderId = 201;
        console.log('person object is init-->');
        console.log('person id is--->' + this.personId);
    }
    // create the public method here 
    Person.prototype.createperson = function () {
        console.log('person ID with Order ID is -->' + this.orderId);
        return "person is created by person id -->" + "" + this.personId + "order created with id--->" + this.orderId;
    };
    // craete private here 
    Person.prototype.testPrivateMethod = function () {
        return 'this is my private one-->';
    };
    // access private using previledged here 
    Person.prototype.testPreviledged = function () {
        console.log('access private using previledged here -->');
        return this.testPrivateMethod();
    };
    return Person;
}());
var p = new Person(101);
console.log('call the public method here -->' + p.createperson());
console.log('Access private outside the scope of class-->' + p.testPreviledged());
