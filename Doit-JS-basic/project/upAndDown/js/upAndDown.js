var count = 0;
var randomNum = Math.round(Math.random()*100) + 1;
console.log(randomNum);

document.querySelector("#try").onkeypress = function(e) {
    if (e.keyCode == 13) {
        // console.log("엔터누름");
        finding();
        return false;
    }
}

function finding() {
    var userNum = document.querySelector("#try").value;
    
    if (userNum >= 1 && userNum <= 100) {
        // console.log(userNum);
        if (randomNum > userNum) {
            document.querySelector("#display").innerHTML = "더 큰 수 입력";
        } else if (randomNum < userNum) {
            document.querySelector("#display").innerHTML = "더 작은 수 입력";
        } else {
            document.querySelector("#display").innerHTML = "<span style='color=red'>정답!</span>";
        }
        document.querySelector("#try").value = "";
        count++;
        document.querySelector("#counter").innerHTML = "시도횟수: " + count + "회";
    }
    else {
        alert("1과 100 사이의 숫자를 입력하세요");
    }
}