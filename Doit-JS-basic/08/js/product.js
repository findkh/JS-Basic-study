var isOpen = false;
var cup = document.querySelector("#cup");
var smallPics = document.querySelectorAll(".small")

for(i=0; i<smallPics.length; i++) {
	smallPics[i].addEventListener("click", function() {
		newPic = this.src;
		bigPic.setAttribute("src", newPic);
	});
}

view.addEventListener("click", function(){
var view = document.querySelector("#view");
	if(isOpen == false) {
		document.querySelector("#detail").style.display = "block";
		view.innerText = "상세 설명 닫기";
		isOpen = true;
	} else {
		document.querySelector("#detail").style.display = "none";
		view.innerText = "상세 설명 보기";
		isOpen = false;
	}	
});

