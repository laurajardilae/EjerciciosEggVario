let number = 10

function checkIsTheNumIsPrime(number){
    let esPrimo = true;
    for(i=2; i<(number/2); i++){
        if(number%i==0){
            esPrimo = false;
            break;
        }
    }
    console.log("El numero es primo: " + esPrimo)
}

checkIsTheNumIsPrime(number);
