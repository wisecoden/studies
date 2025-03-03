/* var x = 07777;
 y = 56.955556
 t = 500e5

console.log(x.toString(16))
console.log(y.toFixed(2))
console.log(t.toExponential())
*/ 

var array = "Edward Ojonhson Carninger".split(" ");
console.log(array.toString())

console.log(array.join(" | "))

//Adicionar
console.log(array)
 	array.push("Klops")
	console.log(array)

//adicionar no inicio
	array.unshift("Derrick")
	console.log(array)

//tirar o último 
	array.pop()
	console.log(array)

//tirar o primeiro 
	element = array.shift()
	console.log(element)
	console.log(array)

	slice = array.slice(1, 3)
	console.log(slice)

	splice = array.splice(1, 1, "Derrick", "Klops")
	console.log(splice)
	console.log(array)

	array = array.concat(splice, slice)
	console.log(array)