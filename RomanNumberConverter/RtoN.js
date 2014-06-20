var converter = {
	"I" : 1, 
	"V" : 5, 
	"X" : 10,
	"L" : 50,
	"C" : 100,
	"D" : 500,
	"M" : 1000
}

function validateRomanNumber(num){
	var num_arr = num.split(""),
		l = num_arr.length;
	if(l == 2 && converter[num_arr[0].toUpperCase()] == 1) 
		return true;
	for (var i = 0; i < num_arr.length; i++) {
		if(typeof num_arr[i+1] != 'undefined' && (converter[num_arr[i].toUpperCase()] < converter[num_arr[l-1].toUpperCase()])){
			return false;
		}
		if(!converter.hasOwnProperty(num_arr[i].toUpperCase()))
			return false;
	}
	return true;
}

function getNumberForRoman(n){
	var num_arr = n.split(""),
		sum = 0;
	for (var i = 0 ; i < num_arr.length; i++) {
		if(typeof num_arr[i+1] != 'undefined' && (converter[num_arr[i].toUpperCase()] < converter[num_arr[i+1].toUpperCase()])){
			sum += (converter[num_arr[i+1].toUpperCase()] - converter[num_arr[i].toUpperCase()]);
			i++;
		}
		else 
			sum += converter[num_arr[i].toUpperCase()];
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