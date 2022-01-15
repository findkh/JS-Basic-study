		var numbers = [2, 4, 6, 8, 10];

		showArray(numbers);

		// var sum = 0;
		// for(let i=0; i<numbers.length; i++) {
		// 	sum += numbers[i];
		// }
		// numbers.push(sum);
		// showArray(numbers);

		var total = [];
		totalSum = 0;
		numbers.forEach((num)=>{
			totalSum += num;
		});
		// console.log(totalSum);
		total.push(totalSum);
		showArray(total)

		;
		showArray(numbers.concat(total))
		

		function showArray(arr) {
			var str = "<table><tr>";
			for (var i=0; i<arr.length; i++) {
				str += "<td>" + arr[i] + "</td>";
			}
			str += "</tr></table>";
			document.write(str);
		}