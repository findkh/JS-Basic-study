//홀짝 프로그램 만들기
const prompt = require('prompt-sync')()
const num = parseInt((Math.random()*100) % 2)
console.log(num)

// 사용자에게 입력 받아야 함
const answer = prompt("ODD O? EVEN E?")
//num이 0이고 answer가 E
const condition1 = num === 0 && answer === "E"
//num이 1이고 answer가 O
const condition2 = num === 1 && answer === "O"

// if( condition1 || condition2){
//     console.log("정답")
//     return
// }
//     console.log("오답")

//return : 실행의 제어권은 전환

const result = condition1 || condition2 ? "정답":"오답"
console.log(`최종결과는 ${result}`)