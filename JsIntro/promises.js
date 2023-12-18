let datosDiponibles = true;

//La funcion retorna una promesa
function fetchData(){
    return prometoObtenerDatos = new Promise(function(myResolve, myReject){
        if(datosDiponibles){
            console.log("Obteniendo datos...")
        setTimeout(()=>{
            myResolve("---Datos---")
        },2000)
        } else {
            myReject("Los datos no se encuentran disponibles")
        }
    });
}

//Llamo la funcion que retorna la promesa y consumo la promesa con then
fetchData()
    .then((datos)=>console.log("Datos obtenidos exitosamente \n" + datos))
    .catch((mensaje)=>console.log(mensaje))
