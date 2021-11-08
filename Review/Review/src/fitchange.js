// 과제1
// 1ft에 3.5달러이고
// 창문은 300mm*200mm인 창문의 자재 값을 구하라

const fitperdoller = 3.5
let winwidth = (((300*2)/10)/2.54)/12
let winhight = (((200*2)/10)/2.54)/12
let totalcost = (winwidth+winhight)*fitperdoller

console.log("가격은" +totalcost.toFixed(2) + "달러 입니다")
//mm에서 cm로 바꾸려면 /10을한다
//cm를 2.54로 나누면 inch
//inch를 12로 나누면 피트가 된다
//가로 세로를 피트로 계산한후 피터당가격을 곱해준 다음 소숫점 두째자리까지만 나오게 toFixed(2)를 사용한다
//11.48 달러가 나온다.


