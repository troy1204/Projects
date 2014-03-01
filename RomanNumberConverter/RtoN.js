var converter = {
	"I" : 1, 
	"V" : 5, 
	"X" : 10,
	"L" : 50,
	"C" : 100,
	"D" : 500,
	"M" : 1000,
	"i" : 1, 
	"v" : 5, 
	"x" : 10,
	"l" : 50,
	"c" : 100,
	"d" : 500,
	"m" : 1000
}

function validateRomanNumber(num){
	var num_arr = num.split("");
	for (var i = num_arr.length - 1; i >= 0; i--) {
		if(!converter.hasOwnProperty(num_arr[i]))
			return false;
	}
	return true;
}

function getNumberForRoman(n){
	var num_arr = n.split(""),
		sum = 0;
	for (var i = 0 ; i < num_arr.length; i++) {
		if(converter[num_arr[i]] < converter[num_arr[i+1]]){
			sum += (converter[num_arr[i+1]] - converter[num_arr[i]]);
			i++;
		}
		else 
			sum += converter[num_arr[i]];
	}
	return sum;
}

function romanToNumber(roman){
	var r = roman;
	if(!validateRomanNumber(r)){
		document.getElementById("output").innerHTML = "Not a valid input. Try again!";
		return 0;
	}
	var result = getNumberForRoman(r);
	return result;
}