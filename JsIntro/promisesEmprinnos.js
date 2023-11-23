let teHasPortadoBien = false;

const siMePortoBien = new Promise((resolve, reject) => {
    if(teHasPortadoBien){
        const telefono = {
            modelo: "iPhone 15",
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
siMePortoBien.then(promesaCumplida, promesaRota);