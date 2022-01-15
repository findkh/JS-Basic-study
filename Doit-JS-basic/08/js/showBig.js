var bigPic = document.querySelector("#cup");
console.log(bigPic);
var smallPics = document.querySelectorAll(".small");
console.log(smallPics);

//작은 이미지는 노드 리스트에 저장되어 있기 떄문에 for문 사용해서 각 요소에 접근한다.
for(var i=0; i<smallPics.length; i++) {
    console.log(smallPics[i]);
    smallPics[i].onclick = showBig;
}

function showBig() {
    var newPic = this.src;
    console.log(newPic);
    bigPic.setAttribute("src", newPic);
}