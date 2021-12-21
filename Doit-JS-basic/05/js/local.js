var myVar = 100; //전역변수
test();
document.write("myVar is " + myVar);

function test() { 			
	var myVar = 50; //로컬변수
	//지역변수는 전역 변수에 영향을 주지 않는다. 함수 밖을 나가면 사라진다. 
}


