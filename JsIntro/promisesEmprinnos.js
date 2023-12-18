let teHasPortadoBien = true;

//defino la promesa
const siMePortoBien = new Promise((resolve, reject) => {
    if(teHasPortadoBien){ //te ganas un telefono de premio
        const telefono = {
            modelo: "iPhone 14",
            color: "Lila"
        };
        resolve(telefono)
    } else {
        reject("te has portado mal")
    }
})

//Defino las funciones de lo que sucedera en caso de que se cumpla o no la promesa
const promesaCumplida = (resolvedValue) => {console.log(`Te regalo un nuevo ${resolvedValue.modelo}`)}
const promesaRota = (rejectedValue) => {console.log(`No te compro nada porque ${rejectedValue}`)}

//Consumo de la promesa
const pidoRegalo = () => {
    siMePortoBien
        .then(promesaCumplida)
        .catch(promesaRota)
}

pidoRegalo();


///////////

//creo una funcion que retorna una promesa
const chequeaComportamiento = (comportamiento) =>{
    return new Promise((resolve, reject) => {
        if(comportamiento){ //te ganas un telefono de premio
            const telefono = {
                modelo: "iPhone 14",
                color: "Lila"
            };
            resolve(telefono)
        } else {
            reject("te has portado mal")
        }
    })
}

//async await
async function pideTelefonoNuevo(comportamiento){
    try{
        await chequeaComportamiento(comportamiento);
    } catch(error){
        console.log(error);
    }
}

pideTelefonoNuevo(false)