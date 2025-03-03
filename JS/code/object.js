var obj = {
	nome: "Bart",
	sobrenome: "Simpson",
	idade: Math.floor(Math.random() * 100),
	apresentar : apresentacao,
	DarTchau : function () {
		console.log("Tchau")
	}
};

function apresentacao(){
	console.log(`Olá, meu nome é ${obj.nome} tenho ${obj.idade} anos`)
}

console.log(obj.nome, obj.sobrenome);
obj.apresentar();
obj.DarTchau();