    var pic = document.querySelector('#pic');
    pic.addEventListener("mouseover", changePic, false);
    //첫번째 인자 : 처리할 이벤트 유형을 지정한다. 
    //두번째 인자 : 이벤트가 발생했을 때 실행할 명령을 나열하거나 따로 함수를 만들었다면 함수 이름을 지정한다
    //세번째 인자 : 캡쳐여부
    pic.addEventListener("mouseout", originPic, false);
    
		function changePic() {			
			pic.src = "images/boy.png";
    }
    function originPic() {
      pic.src = "images/girl.png";
    }