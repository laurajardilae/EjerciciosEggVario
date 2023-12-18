const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
})

readline.question("ingrese el numero a evaluar: ", num => {
    if (checkIfTheNumIsPrime(Number(num))) {
        console.log("el numero " + num + " es primo")
    } else {
        console.log("el numero " + num + " no es primo")
    }
})

function checkIfTheNumIsPrime(number){
    let esPrimo = true;
    for(i=2; i<(number/2); i++){
        if(number%i==0){
            esPrimo = false;
            break;
        }
    }
    return esPrimo;
}


