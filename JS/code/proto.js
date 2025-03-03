function Simpson(name, age, hairColor) {
	this.name = name;
	this.age = age;
	this.hairColor = hairColor;

	this.sobrenome = "Simpson";

};

Simpson.prototype.apresentar = function apresentacao(){
	console.log(`Meu nome é ${Bart.name} ${Bart.sobrenome}`)
};

let Bart = new Simpson("Bart", 10, "Amarelo")
console.log(Bart);
kevin.apresentar();


Simpson.prototype.DarTchau = function() {
	console.log("Tchau")
};

Simpson.DarTchau();