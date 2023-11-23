let array1 = [10, "hello", 5, true, 8];

//function declaration
function sumNumbers(lista){
    let contador = 0;
    for (let i = 0; i < lista.length; i++) {
        if(typeof(lista[i])=="number")
        contador = contador + lista[i];
      }
    console.log(contador)
}
sumNumbers(array1)

///anonymous function
const total = array1.reduce((total, number) => {
  if(typeof(number)=="number"){
    return total + number
  } else {
    return total
  }
}, 0);
console.log(total)