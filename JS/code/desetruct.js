const textoNaoEstruturado = "O meu cpf é 125.123.123-22"

const regex = new RegExp("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}")

console.log(textoNaoEstruturado.match(regex)) 