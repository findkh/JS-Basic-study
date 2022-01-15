var num1 = parseInt(prompt("첫번째 값을 입력하세요"))
var num2 = parseInt(prompt("두번째 값을 입력하세요"))

addNumber(num1, num2);

function addNumber(a, b) {
    var sum = a + b;
    alert(sum);
}