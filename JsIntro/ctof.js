const celsiusTemperatures = [10,20,30];

///Function declaration
function celsiusToFahrenheit(temperatures){
    let fahrenheitTemperatures = [];
    ///Uso del ciclo let of para recorrer objetos iterables
    for(let celsius of temperatures){
        fahrenheitTemperatures.push(celsius*1.8+32)
    }
    return fahrenheitTemperatures;
}
console.log(celsiusToFahrenheit(celsiusTemperatures))

///Function expression
const celsiusToFahrenheit2 = (temperatures) => {
    let fahrenheitTemperatures = [];
    for(let celsius of temperatures){
        fahrenheitTemperatures.push(celsius*1.8+32)
    } 
    return fahrenheitTemperatures; 
}
console.log(celsiusToFahrenheit2(celsiusTemperatures))

///Anonymous function
const fahrenheitTemperatures2 = celsiusTemperatures.map(celsius => celsius * 1.8 + 32);
console.log(fahrenheitTemperatures2)

///

