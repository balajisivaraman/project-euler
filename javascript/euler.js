var _ = require('./underscore.js');
var multiplesOfThreeAndFive = _.reduce(_.filter(_.range(1,1000), function(num){ return num % 3 == 0 || num % 5 == 0; }), function(num1, num2){ return num1 + num2; }, 0);
console.log(multiplesOfThreeAndFive);
