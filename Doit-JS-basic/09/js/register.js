var userId = document.querySelector("#user-id");
var pw1 = document.querySelector("#user-pw1");
var pw2 = document.querySelector("#user-pw2");
console.log(userId);
console.log(pw1);
console.log(pw2);

userId.onchange = checkId;
pw1.onchange = checkPw;
pw2.onchange = comparePw;

function checkId() {
    // console.log("하하");
    //아이디 폼에 글을 입력하면 발생하는 함수

    if (userId.value.length < 4 || userId.value.length > 15) {
        alert("4~15자리의 영문과 숫자를 입력해주세요");
        userId.select();
        //select는 사용자가 기존에 입력한 값을 선택하고
    }
}

function checkPw() {
    // console.log("힝");  
    
    if (pw1.value.length < 8) {
        alert("비밀번호는 8자리 이상이어야 합니다");
        pw1.value = "";
        pw1.focus();
        //focus는 기존에 입력한 값이 지워진 자리에 새로운 값을 입력하도록 커서를 둔다.
    }
}

function comparePw() {
    // console.log("아아");

    function comparePw() {
        if(pw1.value != pw2.value) {
            alert("암호가 다릅니다. 다시 입력하세요");
            pw2.value = "";
            pw2.focus();
        }
    }
}
