function attachMouseEvent(){
	var divs = document.getElementById("container").getElementsByTagName("div");
	for (var i = divs.length - 1; i >= 0; i--) {
		divs[i].onmousedown = function showCross(d){
				d.target.innerHTML = "X";
				console.log("foo");
				console.log(d);
			}
	}
}

function initialise(){
	attachMouseEvent();
}