function media (num){
   
   let soma = 0

 num.forEach(num => {
 	soma += num
 })
  
  const media = soma / num.length 

  return media 
}


console.log(media([25, 75]))