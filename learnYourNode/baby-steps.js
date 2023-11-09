function sumNumbers(numbers){
    return numbers.reduce((contador,num) => contador + num,0)
}

valores = process.argv.slice(2)

numbers = valores.map(numero => parseFloat(numero));
total = sumNumbers(numbers);

console.log(total)